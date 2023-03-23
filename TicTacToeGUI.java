import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TicTacToeGUI {
    private static JFrame f = new JFrame("Tic Tac Toe");
    private static TicTacToeBoard board = new TicTacToeBoard();
    private static JPanel panel = new JPanel(new GridLayout(4, 3));
    private static int playernum = 1;
    private static void Game2p() {
        f.setVisible(false);
        panel.removeAll();
        panel.validate();
        f.repaint();
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
                        if (a.getX() == 189) {
                            r = 2;
                        } else if (a.getX() == 95) {
                            r = 1;
                        } else {
                            r = 0;
                        }
                        if (a.getY() == 180) {
                            c = 2;
                        } else if (a.getY() == 90) {
                            c = 1;
                        } else {
                            c = 0;
                        }
                        if (playernum % 2 != 0) {
                            player = 1;
                        } else {
                            player = 2;
                        }
                        if (board.isValidMove(c, r)) {
                            playernum++;
                            board.makeMove(c, r, player);
                            if (board.getStatus() == 0) {
                                Game2p();
                            } else if (board.getStatus() == 1) {
                                f.setVisible(false);
                                panel.removeAll();
                                panel.validate();
                                f.repaint();
                                panel.add(new JLabel("Player 1 Wins!!!!!!!!"));
                                JButton restart=new JButton("Restart?");
                                panel.add(restart);
                                restart.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        start();
                                        board = new TicTacToeBoard();
                                        playernum = 1;
                                    }
                                });
                                f.setVisible(true);
                            } else if (board.getStatus() == 2){
                                f.setVisible(false);
                                panel.removeAll();
                                panel.validate();
                                f.repaint();
                                panel.add(new JLabel("Player 2 Wins!!!!!!!!"));
                                JButton restart=new JButton("Restart?");
                                panel.add(restart);
                                restart.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        start();
                                        board = new TicTacToeBoard();
                                        playernum = 1;
                                    }
                                });
                                f.setVisible(true);
                            }else {
                                f.setVisible(false);
                                panel.removeAll();
                                panel.validate();
                                f.repaint();
                                panel.add(new JLabel("Draw!!!!!!!!!!!!!"));
                                JButton restart=new JButton("Restart?");
                                panel.add(restart);
                                restart.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        start();
                                        board = new TicTacToeBoard();
                                        playernum = 1;
                                    }
                                });
                                f.setVisible(true);
                            }
                        }
                    }
                });
            }
        }
        f.setVisible(true);
    }

    public static void start() {
        f.setVisible(false);
        panel.removeAll();
        panel.validate();
        f.repaint();
        JButton play1 = new JButton("1 player");
        play1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        play1.setBounds(0, 0, 100, 100);
        JButton play2 = new JButton("2 player");
        play2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Game2p();
            }
        });
        play2.setBounds(0, 0, 100, 100);
        panel.setSize(300, 300);
        panel.add(play1);
        panel.add(new JPanel());
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
        f.add(panel);

        f.setSize(300, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        start();
    }
}
