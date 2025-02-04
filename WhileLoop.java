import java.util.scanner;

public class WhileLoop{
    public static void main (string[] args){
		
		scannerscan = new scanner(system.in);
		int score;
		int sumofscore = 0;
		double average;
		int i=1
		
		while(i<=10){
			\
			system.out.print( "enter score :");
			score = scan.nextint();
			
			sumofscore += score;
		}
		    average = (double)sumofscore/10;
			system.out.printf("The score average is %.2f",average); 
	}
}