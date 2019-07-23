import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

class Welcome extends JFrame {
    JLabel wantlbl;
    JButton ybtn;
    JButton nbtn;

    public Welcome() {
        setTitle("TIC TAC TOE");
        // setSize(700,700);
        setResizable(false);
        //setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        setLayout(null);
        setContentPane(new JLabel(new ImageIcon("src\\welcome.jpg")));
        wantlbl = new JLabel("Are You Want To Play?");
        ybtn = new JButton("yes");
        nbtn = new JButton("NO");
        add(wantlbl);
        add(ybtn);
        add(nbtn);
        wantlbl.setBounds(250, 400, 150, 50);
        ybtn.setBounds(250, 470, 55, 30);
        nbtn.setBounds(350, 470, 55, 30);

        setSize(700, 700);

        ybtn.addActionListener(new
                Button1ActionListener());
        nbtn.addActionListener(new
                Button2ActionListener());

        setVisible(true);
    }

    public static void main(String args[]) {
        new Welcome();
    }


    class Button1ActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new TicTacToe().setVisible(true);
            dispose();

        }

    }

    class Button2ActionListener extends JFrame implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            exit(0);
        }
    }
}