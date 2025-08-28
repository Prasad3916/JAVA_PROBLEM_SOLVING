package placementteam.test;
import java.util.ArrayList;
class StackEmptyException extends Exception{
	public StackEmptyException(String msg){
		super(msg);
	}
} 
public class MyStack<T>{
	ArrayList<T> arrayList=new ArrayList<>();
	void push(T element){
		arrayList.add(element);
	}
	T pop() throws StackEmptyException {
		if(arrayList.isEmpty()){
			throw new StackEmptyException("Stack Is Empty!");
		}
		else{
			T removingElement=arrayList.get(arrayList.size()-1);
			arrayList.remove(removingElement);
			return removingElement;
		}
	}
	T peek()throws StackEmptyException { 
		if(arrayList.isEmpty()){
			throw new StackEmptyException("Stack Is Empty!");
		}
		else{
			return arrayList.get(arrayList.size()-1);
		}
	}
	boolean isEmpty(){
		return arrayList.isEmpty();
	}
	public static void main(String args[]){
		MyStack<Integer> myStack1=new MyStack<>();
		ArrayList<Integer> myStack=myStack1.arrayList;
		System.out.println(myStack);
		myStack1.push(10);
		myStack1.push(20);
		myStack1.push(30);
		System.out.println(myStack);
		try{
			myStack1.pop();
			myStack1.pop();
			myStack1.pop();
			myStack1.pop();
		}
		catch(StackEmptyException e){ 
			System.out.println("stack is empty");
		}
		MyStack<String> myStack2=new MyStack<>();
		ArrayList<String> myStack3=myStack2.arrayList;
		System.out.println(myStack3);
		myStack2.push("Java");
		myStack2.push("Backend");
		System.out.println(myStack3);
		try{
			myStack2.pop();
			myStack2.pop();
		}
		catch(StackEmptyException e){ 
			System.out.println("stack is empty");
		}
		System.out.println(myStack3);
	}
}
