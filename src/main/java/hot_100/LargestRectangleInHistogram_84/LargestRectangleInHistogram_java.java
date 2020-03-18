package hot_100.LargestRectangleInHistogram_84;

public class LargestRectangleInHistogram_java {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j >=0 ; j--) {
                minHeight=Math.min(minHeight,heights[j]);
                maxArea=Math.max(maxArea,minHeight*(i-j+1));
            }
        }
        return maxArea;
    }
}
