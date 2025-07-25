class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        ArrayList<Integer> mergedList = new ArrayList<>();

        if(m == 0){
             System.out.println("hello");
            for(int c : nums2){
                mergedList.add(c);
            }
            alterNums1(mergedList, nums1);
            return;
        }
        if(n == 0){
             System.out.println("hello");
            for(int c : nums1){
                mergedList.add(c);
            }
            alterNums1(mergedList, nums1);
            return;
        }
        
        int i = 0, j = 0, k = 0;
        while(i != nums1.length - nums2.length){
            if(j == n){
                mergedList.add(nums1[i++]);
                
            }
            System.out.println("hello");
            if(j != n && nums1[i] >= nums2[j]){
                mergedList.add(nums2[j++]);
            }
            else if(j != n && nums1[i] <= nums2[j]){
                mergedList.add(nums1[i++]);
            }
        }
        while(j != n){
            mergedList.add(nums2[j++]);
        }
        alterNums1(mergedList, nums1);
    }
    public static void alterNums1(ArrayList<Integer> list, int[] nums1){
        for(int i =0 ; i < list.size();i++){
            nums1[i] = list.get(i);
        }
    }
}