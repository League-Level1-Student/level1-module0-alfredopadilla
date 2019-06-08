import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookieRunner {

	public static void main(String[] args) {
	new FortuneCookie();
	FortuneCookie.showButton();
		JFrame frame= new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
	}



}
