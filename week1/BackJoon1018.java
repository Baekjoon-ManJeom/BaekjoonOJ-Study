
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1018 {

    public static void main(String args[]) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ChessBoard chessBoard = new ChessBoard();

        chessBoard.setLength(Integer.parseInt(st.nextToken()));
        chessBoard.setHeight(Integer.parseInt(st.nextToken()));

        String[] board = chessBoard.getRows();
        for (int i = 0; i < chessBoard.getHeight(); i++) {

            board[i] = br.readLine();
        }
        br.close();
        chessBoard.setRows(board);

        System.out.println(chessBoard.getMinimumCount());
    }


    public static class ChessBoard {

        int length = 0;
        int height = 0;
        String[] rows;

        public void setLength(int length) {
            this.length = length;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            rows = new String[height];
            this.height = height;
        }

        public String[] getRows() {
            return rows;
        }

        public void setRows(String[] rows) {
            this.rows = rows;
        }

        public int getMinimumCount() {

            int minimumCount = 0;
            int count = 64;
            String checkValue = "";
            String boardValue1 = "BWBWBWBW";
            String boardValue2 = "WBWBWBWB";

            String[] split_bdr1 = boardValue1.split("");
            String[] split_bdr2 = boardValue2.split("");

            // 값비교를 위해 최소 8개가 필요하다. length 가 8일경우 1번째에서만 값비교를 할수있다,
            for (int i = 0; i < length - 7; i++) {

                for (int j = 0; j < height - 7; j++) {

                    for (int k = 0; k < 8; k++) {

                        checkValue = rows[k].substring(i, 8);

                        System.out.println(checkValue);
                        String[] split_str = checkValue.split("");
                        for (int l = 0; l < 8; l++) {
                            if (k % 2 == 0) {
                                if (split_str[l].equals(split_bdr1[l])) {
                                    count--;
                                }
                            } else {
                                if (split_str[l].equals(split_bdr2[l])) {
                                    count--;
                                }
                            }
                            if (count > 32) {
                                count = 64 - count;
                            }
                            if (minimumCount > count) {
                                minimumCount = count;
                            }

                        }
                        System.out.println(count);
                        count = 64;
                    }

                }


            }
            return minimumCount;
        }
    }
}
