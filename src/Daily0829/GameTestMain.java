package Daily0829;

import java.awt.Color;
import java.awt.Insets;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class GameTestMain {
	JFrame frame1;
	int count = 0;

		GameTestMain(){
			frame1 = new JFrame("ゲームテスト");
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.setBackground(Color.WHITE);
			frame1.setResizable(false);


			frame1.setVisible(true);
			Insets insets = frame1.getInsets();
			frame1.setSize(600 + insets.left + insets.right, 400 + insets.top + insets.bottom);
			frame1.setLocationRelativeTo(null);

			Timer t = new Timer();
			t.schedule(new MyTimerTask(), 10, 500);
	}

	public static void main(String[] args) {
		GameTestMain gtm = new GameTestMain();

	}


	class MyTimerTask extends TimerTask{
		@Override
		public void run() {
			count = count + 1;
			System.out.println(count);

		}

	}
}
