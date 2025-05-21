package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    JButton submit;

    Score(String name, int score) {
        setBounds(500, 200, 750, 550);
        setVisible(true);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30, 150, 300, 250);
        add(image);

        JLabel head = new JLabel("Thank You " + name + " for playing Simple Minds...!!!!");
        head.setBounds(45, 30, 1000, 30);
        head.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        add(head);

        JLabel scores = new JLabel("Your Score is " + score);
        scores.setBounds(500, 120, 300, 30);
        scores.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));

        add(scores);

        submit = new JButton("Start Again");
        submit.setBounds(515, 230, 200, 50);
        submit.setBackground(Color.BLUE);
        submit.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
        submit.setForeground(Color.WHITE);
        
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User!!!!!!", 0);
    }
}
