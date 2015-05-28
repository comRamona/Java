import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MvSquare extends JPanel implements  KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x=0;
	private int y=0;
	private int velx=0;
	private int vely=0;
	private Color c=Color.PINK;
	public static int dimension=200;
	public int speed=3;
	public void chooseColor(Color c){ this.c=c; }
public MvSquare(){
	addKeyListener(this);
	setFocusable(true);
	setFocusTraversalKeysEnabled(false);
	Thread t=new Thread(new Runnable() {
		public void run(){
		
			while(true)
			{  x+=velx;
			   y+=vely;
			   if(x>dimension) x=0;
			   if(x<0) x=dimension;
			   if(y>dimension) y=0;
			   if(y<0) y=dimension;
				repaint();
				try{Thread.sleep(40); }
				catch(InterruptedException e){}
				
		
			
		} }
		
	});
	t.start();
	
}

public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(c);
	g.fillRect(0,0,dimension,dimension);
	g.setColor(Color.BLACK);
		g.fillRect(x, y, 30, 30);
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	int code=e.getKeyCode();
	if(code==KeyEvent.VK_UP) { up(); }
	if(code==KeyEvent.VK_DOWN) { down(); }
	if(code==KeyEvent.VK_RIGHT) { right(); }
	if(code==KeyEvent.VK_LEFT) { left(); }
	
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	int code=e.getKeyCode();
	if(code==KeyEvent.VK_UP) { velx=0; vely=0; }
	if(code==KeyEvent.VK_DOWN) { velx=0; vely=0;}
	if(code==KeyEvent.VK_RIGHT) { velx=0; vely=0;}
	if(code==KeyEvent.VK_LEFT) { velx=0; vely=0; }
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

public void up(){
	vely=0-speed;
	velx=0;
	
}
public void down(){
	vely=speed;
	velx=0;
}
public void left(){
	velx=0-speed;
	vely=0;
}
public void right(){
	velx=speed;
	vely=0;
}
public static void main(String[] args) {
	JFrame frame=new JFrame();
	dimension=300;
	frame.setVisible(true);
	frame.setSize(dimension,dimension);
	MvSquare R=new MvSquare();
	frame.add(R);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
