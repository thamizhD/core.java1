package OOP;

public class Stack {
	int s[]=new int[10];
	int tos;
	Stack() {
		tos=-1;//initially there is -1
	}
     void push(int item) {
    	 if(tos==9)   	 
    		 System.out.println("Stack is full");
    	 else 
    	 s[++tos] = item; // by pre incrementing the tos the -1 will be 0 then 1,2,3,4....9 
     }
     int pop() {
    	 if(tos>=0)
    	 return s[tos--]; //post decrement after returning then it decrese the index the pop the nxt value 
    	 else
    	 {
    		System.out.println("Stack is empty");
    		return -1;
    		}
    	 
     }
}
