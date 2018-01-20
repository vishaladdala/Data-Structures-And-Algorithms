package anagram_mapping;

public class anagram_mapping {
	public static void main(String args[]){
		int[] a = {1,2,4,3,6,5,8,7,8,5};
		int[] b = {1,2,3,4,5,6,7,8};
		
		int[] map = anagram_map(a,b);
		
		for(int i = 0; i<map.length;i++){
			System.out.print(map[i]+"->");
		}
		
	}
	
	static int[] anagram_map(int[] a, int[] b){
		int[] temp = new int[a.length];
		
		
		for(int i = 0; i< a.length; i++){
			for(int j = 0; j < b.length; j++){
				if(a[i] == b[j]){
				temp[i] = j;
			
				}
			}
			
		}
		
		return temp;
		
		
	}

}
