import java.util.Scanner; 

class TicTacToeConsole{
    private static Scanner usr = new Scanner(System.in); 
    
    public static void main(String args[]){
        
        System.out.println("Welcome to TicTacToe \n Begin? y/n");
        String begin = usr.nextLine();
        begin = begin.toLowerCase();
        if (begin.equals("y")){
            System.out.println(" Beginning...");
        }else if (begin.equals("n")){
            System.out.println("Player is not ready to play. \n Closing.");
            System.exit(0);     
        }else{
            while (!(begin.equals("y") && !(begin.equals("n")))){
                System.out.println("Invalid input. Try again.");
                begin = usr.nextLine();
                begin = begin.toLowerCase();
                if (begin.equals("y")){
                    System.out.println(" Beginning...");
                }else if (begin.equals("n")){
                    System.out.println("Player is not ready to play. \n Closing.");
                    System.exit(0);    
                } 

            }
            
        }
        TicTacToeBoard board = new TicTacToeBoard();
        System.out.println(board);

        System.out.println("You are player 1. Make your move.");
        String p1move = usr.nextLine();
        

    }
}


