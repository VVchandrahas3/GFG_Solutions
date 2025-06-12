// User function template for C++
class Solution {
  public:

    string removeVowels(string& s) {
        int N=s.length();
        string S="";
        for(int i=0;i<N;i++)
        {
            char ch=tolower(s[i]);
            if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'){
                S+=ch;
            }
        }
        return S;
    }
};