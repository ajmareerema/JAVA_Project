// BISMILLAHIR RAHMANIR RAHIM

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by Ajmaree on 8/4/2016.
 */
public class TicTacToe extends JFrame
{
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JButton[] button;
    JLabel turnlbl;
    JLabel youlbl;
    JLabel img;
    int [][] myArray = new int[3][3];
    public String x="src/x.jpg";
    public String o="src/o.jpg";
    public String def="src/default.jpg";
    public String up="src/Tic Tac Toe.jpg";
    public TicTacToe()
    {
        super("Tic Tac Toe");
        setSize(700,700);
        //setLocation(100,100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        img = new JLabel (new ImageIcon(up));
        p3.add(img);
        add(p3,BorderLayout.NORTH);

        button = new JButton[9];
        turnlbl = new JLabel("TURN :");
        youlbl = new JLabel("You");

        add(p,BorderLayout.CENTER);
        p.setLayout(new GridLayout(3,3));
        for(int i=0; i<9 ; i++)
        {
            button[i] = new JButton();
            p.add(button[i]);
        }
        add(p);
        p2.setLayout(new FlowLayout());
        add(p2,BorderLayout.SOUTH);
        p2.add(turnlbl);
        p2.add(youlbl);


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                myArray[i][j]=-1;
            }
        }
        for(int i=0;i<9;i++)
        {
            button[i].setIcon(new ImageIcon(def));
        }

        button[0].addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==1)
                {
                    button[0].setIcon(new ImageIcon(o));
                    myArray[0][0] = 0 ;
                    if(isWin(0,0,0))
                    {
                        new PlayerTwoWin().setVisible(true);
                        dispose();
                    }
                }
                else if(e.getClickCount()==2)
                {
                    button[0].setIcon(new ImageIcon(x));
                    myArray[0][0] = 1 ;
                    if(isWin(0,0,1))
                    {
                        new PlayerOneWin().setVisible(true);
                        dispose();
                    }
                }
            }
        });

        button[1].addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==1)
                {
                    button[1].setIcon(new ImageIcon(o));
                    myArray[0][1] = 0;
                    if(isWin(0,1,0))
                    {
                        new PlayerTwoWin().setVisible(true);
                        dispose();
                    }
                }
                else if(e.getClickCount()==2)
                {
                    button[1].setIcon(new ImageIcon(x));
                    myArray[0][1] = 1;
                    if(isWin(0,1,1))
                    {
                        new PlayerOneWin().setVisible(true);
                        dispose();
                    }
                }
            }
        });
        button[2].addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==1)
                {
                    button[2].setIcon(new ImageIcon(o));
                    myArray[0][2] = 0;
                    if(isWin(0,2,0))
                    {
                        new PlayerTwoWin().setVisible(true);
                        dispose();
                    }
                }
                else if(e.getClickCount()==2)
                {
                    button[2].setIcon(new ImageIcon(x));
                    myArray[0][2] = 1;
                    if(isWin(0,2,1))
                    {
                        new PlayerOneWin().setVisible(true);
                        dispose();
                    }
                }
            }
        });
        button[3].addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==1)
                {
                    button[3].setIcon(new ImageIcon(o));
                    myArray[1][0] = 0;
                    if(isWin(1,0,0))
                    {
                        new PlayerTwoWin().setVisible(true);
                        dispose();
                    }
                }
                else if(e.getClickCount()==2)
                {
                    button[3].setIcon(new ImageIcon(x));
                    myArray[1][0] = 1;
                    if(isWin(1,0,1))
                    {
                        new PlayerOneWin().setVisible(true);
                        dispose();
                    }
                }
            }
        });
        button[4].addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==1)
                {
                    button[4].setIcon(new ImageIcon(o));
                    myArray[1][1] = 0;
                    if(isWin(1,1,0))
                    {
                        new PlayerTwoWin().setVisible(true);
                        dispose();
                    }
                }
                else if(e.getClickCount()==2)
                {
                    button[4].setIcon(new ImageIcon(x));
                    myArray[1][1] = 1;
                    if(isWin(1,1,1))
                    {
                        new PlayerOneWin().setVisible(true);
                        dispose();
                    }
                }
            }
        });
        button[5].addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==1)
                {
                    button[5].setIcon(new ImageIcon(o));
                    myArray[1][2] = 0;
                    if(isWin(1,2,0))
                    {
                        new PlayerTwoWin().setVisible(true);
                        dispose();
                    }
                }
                else if(e.getClickCount()==2)
                {
                    button[5].setIcon(new ImageIcon(x));
                    myArray[1][2] = 1;
                    if(isWin(1,2,1))
                    {
                        new PlayerOneWin().setVisible(true);
                        dispose();
                    }
                }
            }
        });
        button[6].addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==1)
                {
                    button[6].setIcon(new ImageIcon(o));
                    myArray[2][0] = 0;
                    if(isWin(2,0,0))
                    {
                        new PlayerTwoWin().setVisible(true);
                        dispose();
                    }
                }
                else if(e.getClickCount()==2)
                {
                    button[6].setIcon(new ImageIcon(x));
                    myArray[2][0] = 1;
                    if(isWin(2,0,1))
                    {
                        new PlayerOneWin().setVisible(true);
                        dispose();
                    }
                }
            }
        });
        button[7].addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==1)
                {
                    button[7].setIcon(new ImageIcon(o));
                    myArray[2][1] = 0;
                    if(isWin(2,1,0))
                    {
                        new PlayerTwoWin().setVisible(true);
                        dispose();
                    }
                }
                else if(e.getClickCount()==2)
                {
                    button[7].setIcon(new ImageIcon(x));
                    myArray[2][1] = 1;
                    if(isWin(2,1,1))
                    {
                        new PlayerOneWin().setVisible(true);
                        dispose();
                    }
                }
            }
        });
        button[8].addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==1)
                {
                    button[8].setIcon(new ImageIcon(o));
                    myArray[2][2] = 0;
                    if(isWin(2,2,0))
                    {
                        new PlayerTwoWin().setVisible(true);
                        dispose();
                    }

                }
                else if(e.getClickCount()==2)
                {
                    button[8].setIcon(new ImageIcon(x));
                    myArray[2][2] = 1;
                    if(isWin(2,2,1))
                    {
                        new PlayerOneWin().setVisible(true);
                        dispose();
                    }
                }
            }
        });
        setVisible(true);
    }

    public boolean isWin(int i,int j,int n)
    {
        if (myArray[0][0]==n&&myArray[1][1]==n&&myArray[2][2]==n) {
            return true;
        }
        if(myArray[0][2]==n&&myArray[1][1]==n&&myArray[2][0]==n)
        {
            return true;
        }
        int cnti=0;
        int cntj=0;
        for(int l=0;l<3;l++)
        {
            for( int m=0;m<3;m++)
            {
                if (myArray[l][m] == n)
                {
                    if(l==i)
                    {
                        cnti++;
                    }
                    if (m==j)
                    {
                        cntj++;
                    }
                    if(cnti==3||cntj==3)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public void reset()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                myArray[i][j]=-1;
            }
        }
        for(int i=0;i<9;i++)
        {
            button[i].setIcon(new ImageIcon(def));
        }
    }
    public static void main(String ... args)
    {
        new TicTacToe();
    }

}