public class Tirgul_1 {
	public static void main(String[] args) {
		//Q1:
		int num = MyConsole.readInt("enter number");
		System.out.println((num/10)%10);
		System.out.println((num%100)/10);
		//Q2:
		int a = MyConsole.readInt("Enter number a: ");
		int b = MyConsole.readInt("Enter number b: ");
		System.out.println(a + "," + b);
		b +=a;
		a = b-a;
		b -=a;
		System.out.println(a + "," + b);
		//Q3:
		double a = MyConsole.readInt("Enter number a: ");
		double b = MyConsole.readInt("Enter number b: ");
		double c = MyConsole.readInt("Enter number c: ");
		System.out.println("The avrage is:"+((a+b+c))/3);
		//Q4:
		int a = MyConsole.readInt("Enter number a: ");
		int b = MyConsole.readInt("Enter number b: ");
		System.out.println((a%b==0) || (b%a==0));
		//Q5:
		double radius = MyConsole.readInt("Enter number a: ");
		System.out.println("Koter: " + radius*2);
		System.out.println("Heikef: "+ (radius*2*3.14));
		System.out.println("Shetach: " + radius*radius*3.14);
	}
}
