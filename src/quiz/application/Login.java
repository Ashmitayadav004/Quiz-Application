package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiztime.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        setVisible(true);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel name = new JLabel("Enter your name ");
        name.setBounds(820, 150, 300, 20);
        name.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        name.setForeground(Color.RED);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        tfname.setForeground(Color.BLACK);
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 40);
        rules.setBackground(Color.YELLOW);
        rules.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        rules.setForeground(Color.RED);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915, 270, 120, 40);
        back.setBackground(Color.YELLOW);
        back.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);

        setSize(1000, 500);
        setLocation(200, 150);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);

        } else if (e.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();

    }

}
