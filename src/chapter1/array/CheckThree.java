package chapter1.array;

public class CheckThree {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, false},
                {false, true},
                {true, false}
        };

        for(int i=0; i<board.length; i++) {  // 행을 반복 (i는 행의 인덱스)
            for(int j=0; j<board[i].length; j++) { // 열을 반복 (j는 열의 인덱스)
                if(board[i][j]) {  // 해당 위치의 값이 true인 경우 (검은 돌)
                    System.out.println("검은 돌의 위치: " + (i + "," + j));
                }
            }
        }
    }
}
