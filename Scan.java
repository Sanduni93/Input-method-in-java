import java.util.Scanner;
class Scan{
public static void main(String args[]){
	
	Scanner scn = new Scanner(System.in);
	//enter string value by using scanner
	System.out.println("Enter a String value:");
	String s = scn.nextLine();
	
	//enter interger value by using scanner
	System.out.println("Enter an integer value:");
	int a = scn.nextInt();
	
	//enter double value by using scanner
	System.out.println("Enter an double value:");
	double d = scn.nextDouble();
	
	//enter float value by using scanner
	System.out.println("Enter a float value:");
	float f = scn.nextFloat();
	
	//enter short value by using scanner
	System.out.println("Enter a short value:");
	short sh = scn.nextShort();
	
	//enter long value by using scanner
	System.out.println("Enter a long value:");
	long l = scn.nextLong();

	//enter byte value by using scanner
	System.out.println("Enter amount of bytes:");
	byte b = scn.nextByte();
	
}
}