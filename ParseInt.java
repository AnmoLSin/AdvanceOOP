
import java.util.Scanner;

public class ParseInt {
	
Scanner s=new Scanner(System.in);
String a=s.next();
String b=s.next();

void big() {
	
	if(Integer.parseInt(a)>Integer.parseInt(b)) {
		
		System.out.println(a+" is Bigger");
	}
	else {
		
		System.out.println(b+" is Bigger");
	}
}
	public static void main(String[] args) {
		ParseInt p=new ParseInt();
		p.big();
	}
}