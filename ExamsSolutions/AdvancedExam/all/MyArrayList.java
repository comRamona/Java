public class MyArrayList {
	private int size = 1;
	private int[] elements = new int[size];
	private int curent = 0;

	public void add(int e) {
		curent++;
		elements[curent] = e;
		if (curent > size - 3) {
			size *= 2; // double size
			int[] cp = new int[elements.length];
			for (int i = 0; i < elements.length; i++)
				// copy elements in another array
				cp[i] = elements[i];
			elements = new int[size];
			for (int i = 0; i < cp.length; i++)
				// copy elements back
				elements[i] = cp[i];
		}
	}

	public int get(int i) {
		return elements[i];
	}

	public int indexOf(int key) {
		for (int i = 0; i < elements.length; i++)
			if (elements[i] == key)
				return i;
		return -1;
	}

}
