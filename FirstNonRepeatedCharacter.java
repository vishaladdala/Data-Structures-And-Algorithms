import java.util.HashMap;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
	   String s  = "ssunny";
	  System.out.println(FirstNonRepeated(s));

	}
	
	public static Character FirstNonRepeated( String str ){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		int i, length;
		
		Character c;
		
		length = str.length();
		
		//Scan the str and build hash map
		for( i = 0; i < length; i++){
			c = str.charAt(i);
			if( map.containsKey(c)){
				map.put(c, map.get(c) + 1);
			}
			else{
				map.put(c, 1);
			}
		}
		//Search the hashmap in order of str
		for( i = 0; i < length; i++){
			c = str.charAt(i);
			if( map.get(c) == 1 ){
				return c;
			}
		}
		return null;
			
	}
}
