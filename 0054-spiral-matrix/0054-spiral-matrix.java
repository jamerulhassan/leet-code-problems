class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        getList(matrix, ans, 0, matrix.length-1, 0 ,matrix[0].length-1);
        return ans;
    }
    static void getList(int[][] arr, ArrayList<Integer> ans,int rs,int re,int cs,int ce){
        if(rs > re || cs > ce){
            return;
        }

        //top
        for(int i = cs; i <= ce;i++){
            ans.add(arr[rs][i]);
        }
        rs++;

        //rigth
        for(int i = rs ; i <= re;i++){
            ans.add(arr[i][ce]);
        }
        ce--;

        //down
        if(rs <= re){
            for(int i = ce ; i >= cs;i--){
                ans.add(arr[re][i]);
            }
            re--;
        }

        //left
        if(cs <= ce){
            for(int i = re;i >= rs;i--){
                ans.add(arr[i][cs]);
            }
        }
        getList(arr,ans,rs,re,cs,ce);
    }
}