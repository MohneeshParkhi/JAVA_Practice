package HackerRank;

import java.util.Scanner;

public class Sum_Array_elements {

	 static int findSumArrayElements(int arr[],int len) {
		int sum=0;
		
		for(int i=0;i<len;i++) {
			int temp = arr[i];
			sum= sum+temp;
			}
		
		
	   return sum;    
    }
	

	 	
	public static void main(String[] args) {
		int i;
		int[] arr;
		int arrSize=6;
		arr = new int[arrSize];
	Scanner valInt = new Scanner(System.in);
		for(i=0;i<arrSize;i++) {
			
			int temp= valInt.nextInt();
		    
			arr[i]=temp;
		}
		
		System.out.println("Array Elements are");
		for(i=0;i<arrSize;i++) {
			System.out.println("Element at" + i +" "+arr[i]);
		}
	
		
		int sum = findSumArrayElements(arr,arrSize);
		
		System.out.println("Sum of array Elements");
		System.out.println(sum);
		
		valInt.close();

	}
	
    
}
