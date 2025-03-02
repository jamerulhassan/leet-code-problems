class Solution {
    public int romanToInt(String s) {
        int sum=0,k=0;
        char[] arr=s.toCharArray();
        for(int i=0;i < arr.length;i++){
            if(i < arr.length-1){
                k=i+1;
            }
            if(i == arr.length-1){
                k=i;
            }
            if(arr[i] == 'I'){
                if(arr[k] == 'V' || arr[k] == 'X'){
                    sum=sum+(-1);
                    continue;
                }
                sum=sum+1;
                continue;
            }
            if(arr[i] == 'X'){
                if(arr[k] == 'L' || arr[k] == 'C'){
                    sum=sum+(-10);
                    continue;
                }
                sum=sum+10;
                continue;
            }
            if(arr[i] == 'C'){
                if(arr[k] == 'D' || arr[k] == 'M'){
                    sum=sum+(-100);
                    continue;
                }
                sum=sum+100;
                continue;
            }
            switch (arr[i]){
                case 'V':
                    sum=sum+5;
                    break;
                case 'L':
                    sum=sum+50;
                    break;
                case 'D':
                    sum=sum+500;
                    break;
                case 'M':
                    sum=sum+1000;
                    break;
            }
        }
        return sum;
    }
}