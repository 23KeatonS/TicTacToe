import javax.swing.*;  
import java.awt.event.*;
import java.awt.*;
public class TicTacToeGUI{
private static JFrame f=new JFrame("Tic Tac Toe");
private static TicTacToeBoard board =new TicTacToeBoard();

private static void Game2p(){
f.remove(f);
for(int x=0;x<3;x++){
    for(int y=0;y<3;y++){
        JButton =new JButton();
        .setBackground(Color.WHITE);
        .setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.black));
                f.add();
                .addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) {

                    }  
            });
        } 
    }
}
public static void start() {
        JButton play1=new JButton("1 player");
        play1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                
            } 
        });
        play1.setBounds(0,0,100,100);
        JButton play2=new JButton("2 player");
        play2.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                Game2p();
            } 
        });
        play2.setBounds(0,0,100,100);
        f.add(play1);
        f.add(new JPanel());
        f.add(play2);
        f.add(new JPanel());
        f.add(new JPanel());
        f.add(new JPanel());
        f.add(new JPanel());
        f.add(new JPanel());
        f.add(new JPanel());
        f.add(new JPanel());
        f.add(new JPanel());
        f.add(new JPanel());




        f.setSize(300,400); 
        f.setLayout(new GridLayout(4,3));
        f.setVisible(true);
    }



    public static void main(String[] args) {
        start();
       
    }
}
