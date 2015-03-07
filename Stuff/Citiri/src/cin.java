import java.io.*;

class cin {
	static String linie(){
	BufferedReader from_keyboard2=new BufferedReader(new InputStreamReader(System.in));
	String s="";
	try {s=from_keyboard2.readLine(); } catch(IOException e) {}
	return s;
} }