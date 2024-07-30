import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[][] arr={{18,9,12},{36,-4,91},{44,33,16}};
        int target;
        System.out.println(Arrays.toString(findElement(arr, 91)));
       
    }
    
    static int[] findElement(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};   //how to get the index position of two D arrays le this
                    //return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};// Return null if target not found
    }
}
