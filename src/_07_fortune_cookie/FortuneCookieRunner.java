
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookieRunner {


	
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener((ActionListener) this);
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Woohoo");
		/*int rand = new Random().nextInt(5);
		JOptionPane.showInputDialog("Who are you");
		if (rand < 5) {
			System.out.println("You will be happy");
		}
		else {
				System.out.println("You will be alone for the rest of your life");
			}
*/
		}
	public static void main(String[] args) {
		new FortuneCookieRunner().showButton();
	}		

}

//working on #7. I think I need to make a pop-up