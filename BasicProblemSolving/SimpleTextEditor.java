package BasicProblemSolving;

import java.util.*;

public class SimpleTextEditor {

    public static Stack<String> st = new Stack<>();
    public static List<Character> list = new ArrayList<>();

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            Scanner sc1 = new Scanner(System.in);
            String[] next = sc1.nextLine().split(" ");
            switch (Integer.parseInt(next[0])){
                case 1:
                    _append(st, next[1]);
                    break;
                case 2:
                    _delete(st, Integer.parseInt(next[1]));
                    break;
                case 3:
                    _print(st, Integer.parseInt(next[1]));
                    break;
                case 4:
                    _undo(st);
                    break;
            }
        }

        for (char c : list)
            System.out.println(c);
    }

    public static Stack<String> _append(Stack<String> st, String w){
        if (st.isEmpty())
            st.push(w);
        else
            st.push(new StringBuilder(st.peek()).append(w).toString());
        return st;
    }

    public static Stack<String> _delete(Stack<String> st, int k){
        try{
            String s = st.peek().substring(0, st.peek().length() - k);

            st.push(s);
        }catch (EmptyStackException e){
                st.push("");
        }
        return st;
    }

    public static void _print(Stack<String> st, int k){
        list.add(st.peek().charAt(k-1));
    }

    public static void _undo(Stack<String> st){
        st.pop();
    }

}
