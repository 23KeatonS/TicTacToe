import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TicTacToeGUI {
    private static JFrame f = new JFrame("Tic Tac Toe");
    private static TicTacToeBoard board = new TicTacToeBoard();
    private static JPanel panel = new JPanel(new GridLayout(4, 3));
    private static JLabel label = new JLabel();
    private static void Game2p() {
        label.setFont(new Font("L", Font.BOLD, 30));
        panel.setVisible(false);
        panel.removeAll();
        panel.validate();
        f.repaint();
        String move="";
        if (board.getTurnCount() % 2 == 0) {
            move = "X";
        } else {
            move = "O";
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                JButton a = new JButton();
                if (board.getCellContents(x, y) == 0) {
                    a.setText(null);
                } else if (board.getCellContents(x, y) == 1) {
                    a.setText("X");
                } else {
                    a.setText("O");
                }
                a.setBackground(Color.WHITE);
                a.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.gray));
                panel.add(a);
                a.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int r = 0;
                        int c = 0;
                        int player = 0;
                        if (a.getX() == 389) {
                            r = 2;
                        } else if (a.getX() == 195) {
                            r = 1;
                        } else {
                            r = 0;
                        }
                        if (a.getY() == 380) {
                            c = 2;
                        } else if (a.getY() == 190) {
                            c = 1;
                        } else {
                            c = 0;
                        }
                        if (board.getTurnCount() % 2 == 0) {
                            player = 1;
                        } else {
                            player = 2;
                        }
                        if (board.isValidMove(c, r)) {
                            board.makeMove(c, r, player);
                            if (board.getStatus() == 0) {
                                Game2p();
                            } else if (board.getStatus() == 1) {
                                panel.setVisible(false);
                                panel.removeAll();
                                panel.validate();
                                panel.repaint();
                                label.setText("Player 1 Wins!!!!!!!!");
                                panel.add(label);
                                JButton restart=new JButton("Restart?");
                                panel.add(restart);
                                restart.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        start();
                                        board = new TicTacToeBoard();
                                    }
                                });
                                panel.setVisible(true);
                            } else if (board.getStatus() == 2){
                                panel.setVisible(false);
                                panel.removeAll();
                                panel.validate();
                                f.repaint();
                                label.setText("Player 2 Wins!!!!!!!!");
                                panel.add(label);
                                JButton restart=new JButton("Restart?");
                                panel.add(restart);
                                restart.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        start();
                                        board = new TicTacToeBoard();
                                    }
                                });
                                panel.setVisible(true);
                            }else {
                                panel.setVisible(false);
                                panel.removeAll();
                                panel.validate();
                                f.repaint();
                                label.setText("Draw!!!!!!!!");
                                panel.add(label);
                                JButton restart=new JButton("Restart?");
                                panel.add(restart);
                                restart.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        start();
                                        board = new TicTacToeBoard();
                                    }
                                });
                                panel.setVisible(true);
                            }
                        }
                    }
                });
            }
        }
        label.setText(move+"'s Turn");
        panel.add(label);
        panel.setVisible(true);
    }
    public static void start() {
        f.setVisible(false);
        panel.removeAll();
        panel.validate();
        f.repaint();
        JButton play2 = new JButton("2 player");
        play2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Game2p();
            }
        });
        play2.setBounds(0, 0, 200, 200);
        panel.setSize(600, 600);
        panel.add(play2);
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        f.add(panel);

        f.setSize(600, 800);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        start();
    }
}