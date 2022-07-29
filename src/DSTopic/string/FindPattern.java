package DSTopic.string;
/*
Given a list of strings words and a DSTopic.Arrays.string pattern, return a list of words[i] that match pattern. You may return the answer in any order.
Example 1:

Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.
Example 2:

Input: words = ["a","b","c"], pattern = "a"
Output: ["a","b","c"]

Constraints:

1 <= pattern.length <= 20
1 <= words.length <= 50
words[i].length == pattern.length
pattern and words[i] are lowercase English letters.

["abcdefghijklab","abcdefghijkabl"]
"abcdefghijklab"

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindPattern {

    public static void main(String... args) {

        FindPattern fd = new FindPattern();
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        System.out.println(fd.findAndReplacePattern2(words, pattern));
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> output = new ArrayList<>();

        String patternCode = generatePatternCode(pattern);
        for (String word : words) {
            String patternMatch = generatePatternCode(word);
            if (patternCode.equals(patternMatch))
                output.add(word);
        }
        return output;
    }

    public String generatePatternCode(String createPattern) {
        String patternCodeofWord = "";
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < createPattern.length(); i++) {
            char ch = createPattern.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, count);
                patternCodeofWord = patternCodeofWord + "-" + count;
                count++;
            } else {
                patternCodeofWord = patternCodeofWord + "-" + map.get(ch);
            }
        }
        return patternCodeofWord;
    }

    public List<String> findAndReplacePattern2(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern)) res.add(word);
        }
        return res;
    }

    boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.indexOf(a.charAt(i)) + " " +b.indexOf(b.charAt(i)));
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}


