class Solution(object):
    def trailingZeroes(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = 0
        i = 1
        num = 1
        while num <= n :
            num = 5**i
            count = count + n/num
            i = i + 1
        return count
