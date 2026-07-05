class Solution {
    public int maxArea(int[] height) {
        int lp=0, rp=height.length-1, maxWater=0;
        int wdth, hgt;
        while(lp<rp){
            wdth = rp-lp;
            hgt = Math.min(height[lp], height[rp]);
            int currWater = wdth*hgt;
            maxWater = Math.max(currWater, maxWater);
            if(height[lp] < height[rp]) lp++;
            else rp--;
        }
        return maxWater;
    }
}