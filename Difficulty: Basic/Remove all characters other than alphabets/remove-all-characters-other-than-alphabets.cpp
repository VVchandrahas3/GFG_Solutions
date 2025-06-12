// User function template for C++

class Solution {
  public:
    string removeSpecialCharacter(string s) {
        // code here
       string S;
        for (char ch : s) {
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                S += ch;
            }
        }
        if (S == "") {
            return to_string(-1); 
        }
        return S;
    }
};