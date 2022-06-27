package workshop1;
import java.lang.Math;
public class GamblerUc3 {

	public static void main(String[] args) {
	  	double result,stake=100, bet=1;
    System.out.println("UC2 is done");
     result=(Math.random());
     System.out.println(result);
     
	if((result>0.5)&&(result<1))
		{
		System.out.println("wins");
	    stake=stake+bet;
	 for(stake=100;stake<=150;stake++)
	 {
	    System.out.println("stake="+stake);
	 }	
	 }
	    else
		{
	    	System.out.println("loose");
	      stake=stake-bet;
		 for(stake=99;stake>=50;stake--)
		 {
	      System.out.println("stake="+stake);
		 }
		 }
	
	}

}
