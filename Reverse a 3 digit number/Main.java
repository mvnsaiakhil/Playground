import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
    int first_d= num1%10;
    int mid_d= (num1%100)/10;
    int last_d=num1/100;
    System.out.print(first_d);
    System.out.print(mid_d);
    System.out.print(last_d);	
  }
}