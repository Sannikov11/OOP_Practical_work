package com.company;
import javax.security.auth.Refreshable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Game extends JFrame
{
    int x=0, y=0;
    String Team = "N/A";
    JPanel pnl = new JPanel();
    JPanel[] pnl2 = new JPanel[3];
    JButton btnMilan = new JButton("AC Milan");
    JButton btnReal = new JButton("Real Madrid");
    JButton btnEnd = new JButton("GAME OVER");
    JLabel lbl1 = new JLabel("Result " + x +"X" + y , SwingConstants.CENTER);
    JLabel lbl2 = new JLabel("Last Scorer: " + Team);
    JLabel lbl3 = new JLabel("Winner: ");

    public Game()
    {
        super("AC Milan VS Real Madrid");
        setSize(400,200);
        setLayout(new BorderLayout());
        add(btnMilan,BorderLayout.WEST);
        add(btnReal,BorderLayout.EAST);
        add(lbl1,BorderLayout.NORTH);
        add(lbl2,BorderLayout.SOUTH);

        add(btnEnd, BorderLayout.CENTER);
        btnMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                    x++;
                    Team="AC Milan";
                lbl1.setText("Result " + x +"X" + y );
                lbl2.setText("Last Scorer: " + Team);

            }
        });
        btnReal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                y++;
                Team="Real Madrid";
                lbl1.setText("Result " + x +"X" + y );
                lbl2.setText("Last Scorer: " + Team);
            }
        });
        btnEnd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (x>y)
                    Team="AC Milan!";
                else if (x<y)
                    Team="Real Madrid!";
                else
                    Team="DRAW!";
                lbl3.setText("Winner: " + Team);
                JOptionPane.showMessageDialog(null, lbl3, "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });


    }
    public static void main(String[]args)
    {
        new Game().setVisible(true);
    }
}