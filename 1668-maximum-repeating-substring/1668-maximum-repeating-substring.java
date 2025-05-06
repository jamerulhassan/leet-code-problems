class Solution {
    public int maxRepeating(String sequence, String word) {
        /* int count = 0;
        return updateCount(word,sequence,count); */
        String add = word;
        int count = 0;
        int max = 0;
         System.out.println(word);
        while(sequence.contains(word)){
            count = count + 1;
            word += add;
            System.out.println(word);
        }
        return count;
    }
}