import java.util.Stack;

public class QueueUsing2Stacks {
	public static class MyQueue<T>{
		private Stack<T> stackNewestonTop = new Stack<T>();
		private Stack<T> stackOldestonTop = new Stack<T>();
		
		
		public void enqueue(T value){ //Add item to queue
			stackNewestonTop.push(value);
		}
		
		public T peek(){ //get oldest item which is the first pushed item in stack 
			//move elements from stack newest to stackoldest
			shiftStacks();
			return stackOldestonTop.peek();
			
		}
		
		public T dequeue(){ //get oldest item and remove it
			//move elements from stacknewest to stackoldest
			shiftStacks();
			return stackOldestonTop.pop();
			
			
		}
		
		private void shiftStacks(){
			if(stackOldestonTop.isEmpty()){
				while(!stackNewestonTop.isEmpty()){
					stackOldestonTop.push(stackNewestonTop.pop());
				}
			}
		}
		
	}
	

}
