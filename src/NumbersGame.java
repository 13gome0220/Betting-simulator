public class NumbersGame 
{
    private String betType;
    private int betAmount;
    private int playersNum;
    private int winningNum;

    public NumbersGame(int betAmount, int playerNum, 
                       int winningNum)
    {
        
        this.betAmount = betAmount;
        this.playersNum = playerNum;
        this.winningNum = winningNum;
    }
    
    public String getbetType()
    {
        return betType;
    }
    
    public void setbetType(String userData)
    {
        userData = this.betType;
    }
    
    public int getbetAmount()
    {
        return betAmount;
    }
    
    public int getplayersNum()
    {
        return playersNum;
    }
    
    public int getwinningNum()
    {
        return winningNum;
    }
    
    
    public int winfirstNum()
    {
        return (winningNum / 100);
    }
      public int playerfirstNum()
    {
        return (playersNum / 100);
    }
    
    public int winsecondNum()
    {
        return ((winningNum % 100) / 10);
    }
     public int playerssecondNum()
    {
        return ((playersNum % 100) / 10);
    }
    
    public int winthirdNum()
    {
        return (winningNum % 10);
    }
    public int playersthirdNum()
    {
        return (playersNum % 10);
    }
        
    public boolean straightBet()
    {
    
        if(playersNum == winningNum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    public boolean boxBet()
    {
    	if (playerfirstNum() == winfirstNum() || playerfirstNum() == 
            winsecondNum() || playerfirstNum() == winthirdNum())
        {
        return true;
        }
        else if(playerssecondNum() == winfirstNum() || playerssecondNum() == 
                winsecondNum() || playerssecondNum() == winthirdNum())
        {
        return true;
        }
        else if(playersthirdNum() == winfirstNum() || playersthirdNum() == 
                winsecondNum() || playersthirdNum() == winthirdNum())
        {
        return true;
        }
        else
        {
        return false;
        }
        
        
    }
        
        
            
}