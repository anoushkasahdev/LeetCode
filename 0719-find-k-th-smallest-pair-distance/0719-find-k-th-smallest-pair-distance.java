class Solution {
    public int smallestDistancePair(int[] nums, int k) {

        Arrays.sort(nums);

        int low=0;
        int high=nums[nums.length-1]-nums[0];

        while(low<high)
        {
            int mid=low+(high-low)/2;

            if(countPairs(nums,mid)<k)
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }

        return low;
        
    }

    public int countPairs(int nums[],int diff)
    {
        int count=0;
        int left=0;
        
        for(int right=0;right<nums.length;right++)
        {
            while(nums[right]-nums[left]>diff)
            {
                left++;
            }

            count+=right-left;

        }
return count;
    }
}