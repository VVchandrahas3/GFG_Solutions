class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
         int l = 0, r = arr.length - 1, ans = -1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(arr[m] <= x) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}
