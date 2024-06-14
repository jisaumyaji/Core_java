import java.util.Stack;
public class dt_middlestack {

    public static void deletemiddle(Stack<Character> st){
      Stack<Character> dt = new Stack();
      int n= st.size();
      int count =0;
      while(count<n/2){
          char ch = st.peek();
          st.pop();
          dt.push(ch);
          count++;
      }
      st.pop();
      while(!dt.empty()){
          st.push(dt.pop());
         
      }
    }
    public static void main(String[] args) {
        Stack <Character> st = new Stack();
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');

        deletemiddle(st);
        while(!st.empty()){
            char p = st.peek();
            
            st.pop();
            System.out.println(p+" ");
        }


    }
}

