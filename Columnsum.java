package columnsum;

import java.util.Scanner;

public class Columnsum{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size:");
		int rowsize = scanner.nextInt();
		System.out.println("Enter column size:");
		int columnsize = scanner.nextInt();
		System.out.println("Enter 2D array:");
		int arr[][] = new int[rowsize][columnsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		scanner.close();
		columnsum(arr,rowsize,columnsize);
	}
		public static void columnsum(int arr[][],int rowsize,int columnsize) {
		for(int i=0;i<columnsize;i++) {
			int sum=0;
			for(int j=0;j<rowsize;j++) {
				sum+=arr[j][i];
				//System.out.print(arr[j][i]);
			}
			System.out.print(sum+" ");
		}
		}
}