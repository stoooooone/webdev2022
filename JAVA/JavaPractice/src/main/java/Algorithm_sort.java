import java. util.Random;

class Sort {
	public int count = 0;
	public void insertionSort(int a[], int size) {	//���� ����
		int j, temp;
		for (int i=1; i<size; i++) {
			temp = a[i];
			j = i;
			while((j>0) && (a[j-1]>temp)) {
				a[j] = a[j-1];
				j--;
				count++;
			}
			a[j] = temp;
			
		}
	}
}

public class Algorithm_sort {
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
		
		Sort S = new Sort();
		S.insertionSort(array,  size);
		
		System.out.println("���� ���� �� �迭 �� : ");
		for (int i=0; i<size; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		System.out.printf("���� ���� ���� Ƚ�� : %d", S.count);
		
	}
}
