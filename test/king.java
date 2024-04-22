package test;

import java.util.Scanner;

public class king {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] board = new int[n][n];
        int row_pos = s.nextInt();
        int column_pos = s.nextInt();

        boolean isPresent = isSafe(board, row_pos, column_pos, n);
        if (isPresent){
            System.out.println("not safe");
        }else {
            System.out.println("safe");
        }
    }

    private static boolean isSafe(int[][] board, int rowPos, int columnPos, int n) {

        // camel case
        int r = rowPos;
        int c = columnPos;


        while(r >= 0 && c < n) {
            if (board[r][c] != 0) {
                return true;
            }
            r--;
            c++;
        }

        r = rowPos;
        c = columnPos;

        while (r > n && c >= 0){
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

        while (r < n && c < n){
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
        while (r < n) {
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
        while (c < n ){
            if (board[r][c] != 0){
                return true;
            }
            c++;
        }

        //Queen case
        return board[r - 1][c - 1] != 0 || board[r - 1][c] != 0 || board[r - 1][c + 1] != 0
                || board[r][c - 1] != 0 && board[r][c + 1] != 0
                || board[r + 1][c - 1] != 0 || board[r + 1][c] != 0 || board[r + 1][c + 1] != 0;

        //horse case


    }

}
