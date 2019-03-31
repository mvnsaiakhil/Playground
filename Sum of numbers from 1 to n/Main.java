import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
	     int sum = 0;  
      int i;
         // Run for loop until count reaches n
	     for( i = 1; i <=  n; i++)
	     {
             // Adding count with sum
	         sum = sum + i;
	     }
	     System.out.println(sum);



	}
}
