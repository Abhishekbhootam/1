import java.util.Scanner;

public class arrayDifference {
	


	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter No of array elements " );
		int n= scan.nextInt();
		int array[]= new int[n];
         int i=0;
    for (i=0;i<array.length;i++) {
			System.out.println("enter a value");
			 array[i]=scan.nextInt();			
		}
    int min = array[0];
	   for(i=0; i<n; i++)
 {
     if(min > array[i])
     {
         min= array[i];
     }        }	   
    System.out.println("min " + min);
	    int max = array[0];
	   for(i=0; i<n; i++)
    {
        if(max < array[i])
        {
            max= array[i];
        }        }	   
    System.out.println("largest  Element = " + max);     
   int x=max-min;
   System.out.println("diff is " + x);
    	}}
