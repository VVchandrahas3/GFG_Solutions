class Solution {
  public:
    // Function to calculate sum of all numbers present in a string.
    int findSum(string& s) {
        string temp = "";
        int sum = 0;

        for (char ch : s) {
            if (isdigit(ch)) {
                temp += ch;
            } else {
                if (!temp.empty()) {
                    sum += stoi(temp);
                    temp = "";
                }
            }
        }

        // Add the last number if the string ends with digits
        if (!temp.empty()) {
            sum += stoi(temp);
        }

        return sum;
    }
};
