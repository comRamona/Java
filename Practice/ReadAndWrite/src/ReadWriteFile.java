import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteFile {

	public static void copy() throws IOException{
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new FileReader("names6.txt"));
			out = new PrintWriter(new FileWriter("output.txt"));
			String l;
			while ((l = in.readLine()) != null)
				out.println(l);
			System.out.println("done");
		} catch (FileNotFoundException e) {
			System.err.println("No such file:" + e.getMessage());
		} catch (IOException e) {
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
				}
			;
			if (out != null)
					out.close();
				

		}
	}

	public static void main(String[] args) throws IOException {
		copy();
		System.out.println(2+2);

	}
}
