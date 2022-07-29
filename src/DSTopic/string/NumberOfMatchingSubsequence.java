package DSTopic.string;


import java.util.HashMap;
import java.util.Map;

/*
Given a DSTopic.Arrays.string s and an array of strings words, return the number of words[i] that is a subsequence of s.

A subsequence of a DSTopic.Arrays.string is a new DSTopic.Arrays.string generated from the original DSTopic.Arrays.string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".

Input: s = "abcde", words = ["a","bb","acd","ace"]
Output: 3
Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".


"qlhxagxdqh"
["qlhxagxdq","qlhxagxdq","lhyiftwtut","yfzwraahab"]
 */
public class NumberOfMatchingSubsequence {


    public static void main(String... args) {


        String s = "qlhxagxdqh";
        String[] words = {"qlhxagxdq", "qlhxagxdq", "lhyiftwtut", "yfzwraahab"};

        NumberOfMatchingSubsequence seq = new NumberOfMatchingSubsequence();
        System.out.println(seq.numMatchingSubseq(s, words));
    }


    public int numMatchingSubseq(String s, String[] words) {
        int countSubSequence = 0;
        for (String word : words) {
            char[] characters = word.toCharArray();
            int index = 0;
            boolean checkSeq = false;
            for (char charat : characters) {
                checkSeq = false;
                for (int i = index; i < s.length(); i++) {

                    if (charat == s.charAt(i)) {
                        index = i + 1;
                        checkSeq = true;
                        break;
                    }
                }
            }
            if (checkSeq)
                countSubSequence++;
        }
        return countSubSequence;
    }

// complexity  will be 0(N)
    public int numMatchingSubseqWithLessComplexity(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        int ans = 0;
        char ch[] = s.toCharArray();

        for (String str : map.keySet()) {
            char temp[] = str.toCharArray();
            int i = 0;
            int j = 0;
            while (i < ch.length && j < temp.length) {
                if (ch[i] == temp[j]) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            if (j == temp.length) {
                ans += map.get(str);
            }
        }
        return ans;

    }

}
