// User function Template for Java
class Solution {
    public String removeCharacter(String s, int pos) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i!=pos){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}