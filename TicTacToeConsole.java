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

    private static void p1InvalidInput(String p1move){
        if (p1move.length() != 2){
            System.out.println(" Invalid input. Try again.");
        }
    }
    
    public static void main(String args[]){

        promptStart();

        TicTacToeBoard board = new TicTacToeBoard();
        System.out.println(board);

        System.out.println("You are player 1. Make your move.");
        String p1move = usr.nextLine();
        p1InvalidInput(p1move);
        

    }
}


