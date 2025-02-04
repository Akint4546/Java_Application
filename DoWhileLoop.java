import java.util.scanner;

public class DoWhileLoop{
    public static void main (string[] args){
		
		scannerscan = new scanner(system.in);
		int score;
		int sumofscore = 0;
		double average;
		int i=1
		
		do{
			
			
			system.out.print( "enter score :");
			score = scan.nextint();
			
			sumofscore += score;
			i++;
		}while(i <= 10);
		
		    average = (double)sumofscore/10;
			system.out.printf("The score average is %.2f",average); 
	}
}