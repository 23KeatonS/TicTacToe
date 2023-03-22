class TicTacToeBoard{
    
    private int[][] board;
    private int status;


    public TicTacToeBoard(){
        this.board = new int [][] {{0,0,0},{0,0,0},{0,0,0}};
        this.status = 0;
        
        

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
        return status;
    }






    public String toString(){
        String retVal = "  A   B   C\n";
        for(int j = 0;j<this.board.length;j++){
            retVal+=j+1+" ";
            for(int i=0;i<this.board[0].length;i++){
                if(this.board[j][i]==0){
                    retVal+="  ";
                }else if (this.board[j][i]==1){
                    retVal +="X ";
                }else{
                    retVal += "O ";
                }
                if(i!=2){
                    retVal+="| ";
                }  

            }
            if(j!=2){
                retVal+="\n  ~~~~~~~~~~\n";

            }
        }

        return retVal;
    }


    public static void main(String[] args) {
        TicTacToeBoard board = new TicTacToeBoard();
        System.out.println(board);
    }
    
    
    
    
}

