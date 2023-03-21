class TicTacToeBoard{
    
    private int[][] board;
    private int gameOver;


    public TicTacToeBoard(){
        this.board = new int [][] {{0,0,0},{0,0,0},{0,0,0}};
        this.gameOver = 0;
        
        

    }


    public void makeMove(int r, int c,int player){
        this.board[r][c] = player;
    }

    public boolean isValidMove(int r, int c){
        return (this.board[r][c]==0);
    }


    public int[][] getBoard() {
        return board;
    }
    public int getGameOver() {
        return gameOver;
    }






    public String toString(){
        String retVal = "";
        

        return retVal;
    }


    
    
    
    
    
}

