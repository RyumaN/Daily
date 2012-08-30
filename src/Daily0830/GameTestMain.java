package Daily0830;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferStrategy;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class GameTestMain {
	JFrame frame1;
	BufferStrategy bstrategy;
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
			frame1.setIgnoreRepaint(true);
			frame1.createBufferStrategy(2);
			bstrategy = frame1.getBufferStrategy();

			Timer t = new Timer();
			t.schedule(new MyTimerTask(), 10, 500);
	}

	public static void main(String[] args) {
		GameTestMain gtm = new GameTestMain();

	}


	class MyTimerTask extends TimerTask{
		@Override
		public void run() {
			Graphics g = bstrategy.getDrawGraphics();
			if(bstrategy.contentsLost() == false){
				Insets insets = frame1.getInsets();
				g.translate(insets.left, insets.top);
				g.setColor(Color.BLUE);
				g.fillRect(0, 0, 100, 100);
				bstrategy.show();
				g.dispose();
			}

		}

	}
}
