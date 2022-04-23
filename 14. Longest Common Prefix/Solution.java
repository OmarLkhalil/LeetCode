class Solution {
    public String longestCommonPrefix(String[] strings) {
        String prefix = strings[0];
        if(strings.length ==0) return "";
        for(int i=1; i<strings.length; i++){
            while(strings[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
        
    }
}
