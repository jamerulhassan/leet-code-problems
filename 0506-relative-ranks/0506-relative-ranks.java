class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> reverse = Arrays.stream(score).boxed().collect(Collectors.toList());
        Collections.sort(reverse, Collections.reverseOrder());
        List<Integer> original = Arrays.stream(score).boxed().collect(Collectors.toList());
        ArrayList<String> price = new ArrayList<>(Arrays.asList("Gold Medal","Silver Medal","Bronze Medal"));
        String[] ans = new String[score.length];
        int count = 0;
        for(int i = 0; i < ans.length; i++){
            int val = reverse.get(i);
            int index = original.indexOf(val);
            if(count <= 2){
                ans[index] = price.get(count++);
            }
            else{
                ans[index] = count++ + 1 +"";
            }
        }
        return ans;
    }
}