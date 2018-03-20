class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i = 0 ; i < list1.length; i++){
            map.put(list1[i],i);
        }
        
        List<String> list = new ArrayList<String>();
        int minsum = Integer.MAX_VALUE;
        int sum;
        
        
        for(int j = 0 ; j<list2.length; j++){
            if(map.containsKey(list2[j])){
                sum = j + map.get(list2[j]);
                
                if( sum<minsum ){
                  minsum = sum;
                  list.clear();
                  list.add(list2[j]);
                  
                }
                else if(sum == minsum){
                    list.add(list2[j]);
                }
            }
            
        }
        return list.toArray(new String[list.size()]);
    }
}