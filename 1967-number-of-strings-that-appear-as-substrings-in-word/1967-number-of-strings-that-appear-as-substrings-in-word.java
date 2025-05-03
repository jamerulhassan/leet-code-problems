class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int i = 0;
        for(String str : patterns){
           if(word.contains(str)){
            i++;
           }
        }
        return i;
    }
}