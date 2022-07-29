package recursion;

import java.util.ArrayList;
import java.util.List;

public class ParenthesisGeneration {


    public static  void main(String... args)
    {
        ParenthesisGeneration pt = new ParenthesisGeneration();
        System.out.println(pt.generateParenthesis(3));
    }

   /* public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }*/

    public void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current))
                result.add(new String(current));
        } else {
            current[pos] = '(';
            generateAll(current, pos+1, result);
            current[pos] = ')';
            generateAll(current, pos+1, result);
        }
    }

    public boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }

    public List generateParenthesis(int n) {
            List res = new ArrayList();
            findAll("(",1, 0, res, n);
            return res;
        }

    public void findAll(String curr, int o, int c, List<String> res, int n){
        if(curr.length() == 2*n){
            res.add(curr);
            return;
        }


        if(o < n){
            findAll(curr+"(", o+1, c, res, n);
        }
        if(c < o){
            findAll(curr+")", o, c+1, res, n);
        }
    }


}
