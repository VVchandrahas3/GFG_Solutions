// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == 0) {
                if (res.isEmpty() || res.get(res.size() - 1).get(0) != arr[i]) {
                    ArrayList<Integer> p = new ArrayList<>();
                    p.add(arr[i]);
                    p.add(arr[j]);
                    res.add(p);
                }
                i++;
                j--;
            } else if (sum < 0) {
                i++;
            } else {
                j--;
            }
        }

        return res;
    }
}
