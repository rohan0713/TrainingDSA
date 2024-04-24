package test;

import java.util.Scanner;

public class king {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // 1 -> King
        // 2 -> Elephant
        // 3 -> camel
        // 4 -> Pawn
        // 5 -> Queen
        // 6 -> Horse
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 6, 0},
                {0, 0, 0, 0, 5, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        int row_pos = s.nextInt();
        int column_pos = s.nextInt();

        board[row_pos][column_pos] = 1;


        boolean isPresent = isSafe(board, row_pos, column_pos);
        if (isPresent) {
            System.out.println("not safe");
        } else {
            System.out.println("safe");
        }
    }

    private static boolean isSafe(int[][] board, int rowPos, int columnPos) {

        // camel case
        int r = rowPos-1;
        int c = columnPos+1;


        while (r >= 0 && c < 8) {
            if (board[r][c] == 3 || board[r][c] == 5) {
                return true;
            }
            r--;
            c++;
        }

        r = rowPos+1;
        c = columnPos-1;

        while (r < 8 && c >= 0) {
            if (board[r][c] == 3 || board[r][c] == 5) {
                return true;
            }
            r++;
            c--;
        }


        r = rowPos-1;
        c = columnPos-1;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 3 || board[r][c] == 5) {
                return true;
            }
            r--;
            c--;
        }

        r = rowPos+1;
        c = columnPos+1;

        while (r < 8 && c < 8) {
            if (board[r][c] == 3 || board[r][c] == 5) {
                return true;
            }
            r++;
            c++;
        }

        //Elephant case
        r = rowPos-1;
        c = columnPos;

        //vertical case
        while (r >= 0) {
            if (board[r][c] == 2 || board[r][c] == 5) {
                return true;
            }
            r--;
        }

        r = rowPos+1;
        while (r < 8) {
            if (board[r][c] == 2 || board[r][c] == 5) {
                return true;
            }
            r++;
        }

        //horizontal case
        r = rowPos;
        c = columnPos-1;

        //left check
        while (c >= 0) {
            if (board[r][c] == 2 || board[r][c] == 5) {
                return true;
            }
            c--;
        }

        //right check
        c = columnPos+1;
        while (c < 8) {
            if (board[r][c] == 2 || board[r][c] == 5) {
                return true;
            }
            c++;
        }

        //horse case
        int[][] idx = { {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

        for (int[] pos : idx) {
            if(isValid(r+pos[0], c+pos[1])){
                if (board[r+pos[0]][c+pos[1]] == 6){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isValid(int row, int column) {
        return row >= 0 && row < 8 && column >= 0 && column < 8;
    }

}
