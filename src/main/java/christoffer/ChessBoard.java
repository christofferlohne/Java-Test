package christoffer;

public class ChessBoard {
    private int border = 8;
    private String[][] board;

    public void printBoard(){
        System.out.println(board.length);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.println(board[i][j]);
            }
        }
    };

    public void createBoard(){
        for (int i = 0; i < this.border; i++){
            for (int j = 0; j < this.border; j++){
                this.board[i][j] = "_";
            }
        }
    };

}
