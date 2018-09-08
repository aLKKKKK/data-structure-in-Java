public class Solution {
    public String replaceSpace(StringBuffer str) {
    	if (str == null) return str.toString();
        StringBuffer output = new StringBuffer();
        for (int i = 0; i < str.toString().length(); i++) {
            char temp = str.charAt(i);
            if(String.valueOf(temp).equals(" ")){
                output.append("%20");
            }
            else{
                output.append(temp);
            }
        }
        return output.toString();
    }
}
