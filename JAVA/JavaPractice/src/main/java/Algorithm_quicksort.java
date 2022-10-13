import java.util.Random;

class Sort2 {
	int i = 0;
	int count = 0;
	
	public int partition(int a[], int begin, int end) {
		int pivot, temp, L, R;
		
		L = begin;
		R = end;
		pivot = (begin + end)/2;
		while (L<R) {
			while ((a[L]<a[pivot]) && (L<R)) L++; count++;
			while ((a[R]>=a[pivot]) && (L<R)) R--;
			
			if (L<R) {
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;
				if (L == pivot) {	//L�� R ��ȯ�Ͽ� �ǹ��� ��ġ�� �ٲ� ���
					return R;
				}
			}
		}
		
		// L>R �� �� ���
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		return R;
	}
	
	public void quickSort(int a[], int begin, int end) {
		if (begin < end) {
			int p;
			p = partition(a, begin, end);
			quickSort(a, begin, p-1);
			quickSort(a, p+1, end);
		}
	}
}

public class Algorithm_quicksort {
	public static void main(String[] args) {
		int[] array = new int[300];
		int size = array.length;
		Random rand = new Random();
		
		System.out.println("�ʱ� �迭 �� : ");
		for (int i=0; i<size; i++) {
			array[i] = rand.nextInt(500);
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		
		Sort2 S = new Sort2();
		S.quickSort(array, 0, size-1);
		
		System.out.println("�� ���� �� �迭 �� : ");
		for (int i=0; i<size; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		System.out.printf("�� ���� ���� Ƚ�� : %d ", S.count);
	}
}
