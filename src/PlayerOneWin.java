import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

/**
 * Created by Ajmaree on 8/8/2016.
 */
public class PlayerOneWin extends JFrame {
    JLabel p1lbl;
    JButton RESETbtn;
    JButton exitbtn;


    public PlayerOneWin() {
        super("TicTacToe");
        //setSize(700,700);
        //setLocation(100, 100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        setContentPane(new JLabel(new ImageIcon("src\\player1.png")));

        p1lbl = new JLabel("Player One WIN");
        RESETbtn = new JButton("RESET");
        exitbtn = new JButton("EXIT");
        p1lbl.setBounds(100, 300, 100, 50);
        add(p1lbl);
        add(RESETbtn);
        add(exitbtn);

        p1lbl.setBounds(300, 550, 300, 50);
        RESETbtn.setBounds(280, 600, 71, 30);
        exitbtn.setBounds(360, 600, 70, 30);


        setSize(700, 700);

        RESETbtn.addActionListener(new Button5ActionListener());
        exitbtn.addActionListener(new
                Button6ActionListener());

        setVisible(true);
    }

    public static void main(String... args) {
        new PlayerTwoWin();
    }

    class Button5ActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new TicTacToe().setVisible(true);
            dispose();
        }
    }

    class Button6ActionListener extends JFrame implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            exit(0);
        }
    }
}
