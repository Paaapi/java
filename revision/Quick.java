package revision;
public class Quick{
int partition (int a[], int start, int end){
	int pivot = a[end];
	int i = (start - 1);
	for (int j = start; j <= end - 1; j++){
		if (a[j] < pivot){
			i++;
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
	}
	int t = a[i+1];
	a[i+1] = a[end];
	a[end] = t; 
	return (i + 1);
}
void quick(int a[], int start, int end){
	if (start < end){
		int p = partition(a, start, end);  //p is partitioning index
		quick(a, start, p - 1);
		quick(a, p + 1, end);
	}
}

void printArr(int a[], int n){
	int i;
	for (i = 0; i < n; i++)
	    System.out.print(a[i] + " ");
}
	public static void main(String[] args) {
	int a[] = {24,2,12,7,9,45,67,23,56};
	int n = a.length;
    System.out.println("\nBefore ");
    Quick q1 = new Quick();
    q1.printArr(a, n);
    q1.quick(a, 0, n - 1);
    System.out.println("\nAfter sorting");
    q1.printArr(a, n);
    System.out.println();
	}
}

