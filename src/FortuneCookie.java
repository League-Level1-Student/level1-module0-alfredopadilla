import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public FortuneCookie() {
	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Woohoo!");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You won't find love! :(");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You won't be lonely! :)");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You'll win the lottery! :)");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Be careful where you step! :|");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will lose something you value! :(");
		}

	}

}
