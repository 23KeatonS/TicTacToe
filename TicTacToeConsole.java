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

    private static boolean p1ValidInput(String p1move){
        while (!p1move.equals("a1") && !p1move.equals("b1") && !p1move.equals("c1") &&
            !p1move.equals("1a") && !p1move.equals("1b") && !p1move.equals("1c") &&
            !p1move.equals("a2") && !p1move.equals("b2") && !p1move.equals("c2") &&
            !p1move.equals("2a") && !p1move.equals("2b") && !p1move.equals("2c") &&
            !p1move.equals("a3") && !p1move.equals("b3") && !p1move.equals("c3") &&
            !p1move.equals("3a") && !p1move.equals("3b") && !p1move.equals("3c") ){
                System.out.println("Invalid Input. Try again");
                p1move = usr.nextLine().toLowerCase(); 
            }
        return true;
    }
    
    public static void main(String args[]){


        promptStart();

        TicTacToeBoard board = new TicTacToeBoard();
        System.out.println(board);

        System.out.println("You are player 1. Make your move.");
        String p1move = usr.nextLine().toLowerCase();

        System.out.println(p1ValidInput(p1move));
        System.out.println("next");
        

    }
}


