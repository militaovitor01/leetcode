class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char[] sWord = s.toCharArray();
        char[] tWord = t.toCharArray(); 

        Arrays.sort(sWord);
        Arrays.sort(tWord);

        if(sWord.length == tWord.length){
            for(int i = 0; i < sWord.length; i++){
                if(!(sWord[i] == tWord[i])){
                    return false;
                }
            }
        }else{
            return false;
        }
    
        return true;            
    }
}