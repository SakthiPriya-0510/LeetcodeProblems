class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        int i,j;
        for(i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    int val=pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j);
                    row.add(val);
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}
