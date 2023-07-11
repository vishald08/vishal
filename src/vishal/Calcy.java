package vishal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.sound.midi.Soundbank;


public class Calcy {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
//	int [] arr = new int [4];
//	int i=arr.length;
//		for (int j = 0; j < arr.length; j++) {
//			arr[j]= sc.nextInt();
//		}
//	System.out.println(arr[i]);
	
/*
	int  arr[] = new int [5];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
		
	}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int x=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==x) {
System.out.println("The Index of : "+i);
				
			}
	*/
	
//	String name []= new String[4];
//	int i;
//	for ( i = 0; i < name.length; i++) {
//		name[i]=sc.next();
//	
//	}
//	System.out.println(name[i]);
//  This getting Index 4 out of bounds error --> why this error occur 
//	or else if we want to print the elements of a particular ARRAY then we HAVE to use <for> loop 
//	compulsory..?
//	without <for> loop We can't Print the Element of An ARRAY..?
	
	
	
//	String name[]= new String [4];
//	for (int i = 0; i < name.length; i++) {
//		name[i]=sc.next();
//	}
//	for (int i = 0; i < name.length; i++) {
//		System.out.println("name "+ (i+1)+ " is :" +name[i]);
//		System.out.format("name %d Is : %d",i,name[i]);
//	}
	
	
//	int num[]= new int [4];
//	for (int i = 0; i < num.length; i++) {
//		num[i]=sc.nextInt();
//	}
//	for (int i = 0; i < num.length; i++) {
//		System.out.println("name "+ (i+1)+ " is :" +num[i]);
//		System.out.format("name %d Is : %d",i,num[i]);
//	}
//	int min =num[0];
//		for (int i = 0; i < num.length; i++) {
//			
//		if (num[i]>min) {
//			min=num[i];
//			
//	}	
//		}
//		System.out.println(min);
	
//	2D Array Structure
//	int row=3;
//	int coloumn=3;
//	 int [][] num = new int[row][coloumn];
//	for (int i = 0; i <row; i++) {
//		for (int j = 0; j < coloumn; j++) {
//			num[i][j] = sc.nextInt();
//		}
//	}
	
	/*
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < coloumn; j++) {
			System.out.print(num[i][j] + " ");
		}
		System.out.println();
	}
	*/
	
//	int x= sc.nextInt();
//	for (int i = 0; i < row; i++) {
//		for (int j = 0; j < coloumn; j++) {
//			if (num[i][j]==x) {
//				System.out.println("The value is "+"("+i+","+j+")");
//			}
//		}
//	}
	
	
	/*
	int arr[] = {34,432,1,34,23,56,75,454,600};
	
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	int sum =0;
	for (int i : arr) {
//		i+=sum;  // (i = i+ sum) This is wrong because of_ <i> me <sum> add ho raha hoga matlab <sum> to 0 hai agar <i> me <sum> add hoga to 0 hi add hoga isliye 0 aayega... isliye ye galat hai..
		sum+=i;  // (sum = sum+ i) This is Right because of_ <sum> me <i> add hoga matlab <sum> 0 hai to <i> puri value add krega...
//		sum = sum +i;
		System.out.print(i);
		
	}
	System.out.println();
	System.out.println(sum);
	*/
	
	/*
	char arr [][]= new char[3][3];
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			arr[i][j]='-';
			System.out.print(arr[i][j]);	
		}
//		System.out.println(arr[i][j]);
	}
//	System.out.println(arr[]);
	System.out.println(Arrays.deepToString(arr));
	*/
	
	/*
	int arr[] = {34,432,1,34,23,56,75,454,600};
	int sum =0;
	int avg=0;
	for (int i : arr) {
		sum+=i;
	 avg = sum/arr.length;
	}
	System.out.println(sum + " & The Avarage Is : "+ avg);
	*/
	
	
	/* Wrong code hehehe... but run ok
	int arr []= {34,2,76,90,100,1998,27};
	int value =sc.nextInt();
	int i=0;
	for (int i1 : arr) {
		if (i1== value) {
//			if (arr[i]== value) {
//				System.out.println(i);
				System.out.println("Yes , It Has " + value+ " In This array");	
//			}
		}else if (i1!=value) {
					System.out.println(" no");
				
			
		}
	}
	if (value!= i) {
		
	} */
	
	


	
	
	
	
	}  
}
