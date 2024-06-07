import javax.swing.*;
import java.awt.*;

public class SpinGameApp {
    public static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame("The Spin Game");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(0X123)); // Set your desired background color


        ImageIcon image = new ImageIcon("img.png");
        Image scaledImage = image.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);


        JLabel label = new JLabel("The Spin Game");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIcon(new ImageIcon(scaledImage));
        label.setForeground(new Color(0xFF777AFF));
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setIconTextGap(19);


        JButton button1 = new JButton("CUSTOM DARES");
        button1.setFont(new Font("Calibri", Font.PLAIN, 15));
        button1.setBackground(Color.PINK);
        button1.setForeground(Color.RED);
        button1.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
        button1.addActionListener(e -> {
            //frame.dispose();
            //Close the current frame after the new one is visible
            panel.setVisible(false);
            CustomPanel customPanel = new CustomPanel(); // Create an instance of customframe
            customPanel.createCustomPanel(); // Call the custom() method on the created object
        });

        JButton button2 = new JButton("DEFAULT NUMBERS");
        button2.setFont(new Font("Calibri", Font.PLAIN, 15));
        button2.setBackground(Color.PINK);
        button2.setForeground(Color.RED);
        button2.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
        button2.addActionListener(e -> {
            //String input = "default numbers";
            //Get the string
        });

        panel.add(label);
        panel.add(button1, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.SOUTH);
        panel.setBorder(BorderFactory.createLineBorder(Color.white, 3));

        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}


