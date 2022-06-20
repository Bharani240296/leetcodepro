package Matrix;

public class richestleet {
    public static int richest(int[][] matrix)
    {
        int ans=0;
        for (int i = 0; i < matrix.length; i++) {
            int max=0;
            for (int j = 0; j < matrix[i].length; j++) {
                max=max+matrix[i][j];
                ans=Math.max(ans,max);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int[][] matrix={{1,2,3},{4,5,6}};
        System.out.println(richest(matrix));
    }
}
