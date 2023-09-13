/*
 * Sort the following using bubble sort
 * The time complexity of this code is:
 * best case: O(N)
 */
public class basic {
	static void bubbleSort(int a[]) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			boolean flag=false;
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {3,5,7,8,9,10};
		bubbleSort(a);
		for(int i:a) {
			System.out.println(i+" ");
		}

	}

}
