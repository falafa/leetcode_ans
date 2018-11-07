class Solution(object):
	def fourSumCount(self, A, B, C, D):
        r = collections.Counter(a+b for a in A for b in B)
        return sum(r[-c-d] for c in C for d in D)