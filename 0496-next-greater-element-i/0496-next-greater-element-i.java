class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int n: nums2){
            list.add(n);
        }
        for(int i = 0 ; i < nums1.length; i++){
            int val = nums1[i];
            int indexOfNums2 = list.indexOf(val);
            int max = val;
            if(indexOfNums2 == nums2.length - 1){
                ans.add(-1);
            }
            else{
                for(int j = indexOfNums2 + 1; j < nums2.length;j++){
                    max = max < nums2[j] ? nums2[j] : max ;
                    if(val < max){
                        ans.add(max);
                        break;
                    }
                }
                if(val == max){
                    ans.add(-1);
                }
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0 ; i < ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}