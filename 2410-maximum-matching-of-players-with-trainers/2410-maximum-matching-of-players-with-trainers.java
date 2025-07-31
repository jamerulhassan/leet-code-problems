class Solution {
    public int matchPlayersAndTrainers(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        if(s.length == 0 || g[0] > s[s.length-1]) return 0;
        int index = 0, count = 0;
        Boolean isObtained = false;
        for(int i = 0 ; i < g.length; i++){
            int greed = g[i];
            for(int j = index; j < s.length;j++){
                System.out.println(index);
                if(greed <= s[j]){
                    count++;
                    index = j + 1;
                    break;
                }
            }
        }
        return count;
    }
}