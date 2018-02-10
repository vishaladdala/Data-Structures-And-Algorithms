
public class SearchForRange {

	public static void main(String[] args) {
		int[] arr = {2,2};
		
		int target = 2;
		
		int[] res  = searchRange(arr, target);
		
		for(int i = 0 ; i< res.length;i++){
			System.out.println(res[i]);
		}
		
		
	}
	
	
public static int[] searchRange(int[] nums, int target) {
        
        int first = getFirst(nums, 0, nums.length-1, target);
        
        int second = getLast(nums, 0, nums.length-1, target);
        
        int[] positions = new int[2];
        
        positions[0] = first;
        positions[1] = second;
        
        return positions;
        
        
    }
    
    static int getFirst(int[] numbers, int start, int end, int k) {
    	if(start > end)
    		return -1;
    		int middle = start + (end - start) / 2;
    		if(numbers[middle] == k) {
    		if((middle > 0 && numbers[middle - 1] != k)
    		|| (middle == 0))
    		return middle;
    		end = middle - 1;
    		}
    		else if(numbers[middle] > k){
    		end = middle - 1;
    		}
    		else {
    		start = middle + 1;
    		}
    		return getFirst(numbers, start, end, k);
    		}

    
        static int getLast(int[] numbers, int start, int end, int k) {
        	if(start > end)
        		return -1;
        		int middle = start + (end - start) / 2;
        		if(numbers[middle] == k) {
        		if((middle < numbers.length - 1 && numbers[middle + 1] != k)
        		|| (middle == numbers.length - 1))
        		return middle;
        		start = middle + 1;
        		}
        		else if(numbers[middle] > k){
        		end = middle - 1;
        		}
        		else {
        		start = middle + 1;
        		}
        		return getLast(numbers, start, end, k);
        		}

}
