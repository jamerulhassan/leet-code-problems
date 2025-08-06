class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++){
            String str1 = list1[i];
            for(int j = 0 ; j < list2.length; j++){
                String str2 = list2[j];
                if(str1.equals(str2) && (min > i + j || min == i+j)){
                    if(min > i + j){
                        list.clear();
                        list.add(str2);
                        min = i + j;
                        break;
                    }else{
                        min = i + j;
                        list.add(str2);
                        break;
                    }
                    
                }
            }
        }

        String[] arr = new String[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}