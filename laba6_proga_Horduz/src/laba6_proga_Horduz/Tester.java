package laba6_proga_Horduz;

public class Tester {
	public static void main(String[] args) {
		test(createRandomArray(10));
		test(createRandomArray(10));
		test(createRandomArray(10));
		test(createRandomArray(10));
		test(createRandomArray(10));
		test(createRandomArray(10));
	}
	
	static void test(float[] a) {
		Printer printer = new RowPrinter();
		Sorter sorter1 = new BubbleSorter();
		Sorter sorter2 = new InsertionSorter();
		Sorter sorter3 = new SelectionSorter();
		System.out.print("Initial array:\n");
		printer.print(a);
		float[] a1 = a.clone();
		float[] a2 = a.clone();
		float[] a3 = a.clone();
		sorter1.sort(a1);
		sorter2.sort(a2);
		sorter3.sort(a3);
		System.out.print("Sorted using Bubble, Insertion and Selection sorts respectively:\n");
		printer.print(a1);
		printer.print(a2);
		printer.print(a3);
		System.out.println();
	}
	
	static float[] createRandomArray(int n) {
		float[] array = new float[n];
		for (int i = 0; i < n; i++)
			array[i] = (float)Math.random()*20 - 10;
		return array;	
	}
}
