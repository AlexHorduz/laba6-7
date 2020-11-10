package laba6_proga_Horduz;

public class InsertionSorter implements Sorter{
	@Override
	public void sort(float[] array) {
		if (array == null)
			throw new NullPointerException("NULL passed as a parameter");
		int n = array.length;
		for (int i = 1; i < n; i++) {
			if (array[i] > array[i - 1])
				for (int j = i; j > 0; j--) 
					if (array[j] > array[j - 1]) {
						array[j] += array[j - 1];
						array[j - 1] = array[j] - array[j - 1];
						array[j] -= array[j - 1];
					} else
						break;
		}
	}
}
