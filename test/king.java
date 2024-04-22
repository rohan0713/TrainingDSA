package test;

import java.util.Scanner;

public class king {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] board = new int[2][2];
        int row_pos = s.nextInt();
        int column_pos = s.nextInt();


        boolean isPresent = isSafe(board, row_pos, column_pos);
        if (isPresent){
            System.out.println("not safe");
        }else {
            System.out.println("safe");
        }
    }

    private static boolean isSafe(int[][] board, int rowPos, int columnPos) {

        // camel case
        int r = rowPos;
        int c = columnPos;


        while(r >= 0 && c < 8) {
            if (board[r][c] != 0) {
                return true;
            }
            r--;
            c++;
        }

        r = rowPos;
        c = columnPos;

        while (r > 8 && c >= 0){
            if (board[r][c] != 0){
                return true;
            }
            r++;
            c--;
        }


        r = rowPos;
        c = columnPos;

        while (r <= 0 && c <= 0){
            if (board[r][c] != 0){
                return true;
            }
            r--;
            c--;
        }

        r = rowPos;
        c = columnPos;

        while (r < 8 && c < 8){
            if (board[r][c] != 0){
                return true;
            }
            r++;
            c++;
        }

        //Elephant case
        r = rowPos;
        c = columnPos;

        //vertical case
        while(r >= 0) {
            if (board[r][c] != 0){
                return true;
            }
            r--;
        }

        r = rowPos;
        while (r < 8) {
            if (board[r][c] != 0){
                return true;
            }
            r++;
        }

        //horizontal case
        r = rowPos;

        //left check
        while (c >= 0){
            if (board[r][c] != 0){
                return true;
            }
            c--;
        }

        //right check
        c = columnPos;
        while (c < 8){
            if (board[r][c] != 0){
                return true;
            }
            c++;
        }

        //horse case
        return board[r-2][c-1] != 0 || board[r-2][c+1] != 0 || board[r-1][c-2] != 0 || board[r-1][c+2] != 0
                || board[r+1][c-2] != 0 || board[r+1][c+2] != 0 || board[r+2][c-1] != 0 || board[r+2][c+1] != 0;
    }

    public boolean isValid(int row, int column, int n) {
        return row >= 0 && row < n && column >= 0 && column < n;
    }

}
