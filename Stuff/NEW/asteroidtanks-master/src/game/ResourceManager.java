package game;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.Font;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.particles.ConfigurableEmitter;
import org.newdawn.slick.particles.ParticleEmitter;
import org.newdawn.slick.particles.ParticleIO;

public class ResourceManager {

	private static Map<String, Sound> sounds = new HashMap<String, Sound>();
	private static Map<String, Music> musics = new HashMap<String, Music>();
	private static Map<String, Image> images = new HashMap<String, Image>();
	private static Map<String, Image> mapImages = new HashMap<String, Image>();
	// private static Map<String, Image> tankImages = new HashMap<String,
	// Image>();
	// private static Map<String, Tank> tanks = new HashMap<String, Tank>();
	private static Map<String, ParticleEmitter> emitters = new HashMap<String, ParticleEmitter>();
	private static Map<String, Font> fonts = new HashMap<String, Font>();
	private static PropertiesFile resources;

	public static void init() {
		//parseTanks();
	}


	private static void createObject(String strKey) throws Exception {
		String value = resources.getString(strKey);
		if (strKey.endsWith("Sound")) {
			sounds.put(strKey, new Sound(value));
		} else if (strKey.endsWith("Music")) {
			musics.put(strKey, new Music(value, true));
		} else if (strKey.endsWith("Image")) {
			images.put(strKey, new Image(value));
		} else if (strKey.endsWith("NonConfEmitter")) {
			emitters.put(strKey, (ParticleEmitter) Class.forName(value)
					.newInstance());
		} else if (strKey.endsWith("Font")) {
			fonts.put(strKey, new AngelCodeFont(value + ".fnt", value + ".png",
					true));
		} else if (strKey.endsWith("ConfEmitter")) {
			emitters.put(strKey, ParticleIO.loadEmitter(value));
		}
	}


	// if we make different tank class
	// public static Tank createTank(String tankName) {
	// return tanks.get(tankName).clone();
	// }

	
//IN CASE WE MAKE TANK CLASS
/*	private static Tank parseTank(PropertiesFile props) {
		Tank tank = null;
		try {
			String tankName = props.getString("tankName");
			Image bodyImage = new Image(props.getString("bodyImage"));
			Image turretImage = new Image(props.getString("turretImage"));
			float moveSpeed = props.getFloat("moveSpeed");
			float rotateSpeed = props.getFloat("rotateSpeed");
			float xTurretSpace = props.getFloat("xTurretSpace");
			float yTurretSpace = props.getFloat("yTurretSpace");
			float rocketStartDistance = props.getFloat("rocketStartDistance");
			float bulletStartDistance = props.getFloat("bulletStartDistance");
			boolean infiniteBulletAmmo = props.getBoolean("infiniteBulletAmmo");
			boolean infiniteRocketAmmo = props.getBoolean("infiniteRocketAmmo");
			int reloadTime = props.getInt("reloadTime");
			byte numBullet = (byte) props.getInt("numBullet");
			byte numRocket = (byte) props.getInt("numRocket");
			byte maxAmmoBullet = (byte) props.getInt("maxAmmoBullet");
			byte maxAmmoRocket = (byte) props.getInt("maxAmmoRocket");
			String rocketSmokeColor = props.getString("rocketSmokeColor");
			int rocketSmokeColorType = props.getInt("rocketSmokeColorType");
			tank = new Tank(tankName, bodyImage, turretImage, 0, 0, 0, 0,
					moveSpeed, rotateSpeed, xTurretSpace, yTurretSpace,
					rocketStartDistance, bulletStartDistance,
					infiniteBulletAmmo, infiniteRocketAmmo, reloadTime,
					numBullet, numRocket, maxAmmoBullet, maxAmmoRocket);
			tank.setRocketSmokeColor(rocketSmokeColor, rocketSmokeColorType);
		} catch (Exception e) {
			throw new RuntimeException("Can't load tank : " + props.getFile());
		}
		return tank;
	}
*/
	
	public static Sound getSound(String name) {
		return sounds.get(name);
	}

	public static Music getMusic(String name) {
		return musics.get(name);
	}

	public static Image getImage(String name) {
		return images.get(name);
	}

	public static ParticleEmitter getNonConfigurableEmitter(String name) {
		return emitters.get(name);
	}

	public static ConfigurableEmitter loadConfigurableEmitter(String name) {
		/**
		 * ParticleEmitter emitter = null; String resourceName =
		 * resources.getString(name); try { emitter =
		 * ParticleIO.loadEmitter(resourceName); } catch (IOException ex) { //
		 * ex.printStackTrace(); throw new
		 * RuntimeException("Can't create ParticleEmitter : " + resourceName); }
		 */
		return (ConfigurableEmitter) emitters.get(name);
	}

	public static Map<String, Sound> getSounds() {
		return sounds;
	}

	public static Map<String, Music> getMusics() {
		return musics;
	}

	public static Map<String, Image> getImages() {
		return images;
	}

	/*
	 * public static String getMapDescription(String key) { return
	 * mapDescriptions.get(key); }
	 * 
	 * public static Image getMapImages(String key) { return mapImages.get(key);
	 * }
	 * 
	 * public static Image getTankImages(String key) { return
	 * tankImages.get(key); }
	 * 
	 * public static String getTankDescription(String key) { return
	 * tanks.get(key).getName(); }
	 * 
	 * public static Set<String> getMapKeys() { return mapImages.keySet(); }
	 * 
	 * public static Set<String> getTankKeys() { return tanks.keySet(); }
	 */

	public static Font getFont(String fontName) {
		return fonts.get(fontName);
	}

}