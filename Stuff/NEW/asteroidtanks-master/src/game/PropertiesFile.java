package game;

import java.io.FileOutputStream;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

import org.newdawn.slick.util.ResourceLoader;

/**
 * CREDIT TO THIS GUY FOR HELPING ME OUT
 * @author objectworks
 */

public class PropertiesFile {

	private Properties props;
	private String file;

	public PropertiesFile(String ref) {
		try {
			props = new Properties();
			URL url = ResourceLoader.getResource(ref);
			file = url.toURI().getPath();
			props.load(url.openStream());

		} catch (Exception ex) {
			// ex.printStackTrace();
			throw new RuntimeException("Can't find resource : " + file);
		}
	}

	public String getString(String key) {
		return props.getProperty(key);
	}

	public void setString(String key, String value) {
		props.setProperty(key, value);
	}

	public boolean getBoolean(String key) {
		return Boolean.parseBoolean(getString(key));
	}

	public void setBoolean(String key, boolean value) {
		props.setProperty(key, String.valueOf(value));
	}

	public int getInt(String key) {
		return Integer.parseInt(getString(key));
	}

	public void setInt(String key, int value) {
		props.setProperty(key, String.valueOf(value));
	}

	public long getLong(String key) {
		return Long.parseLong(getString(key));
	}

	public void setLong(String key, long value) {
		props.setProperty(key, String.valueOf(value));
	}

	public float getFloat(String key) {
		return Float.parseFloat(getString(key));
	}

	public void setFloat(String key, float value) {
		props.setProperty(key, String.valueOf(value));
	}

	public double getDouble(String key) {
		return Double.parseDouble(getString(key));
	}

	public void setDouble(String key, double value) {
		props.setProperty(key, String.valueOf(value));
	}

	public Set<Object> getAllProperties() {
		return props.keySet();
	}

	public String getFile() {
		return file;
	}

	public void save() {
		try {
			props.store(new FileOutputStream(file), "Properties");
		} catch (Exception ex) {
			throw new RuntimeException("Can't save... : " + file);
		}
	}
}