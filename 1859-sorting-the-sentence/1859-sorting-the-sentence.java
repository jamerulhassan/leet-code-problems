class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        String res = "";
        for(int i = 1;i <= arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                int last = Integer.parseInt(arr[j].substring(arr[j].length()-1,arr[j].length()));
                if(i == last && i < arr.length){
                    res = res + arr[j].substring(0,arr[j].length()-1) + " ";
                }
                if(i == last && i == arr.length){
                    res = res + arr[j].substring(0,arr[j].length()-1);
                }
            }
        }
        return res;
    }
}