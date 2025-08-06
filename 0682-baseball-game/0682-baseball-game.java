class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String str : operations){
            if(str.charAt(0) >= 48 && str.charAt(0) <= 57 || str.charAt(0) == 45){
                int no = Integer.parseInt(str);
                System.out.println(no);
                list.add(no);
            }
            else if(str.equals("+")){
                System.out.println("sd");
                list.add(list.get(list.size()-1) + list.get(list.size()-2));
            }
            else if(str.equals("C")){
                 System.out.println("sd");
                list.remove(list.size()-1);
            }
            else if(str.equals("D")){
                 System.out.println("sd");
                list.add(list.get(list.size()-1) * 2);
            }
        }
        int sum = 0;
        System.out.println(list);
        for(int i = 0 ; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }
}