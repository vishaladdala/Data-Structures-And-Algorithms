/*
346. Moving Average from Data Stream
DescriptionHintsSubmissionsDiscussSolution
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

For example,
MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
*/

class MovingAverage {
     Queue<Integer> queue;
     int msize;
     double runningsum = 0.0;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<Integer>();
        msize = size;
    }
    
    public double next(int val) {
        if(queue.size() == msize){
            runningsum -= queue.remove();
            
        }
        queue.add(val);
        runningsum += val;
        return runningsum/queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */