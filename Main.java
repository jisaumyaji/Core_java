public class nextgreaterelement {
    
}

public class Main
{
    public static Solution(Stack<Integer> st){
        	Stack<Integer> sb = new Stack();
        	while(!sb.empty()){
            int n = sb.peek();
            while(!sb.empty()){
                int p = sb.peek();
                if(n==p){
                    continue;
                }
                else{
                    if(p>n){
                        sb.push(p);
                    }
                }
            }
     }        	
    }
	public static void main(String[] args) {
		Stack<Integer> st = new Stack();
		st.push(4);
		st.push(5);
		st.push(2);
		st.push(25);
		//output: 5,25,25,-1;
		Solution(st);
	}
	
}
