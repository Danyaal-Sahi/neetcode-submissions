class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet <>();
        int count = 0;
        int temp = 0;
        int max = 0;
        
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i = 0;i<nums.length;i++)
        {
            if (!(set.contains(nums[i]-1)))
            {
                temp = nums[i];
                max = Math.max(count,max);
                count = 0;
             while(set.contains(temp)){
                count=count+1;
                temp=temp+1;
             }   
            }
        max = Math.max(count,max);

        }

        return max;
    }
}
