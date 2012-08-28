package daily0828;

import javax.swing.JFrame;
import java.awt.*;

public class GameTestMain {
	JFrame frame1;

	GameTestMain(){
		frame1 = new JFrame("ゲームテスト");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setBackground(Color.WHITE);
		frame1.setResizable(false);


		frame1.setVisible(true);
		Insets insets = frame1.getInsets();
		frame1.setSize(600 + insets.left + insets.right, 400 + insets.top + insets.bottom);
		frame1.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		GameTestMain gtm = new GameTestMain();

	}

}
