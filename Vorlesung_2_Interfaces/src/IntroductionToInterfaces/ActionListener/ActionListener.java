package IntroductionToInterfaces.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyButtonClickListener implements ActionListener {

    private String message;

    public MyButtonClickListener(String message) {
        this.message = message;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button wurde gecklickt: " + message);


    }
}


class ActionMain{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Beispel");
        JButton button1 = new JButton("klick mich");
        JButton button2 = new JButton("klick mich auch");
        JButton button3 = new JButton("klick mich 3");


        button1.addActionListener(new MyButtonClickListener("Button 1"));
        button2.addActionListener(new MyButtonClickListener("Button 2"));
        button3.addActionListener(new MyButtonClickListener("Button 3"));


        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}