public class Q_06_Richest_wealth {
    public static void main(String[] args) {
        int[][] arr ={
            {32,32,3,2,3,2},
            {34,32,32,2,32,23,2,2},
            {323,3,2,3,65,67,87}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int i =0;i<accounts.length;i++){
            int temp = 0;
            for(int j = 0;j<accounts[i].length;j++){
                temp+=accounts[i][j];
            }
            res = Math.max(res,temp);
        }
        return res;
    }
}
