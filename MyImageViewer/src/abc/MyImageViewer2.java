package abc;

import javax.swing.*;
import java.awt.*;

public class MyImageViewer2 extends JFrame {

    public MyImageViewer2() {
        setTitle("My Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Load the image
        ImageIcon imageIcon = new ImageIcon("myImage.png");

        // Add the image to a JLabel
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        // Add label to the frame
        add(imageLabel);

        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyImageViewer2::new);
    }
}
// if we export project with image file at root, copy the runable jar file to other location, cannot show the image
//