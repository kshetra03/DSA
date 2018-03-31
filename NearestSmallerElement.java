import java.util.ArrayList;
import java.util.Stack;

/**
 * Problem --
 G[i] for an element A[i] = an element A[j] such that
 j is maximum possible AND
 j < i AND
 A[j] < A[i]

 Solution -

 1) Create a new empty stack st

 2) Iterate over array `A`,
 where `i` goes from `0` to `size(A) - 1`.
 a) We are looking for value just smaller than `A[i]`. So keep popping from `st` till elements in `st.top() >= A[i]` or st becomes empty.
 b) If `st` is non empty, then the top element is our previous element. Else the previous element does not exist.
 c) push `A[i]` onto st

 */

public class NearestSmallerElement {

    public static void main(String... args) {
        int[] A = new int[]{4,5,2,10,8};
        ArrayList<Integer> G = solution(A);
        for (Integer i : G)
            System.out.println(i);
    }

    public static ArrayList<Integer> solution(int[] A){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> G = new ArrayList<>();
        for (int i = 0; i < A.length; i++){
            while (!st.isEmpty() && (st.peek() >= A[i])){
                if (!st.isEmpty())
                    st.pop();
            }
            if (st.isEmpty())
                G.add(-1);
            else
                G.add(st.peek());

            st.push(A[i]);
        }
        return G;
    }
}
