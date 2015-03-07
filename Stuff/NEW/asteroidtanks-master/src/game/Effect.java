package game;
/*
import java.io.File;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.particles.ConfigurableEmitter;
import org.newdawn.slick.particles.ParticleEmitter;
import org.newdawn.slick.particles.ParticleIO;
import org.newdawn.slick.particles.ParticleSystem;
import org.newdawn.slick.*;


public class Effect extends BasicGame {
    private ParticleSystem system;
    private ParticleIO particleIO;
    private ConfigurableEmitter emitter1;
    private ConfigurableEmitter emitter2;
    private int x = 0;
  
    public Effect() { super("Effect Test"); }
  
    public void init(GameContainer container) throws SlickException {
  
        // Junk image to get started, can be anything
        // Image is stored in explode.xml
        Image image = new Image("res/0.png", false);
        system = new ParticleSystem(image);
  
        try {
            File xmlFile = new File("res/explode.xml");
            emitter1 = ParticleIO.loadEmitter(xmlFile);
            emitter1.setPosition(200,200);
        } catch (Exception e) {
            System.out.println("Exception: " +e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }
  
        system.addEmitter(emitter1);    
  
        system.setBlendingMode(ParticleSystem.BLEND_ADDITIVE);  
        system.setUsePoints(false);
    }
  
    public void render(GameContainer gc, Graphics g) {
        system.render();
    }
  
  
    public void update(GameContainer gc, int delta) { 
        system.update(delta); 
    }
  
  
  
    public void keyPressed(int key, char c) {
  
        if (key == Input.KEY_ESCAPE) {
            System.exit(0);
        }
        if (key == Input.KEY_SPACE) {
            system.addEmitter(emitter1);    
            system.reset();
        }
    }
  
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Effect());
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
*/