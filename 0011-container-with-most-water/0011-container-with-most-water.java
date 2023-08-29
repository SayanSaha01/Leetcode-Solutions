class Solution {
    public int maxArea(int[] height) {
        int maxVal = 0;
        int area =0;
        int i=0, j= height.length-1;   
        while(i<j){
            area = (j-i) * Math.min(height[i], height[j]);
            maxVal = Math.max(area, maxVal);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return maxVal;
    }
}