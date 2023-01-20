package O3.Arrays;

public class multiArray {
    public static void main(String[] args) {
        int[][] grid = {
            {3,5,55},
            {2,4}, // [1] row index 1 // number 4 is index 1 within that row
            {5,6}
        };
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        for(int row=0;row<grid.length;row++){
            for(int col=0; col<grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
