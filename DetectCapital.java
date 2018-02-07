class DetectCapital {
     public boolean detectCapitalUse(String word) 
    {
    		if (word.equals(word.toUpperCase()))
    		{
    			return true;
    		}
    		else if (word.equals(word.toLowerCase()))
    		{
    			return true;
    		}
    		else
    		{
    			String newString = word.substring(1, word.length());
    			
    			if (newString.equals(newString.toLowerCase()))
    			{
    				return true;
    			}
    		}
    		
    		return false;
    }
}