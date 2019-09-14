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
		frame.pack();
		button1.addActionListener(this);
		button1.setText("Airplane Sound");
		button2.addActionListener(this);
		button3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (button1.equals(e.getSource())) {
			playSound("airplane.wav");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
