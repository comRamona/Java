import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame extends Applet implements Runnable {
	int x, y; // these are all new variables
	Thread thread;
	long startTime, endTime, framePeriod; // long is just a very big integer

	public void init() {
		resize(500, 500);
		x = 0; // the top left x and y coordinates of the rectangle
		y = 0; // containing the circle.
		startTime = 0;
		endTime = 0;
		framePeriod = 25; // 25 milliseconds is a good frame period
		thread = new Thread(this, "paint"); // create the thread
		thread.start(); // start the thread running ,run get called
	}

	public void paint(Graphics gfx) {
		gfx.setColor(Color.black); // clear the screen with black
		gfx.fillRect(0, 0, 500, 500);
		gfx.setColor(Color.red);
		gfx.fillOval(x, y, 50, 50);
	}

	public void update(Graphics gfx) {
		paint(gfx); // call paint without clearing the screen
	}

	public void run() {
		for (y = 0; y < 450; y += 50) { // x and y are the location of the
										// circle
			for (x = 0; x < 450; x += 2) {
				// mark start time
				startTime = System.currentTimeMillis();
				repaint();
				// the next 6 lines pause execution for 20
				// milliseconds minus the time it took to move the
				// circle and repaint.
				try {
					// mark end time
					endTime = System.currentTimeMillis();
					// don’t sleep for a negative amount of time
					if (framePeriod - (endTime - startTime) > 0) {
						Thread.sleep(framePeriod - // stop to see image
								(endTime - startTime));
					}

				} catch (InterruptedException e) {
				}
			}
		}
	}
}
