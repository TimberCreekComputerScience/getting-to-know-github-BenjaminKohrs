import java.util.Scanner;
public class Lemons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("How many cups of lemonade would you like?"); 
	Scanner scan = new Scanner (System.in);
double Lemonade = 5;
double cups = scan.nextInt();
double total = Lemonade * cups;
	if (cups > 0) {
		System.out.printf("You owe us $%8.2f",total);
	} else {
		System.out.printf("You owe us ONE MILLION DOLLARS");
	}
		}

}
