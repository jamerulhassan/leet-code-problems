class Solution {
    public int[] productExceptSelf(int[] arr) {
    List<Integer> result = new ArrayList<>();
    for (int num : arr) {
        result.add(num);  // auto-boxing from int to Integer
    }
    int product1 = 1;
    int product2 = 1;
    int product3 = 1;
    int[] res = new int[arr.length];
    boolean isZero = result.contains(0);
    boolean isAllZero = true;
    int count = 0;
    if(isZero){
        for (int num : arr) {
            if(num != 0){
                product1 *= num;
                isAllZero = false;
            }
            else{
                count++;
            }
        }
        if(isAllZero){
            product1 = 0;
        }
    }
    else{
        for (int num : arr) {
                product2 *= num;
        }
    }
    System.out.println(count);
    if (count > 1){
        for(int i = 0;i < arr.length ; i++){
            res[i] = 0 ;
        }
    }
    else if(isZero){
        for(int i = 0;i < arr.length ; i++){
            if(arr[i] == 0){
                res[i] = product1;
            }
            else{
                res[i] = 0;
            }
        }
    }
    
    else{
        for(int i = 0;i < arr.length ; i++){
            res[i] = product2 / arr[i] ;
        }
    }


/*     int i=0;
    int product = 1;
    boolean isZero = false;
    boolean isAllZero = false;
    for (int num : arr) {
        if(num != 0){
            product *= num;
        }
        else{
            isZero = true;
        }
    }
    if(product == 1){
        isAllZero = true;
    }
    for(int j=0;j < res.length;j++){
        if(isAllZero){
            res[j] = 0;
        }
        else if(isZero && arr[j] == 0){  
                res[j] = product;
        }
        else if(isZero && arr[j] != 0 ){
            res[j] = 0 ;
        }
        else{
            res[j] = product / arr[j];
        }

    } */
    return res;
    }
}