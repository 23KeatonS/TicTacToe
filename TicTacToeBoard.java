class TicTacToeBoard{
    
    private int[][] board;
    private int status;
    public static int turnCount = 0;


    public TicTacToeBoard(){
        this.board = new int [][] {{0,0,0},{0,0,0},{0,0,0}};
        this.status = 0;
        
        
        

    }


    public void makeMove(int r, int c,int player){
        this.board[r][c] = player;
        turnCount++;
    }

    public boolean isValidMove(int r, int c){
        return (this.board[r][c]==0);
    }



    public boolean threeInARow(int player, int startC,int startR, int dx, int dy){
        for(int i =0;i<3;i++){
            if(this.board[startR][startC]!=player){
                return false;
            }
            startR+=dy;
            startC+=dx;
        }

        return true;
    }





    private boolean playerWon(int player){
        if(threeInARow(player,0,0,1,0)){
            return true;
        }
        if(threeInARow(player, 0, 0, 0, 1)){
            return true;
        }
        if(threeInARow(player, 0, 0, 1, 1)){
            return true;
        }
        if(threeInARow(player,1,0,0,1)){
            return true;
        }
        if(threeInARow(player, 2, 0, 0, 1)){
            return true;
        }
        if(threeInARow(player, 0, 1, 1, 0)){
            return true;
        }
        if(threeInARow(player, 0, 2, 1, 0)){
            return true;
        }
        if(threeInARow(player, 2, 0, -1, 0)){
            return true;
        }
        



        return false;
    }






    public int getCellContents(int r, int c) {
        return board[r][c];
    }
    public int getStatus() {
       if(playerWon(1)){
        return 1;
       } else if(playerWon(2)){
        return 2;
       }
       if(turnCount>=9){
        return -1;
       }else{
        return 0;
       }
    
    
       
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
        /* 
        TicTacToeBoard board = new TicTacToeBoard();
        System.out.println(board);
        board.makeMove(0, 0, 1);
        System.out.println(board.getStatus());
        board.makeMove(0, 1, 1);
        System.out.println(board.getStatus());
        board.makeMove(0, 2, 1);
        System.out.println(board.getStatus());
        */

    }
    
    
    
    
}

