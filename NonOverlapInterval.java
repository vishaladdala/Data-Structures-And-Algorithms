/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    class myComparator implements Comparator<Interval>{
        public int compare (Interval a , Interval b){
            return a.start - b.start;
        }
    }
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        
        Arrays.sort(intervals , new myComparator());
        
        int prev = 0;
        int count = 0;
        
        for(int i = 1; i < intervals.length; i++){
            
            if(intervals[prev].end > intervals[i].start){
                if(intervals[prev].end > intervals[i].end){
                    prev = i;
                }       
                count++;     
            }
            else{
                prev = i;
            }
        }
        
       return count; 
        
    }
}