package arvindPractice;

public class ArraySorting {

	public static void main(String[] args) {
		
		//Ascending order
		int arr[]= {40,29,76,14,25};
//		int temp=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		for(int e:arr) {
//			System.out.print(e+" ");
//		}

		//Descending order
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int e:arr) {
			System.out.print(e+" ");
		}
		
	}

}
