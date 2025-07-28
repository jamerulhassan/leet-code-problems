class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] temp1,temp2;
        if(nums1.length <= nums2.length){
            temp1 = nums1;
            temp2 = nums2;
        }
        else{
            temp1 = nums2;
            temp2 = nums1;
        }
        for(int firstIndex = 0; firstIndex < temp2.length; firstIndex++){
            int secondIndex = linearSearch(temp2[firstIndex], temp1);
            if(secondIndex >= 0){
                getList(firstIndex, secondIndex, list, temp1, temp2);
            }
        }
        int[] res = new int[list.size()] ;
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public static void getList(int i, int j, ArrayList<Integer> list,int[] arr1, int[] arr2){
        while(i < arr2.length && j < arr1.length){
            if(arr2[i] == arr1[j]){
                if(list.indexOf(arr2[i]) < 0){
                    list.add(arr2[i]);
                }
            }
            i++;
            j++;
        }
    }
    public static int linearSearch(int target, int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i; 
            }
        }
        return -1;
    }
}