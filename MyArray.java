package projects;

import java.util.List;
import java.util.Scanner;

public class MyArray {
	
	private MyArray() {};
	
	public static int[] initializeArray(){
//		it will initialize a given Array;
		Scanner SC = new Scanner(System.in);
		System.out.println("Please enter the number of elements");
		int n=SC.nextInt();
		while(n<1) {
			System.out.println("Please enter positive value");
			n=SC.nextInt();
		}
		int a[]= new int[n];
		System.out.println("Please fill the elements");
		for(int i=0;i<n;i++) {
			a[i]=SC.nextInt();
		}
		return a;
	}
	public static void printArray(int arr[]) {
//		It will print the given array;
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("] ");
//		System.out.println();
	}
	public static void printArray(String arr[]) {
//		It will print the given array;
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("] ");
//		System.out.println();
	}
	public static int[] dupArray(int arr[]) {
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		return temp;
	}
	public static int minOfNot1(int arr[]){
//		It will find minimum number in array excluding 1 Example minOf 3,4,5,3,3,1,2 is 2;
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(smallest>arr[i]||smallest==1) {
				if(arr[i]!=1) {
					smallest=arr[i];
				}
			}
		}
		return smallest;
	}
	public static int[] add(int a[],int b){
//		it will add an element in an array;
// 		Example int_datatype = MyArray.add(int_datatype,add_int);
		int temp[] = new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		temp[temp.length-1]=b;
		return temp;
	}
	public static int maxInBtw(int[] nums,int a, int b) {
		int temp=nums[a];
		for(int i=a;i<=b;i++) {
			if(temp<nums[i]) {
				temp=nums[i];
			}
		}
		return temp;
	}
	public static int[] listToArray(List<Integer> I) {
		int a[]= new int[I.size()];
		for(int i=0;i<I.size();i++) {
			a[i]=I.get(i);
		}
		return a;
	}
	public static void main(String args[]) {
	}
}
