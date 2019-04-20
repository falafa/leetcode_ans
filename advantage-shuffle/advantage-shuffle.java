/***
2rules:
1.we should always first satisfy the biggest element of B,because they are the hardest to satisfy.
2.if the biggest value of A can nor satisfy current value of B,nothing can satisfy.

***/
class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int n=A.length;
        int[] res= new int[n];
        PriorityQueue<int[]> pq= new PriorityQueue<>(new Comparator<int[]>(){//内部构造函数
            public int compare(int[] a, int[] b){//creat a priorityQueue which sorts with value of B in decreasing order.
                return b[0]-a[0];
            }
        });
        for (int i=0; i<n; i++) pq.add(new int[]{B[i], i});//initialize the pq with B 
        int lo=0, hi=n-1;
        while(!pq.isEmpty()){//while pq is empty
            int[] cur= pq.poll();//extract the value and index of the biggest element of B
            int idx=cur[1], val=cur[0];
            if (A[hi]>val) res[idx]=A[hi--];//if A[hi]>val,it means A can satisfy current value of B 
            else res[idx]=A[lo++];//else B can not be satisfied,we put the smallest element in that slot
        }
        return res;
    }  
}

class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int n=A.length;
        int[] res= new int[n];
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[0]-a[0]);//lambda表达式写法 简化了
        for (int i=0; i<n; i++) pq.add(new int[]{B[i], i});
        int lo=0, hi=n-1;
        while(!pq.isEmpty()){
            int[] cur= pq.poll();
            int idx=cur[1], val=cur[0];
            if (A[hi]>val) res[idx]=A[hi--];
            else res[idx]=A[lo++];
        }
        return res;
    }  
}
