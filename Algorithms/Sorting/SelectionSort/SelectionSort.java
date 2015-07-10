import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class SelectionSort {
	public static void sort(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--) {
			int maxPos = maxIndex(arr, i);
			swap(arr, maxPos, i);
		}

	}

	public static int maxIndex(int[] arr, int size) {
		if (size < 0 || size > arr.length)
			size = arr.length;
		int maxPos = 0;
		for (int i = 0; i <= size; i++) {
			if (arr[i] > arr[maxPos])
				maxPos = i;
		}
		return maxPos;

	}

	public static void swap(int[] arr, int i, int j) {
		int aux;
		aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;

	}

	public static void main(String[] args) {
		int[] a = null;
		try (Scanner s = new Scanner(Files.newBufferedReader(
				Paths.get("array.txt"), Charset.defaultCharset()))) {
			int n = s.nextInt();
			a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();

		} catch (IOException e) {
			System.err.println("There is a problem with the file");
		} catch (Exception e) {
		}
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();

		sort(a);

		try (BufferedWriter w = Files.newBufferedWriter(Paths.get("array.txt"),
				java.nio.charset.StandardCharsets.UTF_8,
				StandardOpenOption.CREATE, StandardOpenOption.APPEND,
				StandardOpenOption.WRITE)) {
			w.write("Sorted array:");
			w.newLine();
			for (int i : a) {
				w.write(Integer.toString(i) + " ");
			}
		} catch (IOException e) {
			System.err.println("There is a problem with the file");
		} catch (Exception e) {
		}
		for (int i : a)
			System.out.print(i + " ");

	}
}