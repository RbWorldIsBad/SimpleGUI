import 

javax.swing.*;

public class SimpleGUI  {
    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 1024);

        // Create a label to display messages
        JLabel label = new JLabel("Click the button!");

        // Create a button
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> {
            // Action to perform when the button is clicked
            label.setText("Ur Gay");
            
        });

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Display the window
        frame.setVisible(true);
    }
}