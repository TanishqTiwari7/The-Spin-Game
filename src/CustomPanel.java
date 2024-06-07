import javax.swing.*;
import java.awt.*;

public class CustomPanel {
    public static String label1Text = "ENTER THE DARE !!!";
    public static JLabel label1 = new JLabel(label1Text);

    public static void createCustomPanel() {
        // Create a new JFrame
        JFrame frame = SpinGameApp.frame;
        frame.setTitle("CUSTOM DARES");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a JPanel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(0x123));

        // Label configuration
        String labelText = "Fill Your Custom Dares";
        JLabel label = new JLabel(labelText, JLabel.CENTER);
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        label.setForeground(new Color(0xFF777AFF));

        // Text field configuration
        JTextField nameField = new JTextField(20);
        nameField.setFont(new Font("Times New Roman", Font.BOLD, 20));

        // Button configuration
        JButton submitButton = new JButton("Submit Dare");
        submitButton.setPreferredSize(new Dimension(150, 30));
        submitButton.addActionListener(e -> {

            String userInput = nameField.getText();
            // Display label1 regardless of input
            label1.setFont(new Font("Times New Roman", Font.BOLD, 25));
            label1.setForeground(new Color(0xFF777AFF));

            if (userInput.isEmpty()) {
                label1.setVisible(true);  // Show the label when input is empty
                // Repaint the panel
                panel.revalidate();
                panel.repaint();

            } else {
                label1.setVisible(false);  // Hide the label when there's input


            }
            // Add the label to the panel using these constraints




        });

        // Add components to panel with appropriate constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(label, gbc);

        gbc.gridy = -1;
        panel.add(label1, gbc);

        gbc.gridy = 1;
        panel.add(nameField, gbc);

        gbc.gridy = 2;
        panel.add(submitButton, gbc);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}
