
import javax.swing.JOptionPane;

public class NumbersGameTester
{
    public static void main (String args[])
    {
 
    String betType;
    int betAmount;
    int playersNum;
    int winningNum;
    
    betType = JOptionPane.showInputDialog("Enter your type of bet:");
    
    String betpane = JOptionPane.showInputDialog("Enter the amount you want to bet:");
    betAmount = Integer.parseInt(betpane);
    
   String playerpane = JOptionPane.showInputDialog("Enter your playing number:");
    playersNum = Integer.parseInt(playerpane);
    
   String winpane = JOptionPane.showInputDialog("Enter the winning number:");
    winningNum = Integer.parseInt(winpane);
     
    
	// if user inputs "Box Bet" execute the block of code.
if (betType.equalsIgnoreCase("Box Bet"))
{
	// Creating an instance of NumbersGame to call its methods.
	NumbersGame betgen = new NumbersGame(betAmount, playersNum, winningNum);
	betgen.setbetType(betType);
	System.out.println("Your player number was: " + playersNum 
	+ "\n Your winning number was: " + winningNum
	+ "\n Box Bet: " + betgen.boxBet()
	+  "\n amount betted: " + betgen.getbetAmount());
	
}
else if (betType.equalsIgnoreCase("Straight Bet"))
{
	NumbersGame betgen = new NumbersGame(betAmount, playersNum, winningNum);
	betgen.setbetType(betType);
	System.out.println("Your player number was: " + playersNum 
	+ "\nYour winning number was: " + winningNum
	+ "\nStraight Bet: " + betgen.straightBet()
	+ "\n amount betted: " + betgen.getbetAmount());
	
	
}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}