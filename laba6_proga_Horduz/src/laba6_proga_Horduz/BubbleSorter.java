package laba6_proga_Horduz;

public class BubbleSorter implements Sorter{

	@Override
	public void sort(float[] array) {
		if (array == null)
			throw new NullPointerException("NULL passed as a parameter");
		int n = array.length;
		for (int i = 1; i < n; i++)
			for (int j = 0; j + i < n; j++)
				if (array[j] < array[j + 1]) {
					array[j] += array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] -= array[j + 1];  
				}
	}
	
}
