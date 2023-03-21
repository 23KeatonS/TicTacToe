import java.util.Scanner; 

class TicTacToeConsole{
    private static Scanner usr = new Scanner(System.in); 
    
    public static void main(String args[]){
        
        System.out.println("Welcome to TicTacToe \n Begin? y/n");
        String begin = usr.nextLine();
        begin = begin.toLowerCase();
        if (begin.equals("y")){
        }else if (begin.equals("n")){
            System.out.println("Player is not ready to play. \n Closing.");
            System.exit(0);     
        }

    }
}


