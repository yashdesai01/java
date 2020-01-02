import java.util.*;
import java.io.*;
class p8 {
	public static void main(String[] args) {
		int ary1[][][]=new int[10][3][3];
		int sum[][]=new int[10][10];
		System.out.println("Enter No of Matrics:-");
		Scanner s1=new Scanner(System.in);
		int no=s1.nextInt();
		int i=0;
		int j=0;
		int k=0;
		for (i=0;i<no;i++) {
			System.out.println("Plz. Enter "+(i+1)+" Matrics of 2 rows and 2 columns");
			for (j=0;j<2;j++) {
				for (k=0;k<2;k++){
					ary1[i][j][k]=s1.nextInt();	
				}
			}
		}
		for (i=0;i<no;i++) {
			System.out.println("No "+(i+1)+" Matrics of 2 rows and 2 columns");
			for (j=0;j<2;j++) {
				for (k=0;k<2;k++) {
					System.out.print(ary1[i][j][k]);		
				}
				System.out.println("");
			}
		}
		System.out.println("Sum :- "+sum);		
	}
}