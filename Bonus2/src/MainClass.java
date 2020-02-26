import javax.swing.*;

public class MainClass {

	public static void main(String[] args) {
		
		
		JFrame windowFrame = new JFrame();
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(500, 500);
		windowFrame.add(new AutoTune(), 0);
		windowFrame.setVisible(true);
	}
}