package patika;
import java.util.Scanner;
public class ArmstrongNumberFinder {

	public static void main(String[]args) {
		
		int op, d , b , c ,a ,number, numberofDigits = 0;
		//a  =  binler basamağı
		//b = yüzler basamağı
		//c = onlar basamağı
		//d = birler basamağı
	System.out.print("Enter the number : ");
	Scanner input = new Scanner(System.in);
	
	//Armstrong sayısı , sayıdaki rakamlarin basamak sayisi kadar üssünu alip toplayinca sayının kendisi kadar etmesidir
	//örneğin 407 = 64 + 0  + 343 = 407 olduğuna göre 407 bir armstrong sayısıdır.
	
   number = input.nextInt();
   op = number;
   while ( number!= 0 ) {
	   
	   numberofDigits++;
	   number = number / 10;
	   
}

   System.out.println("Number of digits : " + numberofDigits);
	
d  = op % 10 ; 
c  = op % 100 / 10;
b = op  % 1000 / 100; 
a = op / 1000;

System.out.println("100's digit : " +a);
System.out.println("100's digit : " +b);
System.out.println("10's digits : " +c);
System.out.println("1's digit : " +d);


int totala = 1 ;    
for (int i = 1 ; i <= numberofDigits ; i++) {
	 totala *= a ;
}



int totalb = 1 ;    
for (int i = 1 ; i <= numberofDigits ; i++) {
	 totalb *= b ; 
	

	   
}
int totalc = 1 ;    
for (int i = 1 ; i <= numberofDigits ; i++) {
	 totalc *= c ;
}

int totald = 1 ;    
for (int i = 1 ; i <= numberofDigits ; i++) {
	 totald *= d ;
}

int totalall = totald + totalc + totalb + totala ;

if (totalall == op ) {
	System.out.print("IT IS AN ARMSTRONG NUMBER !!!");
}else {
	System.out.print("It is not an Armstrong Number.");
}
	
	
	
	}

	

}