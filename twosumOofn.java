import java.util.HashMap;

public class twosumOofn {

	public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int sum = 9;
        
        int[] twosumindex = twosum (array, sum);
        
        for(int i: twosumindex){
        	System.out.println(i);
        }

	}
	
	public static int[] twosum (int[] array, int sum){
		if(array.length == 0){return new int[]{0,0};}
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<array.length; i++){
			int complement = sum - array[i];
			
			if(map.containsKey(complement)){
				return new int[]{map.get(complement), i};
			}
			
			map.put(array[i], i);
		}
		throw new IllegalArgumentException("No two sum exists");
		
	}

}
