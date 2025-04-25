class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();
        int i=0;
        while(i < candies.length){
            candies[i] = candies[i] + extraCandies;
            res.add(isgreat(candies,i));
            candies[i] = candies[i] - extraCandies;
            i++;
        }
        return res;
    }
    public Boolean isgreat(int[] arr,int index){
        int i = 0;
        int original = arr[index];
        int max = arr[index];
        while(i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return (original == max);
    }
}