class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        System.out.print(ruleKey);
        int i = (ruleKey.equals("color")) ? 1 : (ruleKey.equals("name")) ? 2 : 0;
        for(int j = 0;j < items.size();j++){
            if(items.get(j).get(i).equals(ruleValue)){
                ++count;
            }
        }
        return count;
    }
}