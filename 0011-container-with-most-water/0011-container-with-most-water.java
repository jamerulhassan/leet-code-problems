class Solution {
    public int maxArea(int[] arr) {
        int left = 0, right = arr.length - 1;
        int ans = 0;
        while(left < right){
            int tempMin = arr[left] < arr[right] ? arr[left] : arr[right];
            ans = (ans < tempMin * (right - left)) ? tempMin * (right - left) : ans;
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return ans;
    }
}
/* 
57 test cases passed
int maxPtr = 0;
        int ans= 0;
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){ 
            maxPtr = arr[i];
            for(int j = i + 1 ; j < arr.length ; j++){
                count += 1;
                int min = maxPtr < arr[j] ? maxPtr : arr[j];
                ans = (ans < min * count) ? min * count : ans;
                
            }
            count = 0;
        }
        return ans;
 */
/* 
int width = arr.length == 2 ? 1 : 0;
        int max = 0 , maxIndex = 0;
        int secondMax = 0 , secondMaxIndex = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        for(int j = 0 ; j < arr.length; j++){
            if(secondMax < arr[j] && j != maxIndex && arr[j] != max){
                secondMax = arr[j];
                secondMaxIndex = j;
            }
        }
        if(width != 1){
            width =(maxIndex-secondMaxIndex<0)?-(maxIndex-secondMaxIndex):maxIndex-secondMaxIndex;
        }
        System.out.println(maxIndex + " " +secondMaxIndex);
        System.out.println(max + " " +secondMax+" "+ width);
        return (width * secondMax);

 */
/* 
int width = arr.length == 2 ? 1 : 0;
        int max = arr[0], highIndex = 0;
        int secondMax = arr[0], lowIndex = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                highIndex = i;
                max = arr[i];
            }
            if(secondMax <= arr[i]){
                lowIndex = max != arr[i] ? i : lowIndex;
                secondMax = arr[i];
            }
        }
        width = (highIndex - lowIndex < 0) ? -(highIndex - lowIndex) :  highIndex - lowIndex;
        System.out.println(highIndex + " " +lowIndex);
        System.out.println(max + " " +secondMax+" "+ width);
        return (width * secondMax);
 */