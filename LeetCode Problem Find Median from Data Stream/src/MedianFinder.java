import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

	PriorityQueue<Integer> maxHeap;		//lower Half
	PriorityQueue<Integer> minHeap;		//upperHalf
    /** initialize your data structure here. */
    public MedianFinder() {
        maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        minHeap=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>num)
    	maxHeap.add(num);
        else
        	minHeap.add(num);
        
    	PriorityQueue<Integer> upperHalf=maxHeap.size()>minHeap.size()?maxHeap:minHeap;
    	PriorityQueue<Integer> lowerHalf=maxHeap.size()>minHeap.size()?minHeap:maxHeap;
//    	
    	if(upperHalf.size()-lowerHalf.size()>1)
    		lowerHalf.add(upperHalf.poll());
    }
    
    public double findMedian() {
    	
    	if(maxHeap.size()==minHeap.size())
    		return (double) (maxHeap.peek()+minHeap.peek())/2;
    	else if(maxHeap.size()>minHeap.size())
    		return (double) maxHeap.peek();
    	else
    		return (double) minHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */