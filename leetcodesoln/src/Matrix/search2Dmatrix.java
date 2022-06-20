package Matrix;

public class search2Dmatrix {
    public static boolean search(int[][] mat,int target)
    {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=111;
        System.out.println(search(matrix,target));
    }
}
