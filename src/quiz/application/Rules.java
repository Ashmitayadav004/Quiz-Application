package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    JButton back, start;
    String name;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        setVisible(true);
        setSize(800, 550);
        setLocation(350, 100);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds ");
        heading.setBounds(30, 20, 800, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 900, 550);
        rules.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
        rules.setForeground(Color.BLACK);
        rules.setText(
                "<html>"
                + "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>"
                + "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>"
                + "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>"
                + "4. Crying is allowed but please do so quietly." + "<br><br>"
                + "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>"
                + "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>"
                + "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>"
                + "8. May you know more than what John Snow knows, Good Luck" + "<br><br>"
                + "<html>"
        );
        add(rules);

        start = new JButton("Start");
        start.setBounds(400, 600, 100, 30);
        start.setBackground(Color.YELLOW);
        start.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        start.setForeground(Color.RED);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250, 600, 100, 30);
        back.setBackground(Color.YELLOW);
        back.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            setVisible(false);
            new Quiz(name);

        } else {
            setVisible(false);
            new Login();
        }

    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
