class Solution {
    public int reverse(int x) {
         if(x >= Integer.MAX_VALUE ||  x <= Integer.MIN_VALUE) return 0;
        String str1 = String.valueOf(x);
        if(x >= 0){
            long res = get(x);
            if(res >= Integer.MAX_VALUE ||  res <= Integer.MIN_VALUE) return 0;
            return (int)(res);
        }
        String str2 = "";
        for(int i = 1; i < str1.length(); i++){
            str2 = str2 + str1.charAt(i);
        }
        int num = Integer.valueOf(str2);
        long res =Long.parseLong("-"+get(num));
        if(res >= Integer.MAX_VALUE ||  res <= Integer.MIN_VALUE) return 0;
        return (int)(res);
        
    }
    public static long get(int x){
        long n = 0;
        while(x != 0){
            n = (n * 10) + x % 10;
            x /= 10;
        }
        return n;
    }
    
}