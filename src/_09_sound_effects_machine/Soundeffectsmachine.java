package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Soundeffectsmachine implements ActionListener {
	private JButton button1;
	private JButton button2;
	private JButton button3;

	public static void main(String[] args) {
		new Soundeffectsmachine().showButton();
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
		button1.setText("Airplane Sound");
		button2.addActionListener(this);
		button2.setText("Heavy Rain");
		button3.addActionListener(this);
		button3.setText("Service Bell");
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (button1.equals(e.getSource())) {
			playSound("airplane.wav");
		}
		else if(button2.equals(e.getSource())) {
			playSound("heavyrain.wav");
		}
		else if(button3.equals(e.getSource())) {
			playSound("servicebell.wav");
		}
	}
		

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
