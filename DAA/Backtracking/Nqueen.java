import java.util.ArrayList;
import java.util.Arrays;

class Nqueen {

    static void nQueen(int n) {

        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '-';
        ArrayList<ArrayList<String>> out = new ArrayList<ArrayList<String>>();

        placeQueen(0, board, out);

        for (int i = 0; i < out.size(); i++) {
            System.out.println("Arrangement : " + (i + 1));
            for (String s : out.get(i)) {
                System.out.println(s);
            }
        }

        if (out.isEmpty())
            System.out.println("No Possible Arrangement");

    }

    static void placeQueen(int column, char board[][], ArrayList<ArrayList<String>> out) {
        if (column == board.length) {
            ArrayList<String> res = new ArrayList<String>();
            for (int i = 0; i < board.length; i++) {
                String s = new String(board[i]);
                res.add(s);
            }
            out.add(res);
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (check(row, column, board)) {
                board[row][column] = 'Q';
                placeQueen(column + 1, board, out);
                board[row][column] = '-';
            }

        }

    }

    static boolean check(int row, int colum, char board[][]) {

        int i = row;
        int j = colum;

        while (row >= 0 && colum >= 0) {
            if (board[row][colum] == 'Q')
                return false;
            row--;
            colum--;

        }

        row = i;
        colum = j;

        while (colum >= 0) {
            if (board[row][colum] == 'Q')
                return false;

            colum--;
        }

        row = i;
        colum = j;

        while (colum >= 0 && row < board.length) {
            if (board[row][colum] == 'Q')
                return false;

            colum--;
            row++;
        }

        return true;
    }

    public static void main(String[] args) {

        nQueen(16);

    }
}