import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.*;



class BufferedReader{

public static void main(String args[]) throws IOException{

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter string value:");
	String s = br.readLine();



}

}