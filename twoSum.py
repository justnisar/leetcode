from sets import Set
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        count = 0
        for i in nums :
            nums[count] = (nums[count],count + 1)
            count = count + 1
        nums.sort()
        i = 0
        j = len(nums) - 1
        while i < j :
            sum = nums[i][0] + nums[j][0]
            if sum < target :
                i = i + 1
            elif sum > target :
                j = j - 1
            else :
                li = []
                li.append(nums[i][1])
                li.append(nums[j][1])
                li.sort()
                return li
