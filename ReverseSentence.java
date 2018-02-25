
public class ReverseSentence {

	public static void main(String[] args) {
		
		String sentence = "I am a man of my word.";
		
		
		String Reversesentence = reverseSentence(sentence);
		
		
		System.out.println(Reversesentence);
		
		

	}
	
	public static void reverse(char[] word, int left, int right){
		while( left < right){
			char c = word[left];
			word[left] = word[right];
			word[right] = c;
			left++;
			right--;
		}
		
	}
	
	public static String reverseSentence(String sentence){
		char[] sent = sentence.toCharArray();
		int i = 0;
		
		for(int j = 0 ; j < sent.length; j++){
			
			if(sent[j] == ' '){
				
				reverse(sent, i , j-1);
				i = j+1;
			}		
		}
		reverse(sent, i, sent.length-1);
		
		return new String(sent);
	}
	
	
	
	

}
