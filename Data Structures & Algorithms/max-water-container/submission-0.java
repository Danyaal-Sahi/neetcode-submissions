class Solution {
    public int maxArea(int[] heights) {
        int small = 0;
        int large = heights.length - 1;
        int max = 0;

        max = Math.max(max,(Math.min(heights[small],heights[large])) * (large-small));
        while(small != large){

            if (heights[small] >= heights[large])
            {
                large=large-1;
            }
            else if (heights[large] > heights[small])
            {
                small=small+1;
            }
            int temp = Math.min(heights[small],heights[large]);

            max = Math.max(max,temp * (large-small));

        }
        return max;
        
    }
}
