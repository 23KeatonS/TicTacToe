import java.util.Scanner;

class TicTacToeConsole{
    private static Scanner usr = new Scanner(System.in); 
    
    private static void promptStart() {
        System.out.println("Welcome to TicTacToe \n Begin? y/n");

        String begin = usr.nextLine().toLowerCase();
        if (begin.equals("n")){
            System.out.println("Player is not ready to play. \n Closing.");
            System.exit(0);     
        }else{
            while (!begin.equals("y") && !begin.equals("n")){
                System.out.println("Invalid input. Try again.");
                begin = usr.nextLine().toLowerCase();
                if (begin.equals("n")) {
                    System.out.println("Player is not ready to play. \n Closing.");
                    System.exit(0);    
                }
            } 
        }
        System.out.println(" Beginning...");
    }

    private static boolean validInput(String move){
        while (!move.equals("a1") && !move.equals("b1") && !move.equals("c1") &&
            !move.equals("1a") && !move.equals("1b") && !move.equals("1c") &&
            !move.equals("a2") && !move.equals("b2") && !move.equals("c2") &&
            !move.equals("2a") && !move.equals("2b") && !move.equals("2c") &&
            !move.equals("a3") && !move.equals("b3") && !move.equals("c3") &&
            !move.equals("3a") && !move.equals("3b") && !move.equals("3c") ){
                System.out.println("Invalid Input. Try again");
                move = usr.nextLine().toLowerCase(); 
            }
        return true;
    }


    private static int c(String move){
        int c;
        if (move.indexOf("a") != -1){
            c = 0;
        }else if (move.indexOf("b") != -1){
            c = 1;
        }else{
            c = 2;
        }
        return c;
    }

    private static int r(String move){
        int r;
        if (move.indexOf("1") != -1){
            r = 0;
        }else if (move.indexOf("2") != -1){
            r = 1;
        }else{
            r = 2;
        }
        return r;
    }
    

    public static void main(String args[]){

        promptStart();

        TicTacToeBoard board = new TicTacToeBoard();
        System.out.println(board);

        System.out.println("You are player 1. Make your move.");
        String move = usr.nextLine().toLowerCase();


        if(validInput(move) && board.isValidMove(r(move), c(move))){
            System.out.println("next");
            System.out.println(r(move));
            System.out.println(c(move));
            System.out.println(board);
        }




    }
}


