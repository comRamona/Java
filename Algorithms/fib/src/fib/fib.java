package fib;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class fib {
	public static void main(String[] args) {
		int n = 0;
		int[] x={};

		try (Scanner s = new Scanner(Files.newBufferedReader(
				Paths.get("nr.txt"), java.nio.charset.StandardCharsets.UTF_8))) {
			n = s.nextInt();
		} catch (IOException e) {
		} catch (Exception e) {
		}
		try {
			x = new int[n];

			int m = 1, p = 1, t = 1;
			x[0] = m;
			x[1] = p;
			for (int i = 3; i <= n; i++) {
				t = m + p;
				p = m;
				m = t;
				x[i - 1] = t;

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("can't initialize array"); }
			try (BufferedWriter b = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(new File("res.txt"))))) {
				b.write(Arrays.toString(x));

			} catch (IOException e) {
			}
		}
	
}
