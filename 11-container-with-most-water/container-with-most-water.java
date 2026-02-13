class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int maxArea = 0;
        while(left < right) {
            int length = Math.min(arr[left], arr[right]);
            int width = right-left;
            int currArea = length * width;
            if(currArea > maxArea) {
                maxArea = currArea;
            } else if(arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}