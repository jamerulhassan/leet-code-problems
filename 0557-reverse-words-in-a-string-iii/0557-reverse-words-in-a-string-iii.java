class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            // Reverse the word and append to result
            for (int j = word.length() - 1; j >= 0; j--) {
                res.append(word.charAt(j));
            }

            // Add space between words (but not after the last one)
            if (i < arr.length - 1) {
                res.append(' ');
            }
        }

        return res.toString();
    }
}
