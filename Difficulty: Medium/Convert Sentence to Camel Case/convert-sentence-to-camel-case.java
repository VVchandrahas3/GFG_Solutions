class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        
        // add first character (since loop starts from 1)
        sb.append(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if((s.charAt(i-1) == ' ') && (s.charAt(i) != ' ')){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else if(s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
