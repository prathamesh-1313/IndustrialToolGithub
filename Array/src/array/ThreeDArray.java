package array;
import java.util.*;
public class ThreeDArray {

	public static void main(String[] args) {
		
		int arr[][][]=new int[2][3][3];
		int arr2[][]=new int[3][3];
		Scanner s1=new Scanner(System.in);
		
		for(int k= 0;k<2;k++)
		{
			System.out.println("Index at : " + k);
			for(int i=0;i<3;i++) {
				for(int j =0;j<3;j++) {
					arr[k][i][j]=s1.nextInt();
				}
			}
		}
		
		for(int k=0;k<2;k++) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					arr2[i][j]+= arr[k][i][j];
				}
			}
		}
		
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
			}
		

	}

}
