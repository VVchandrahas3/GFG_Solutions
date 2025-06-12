class Solution {
  public:
    string modify(string& s) {
       int N=s.length();
        string S="";
        for(char ch:s){
            if(ch!=' ')
            {
                S+=ch;
            }
        }
        return S;
    }
};