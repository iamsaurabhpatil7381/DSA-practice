import java.util.*;

public class Flipping {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        
        // Calling the flipAndInvert method and printing the result
        System.out.println(Arrays.deepToString(flipAndInvert(image)));
    }

    static int[][] flipAndInvert(int[][] image) {
        // Iterate over each row of the image
        for (int[] row : image)
         {
            // Reverse and invert each row
            for (int i = 0; i < (image[0].length + 1) / 2; i++) 
            {
               
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
