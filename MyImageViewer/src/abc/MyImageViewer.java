package abc;

import javax.swing.*;
import java.awt.*;

public class MyImageViewer extends JFrame {

    public MyImageViewer() {
        setTitle("Two Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLayout(new GridLayout(1, 2)); // 1 row, 2 columns

        // Load both images from the JAR resources
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/myImage1.PNG"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/myImageEclipse.PNG"));

        // Add the images to two labels
        JLabel label1 = new JLabel(icon1);
        JLabel label2 = new JLabel(icon2);

        label1.setHorizontalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);

        // Add labels to the frame
        add(label1);
        add(label2);

        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyImageViewer::new);
    }
}

//Add myImage.png and myImage2.png to resources/:

//Right-click resources > Import > File System

//Right-click resources > Build Path > Use as Source Folder