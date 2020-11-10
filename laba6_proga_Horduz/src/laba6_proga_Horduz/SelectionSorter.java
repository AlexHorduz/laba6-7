package laba6_proga_Horduz;

public class SelectionSorter implements Sorter{
	
	@Override
	public void sort(float[] array) {
		if (array == null)
			throw new NullPointerException("NULL passed as a parameter");
		int n = array.length;
		for (int i = 0; i + 1 < n; i++) {
			float max = array[i];
			int max_ind = i;
			for (int j = i + 1; j < n; j++) 
				if (array[j] > max) {
					max_ind = j;
					max = array[j];
				}
			if (max_ind != i) {
				array[i] += array[max_ind];
				array[max_ind] = array[i] - array[max_ind];
				array[i] -= array[max_ind];
			}
		}
	}
}
