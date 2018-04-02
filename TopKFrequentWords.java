class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < words.length; i++){
            if( map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
                map.put(words[i], 1);
            }
        }
        
        
        PriorityQueue<HashMap.Entry<String,Integer>> minheap = new PriorityQueue<>(
        (a,b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue()
        );
        
        
        for( Map.Entry<String,Integer> entry : map.entrySet()){
            minheap.offer(entry);
            
            if(minheap.size() > k){
                minheap.poll();
            }
        }
        
        List<String> res = new LinkedList<>();
        
        while(!minheap.isEmpty()){
            res.add(0,minheap.poll().getKey());
        }
        return res;
    }
}