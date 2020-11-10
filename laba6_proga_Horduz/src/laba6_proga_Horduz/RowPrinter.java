package laba6_proga_Horduz;

public class RowPrinter implements Printer{
	@Override
	public void print(float[] array) {
		System.out.print("{");
		for (float num : array)
			System.out.print("  " + num);
		System.out.print(" }\n");
	}
}
