class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int index = arr[arr.length -1].length();
        return index;
    }
}