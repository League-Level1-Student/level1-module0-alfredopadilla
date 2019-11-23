package _10_cuteness_tv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class CutenessTV implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public static void main(String[] args) {
        new CutenessTV().showButton();
    }

    public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setVisible(true);
        frame.add(panel);
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        button1.addActionListener(this);
        button1.setText("Ducks");
        button2.addActionListener(this);
        button2.setText("Frog");
        button3.addActionListener(this);
        button3.setText("FluffyUnicorns");
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (button1.equals(e.getSource())) {
            playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
        } else if (button2.equals(e.getSource())) {
            playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
        } else if (button3.equals(e.getSource())) {
            playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
        }
    }

    void showDucks() {
        playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
    }

    void showFrog() {
        playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
    }

    void showFluffyUnicorns() {
        playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
    }

    void playVideo(String videoID) {
        try {
            URI uri = new URI(videoID);
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}








