import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
      int last= num1%100;
      int last_s=last/10;
      System.out.println(last_s);
	}
}