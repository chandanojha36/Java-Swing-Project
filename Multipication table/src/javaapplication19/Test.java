package javaapplication19;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame {

    private Container c;
    private JLabel imgLabel, textLabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton clearButton;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;

    Test() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        f = new Font("Arial", Font.BOLD, 14);

        img = new ImageIcon(getClass().getResource("Cartoon.png"));

        imgLabel = new JLabel(img);
        imgLabel.setBounds(60, 10, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        textLabel = new JLabel("Enter any number : ");
        textLabel.setBounds(20, 280, 250, 50);
        textLabel.setForeground(Color.MAGENTA);
        textLabel.setFont(f);

        c.add(textLabel);

        tf = new JTextField();
        tf.setBounds(170, 290, 90, 30);
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.GREEN);
        c.add(tf);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        clearButton = new JButton("Clear");
        clearButton.setBounds(300, 290, 90, 30);
        clearButton.setCursor(cursor);
        clearButton.setBackground(Color.GREEN);
        clearButton.setFont(f);
        c.add(clearButton);

        ta = new JTextArea();
        ta.setBounds(40, 350, 300, 300);
        ta.setFont(f);
        ta.setBackground(Color.GREEN);
        c.add(ta);

        tf.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String value = tf.getText();

                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "you didn't put any number");
                } else {
                    ta.setText("");
                    int num = Integer.parseInt(tf.getText());

                    for (int i = 1; i <= 10; i++) {

                        int restult = num * i;

                        String r = String.valueOf(restult);
                        String n = String.valueOf(num);
                        String incr = String.valueOf(i);

                        ta.append(n + " X " + incr + " = " + r + "\n");

                    }
                }

            }

        });
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");

            }

        });

    }

    public static void main(String[] args) {

        Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 20, 450, 700);
        frame.setTitle(" Multiplication Table ");

    }

}
