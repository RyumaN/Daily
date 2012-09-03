package Daily0831;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
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

	void drawStringCenter(String str, int y, Graphics g){
		int fw = frame1.getWidth() / 2;  //ウィンドウ幅÷2
		FontMetrics fm = g.getFontMetrics();  //文字列幅÷2
		int strw = fm.stringWidth(str) / 2;  //文字表示
		g.drawString(str, fw - strw, y);
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

				g.setFont(new Font("Serif", Font.PLAIN, 40));
				//g.drawString("こんちわ Hello!", 100, 100);
				drawStringCenter("こんちわ Hello!", 100, g);
				g.setFont(new Font("SansSerif", Font.PLAIN, 60));
				//g.drawString("こんちわ Hello!", 100, 140);
				drawStringCenter("こんちわ Hello!", 160, g);
				g.setFont(new Font("Monospaced", Font.PLAIN, 40));
				g.drawString("こんちわ Hello!", 100, 180);
				g.setFont(new Font("Dialog", Font.PLAIN, 40));
				g.drawString("こんちわ Hello!", 100, 220);
				g.setFont(new Font("DialogInput", Font.PLAIN, 40));
				g.drawString("こんちわ Hello!", 100, 260);
				g.setFont(new Font("DHP行書体", Font.PLAIN, 40));
				g.drawString("こんちわ Hello!", 100, 300);
				bstrategy.show();
				g.dispose();
			}

		}

	}
}
