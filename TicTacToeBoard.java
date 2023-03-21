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


    public int getCellContents(int r, int c) {
        return board[r][c];
    }
    public int getStatus() {
        return gameOver;
    }






    public String toString(){
        String retVal = "";
        for(int[] row:this.board){
            for(int val:row){
                if(val==0){
                    retVal+=" ";
                }else if (val==1){
                    retVal +="X";
                }else{
                    retVal += "O";
                }
                

            }
        }

        return retVal;
    }


    
    
    
    
    
}

