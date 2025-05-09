class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> combinedList = new ArrayList<>();
        double median = 0.0;
        // Add elements from arr1
        for (int num : arr1) {
            combinedList.add(num);
        }

        // Add elements from arr2
        for (int num : arr2) {
            combinedList.add(num);
        }
        Collections.sort(combinedList);
        
        int n = combinedList.size();
       System.out.println(combinedList);
        if(n % 2 == 0){
           
            median = (combinedList.get(n/2) + combinedList.get( (n/2)-1 )) / 2.0;
            return median;
        }
        else{
            median = combinedList.get( n/2 );
            return median;
        } 
     
    }
}