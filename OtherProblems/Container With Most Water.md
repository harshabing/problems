![question_11](https://user-images.githubusercontent.com/19921971/52524653-5cb60180-2c6d-11e9-9189-67bc951a040c.jpg)


# Container With Most Water

class Solution {
    public int maxArea(int[] heights) {
        
        int maxS = 0;
        int l = 0;
        int r = heights.length - 1;
        
        while (l < r) {
            int curS = Math.min(heights[l], heights[r]) * (r - l);
            if (curS > maxS) {
                maxS = curS;
            }
            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        
        return maxS;
    }
}

