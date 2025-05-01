class Solution {
    public int[] plusOne(int[] arr) {
       
        return getArray(arr);
    }
    static int[] getArray(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int k=1;
        int i = arr.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += arr[i];
                i--;
            }
            list.add(k % 10);
            k /= 10;
        }
        Collections.reverse(list);
        int[] array = new int[list.size()];
        for (int u = 0; u < list.size(); u++) {
            array[u] = list.get(u);
        }
         return array;
    }
    static long getNumber(int[] arr){
        long n = 0 ;
        for(int i=0;i < arr.length;i++){
            n = n * 10 + arr[i];
            System.out.println(n);
        }
        System.out.println(n);
        return n;
    }
}   