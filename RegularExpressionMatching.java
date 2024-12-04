public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int n= s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==p.charAt(i)){
                i++;
            }
        }
    }
    public static void main(String[] args){
        String s = "aa";
        String p ="a*";
        RegularExpressionMatching obj = new RegularExpressionMatching();
        obj.isMatch(s,p);
    }
}



// Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

// '.' Matches any single character.​​​​
// '*' Matches zero or more of the preceding element.
// The matching should cover the entire input string (not partial).

 

// Example 1:

// Input: s = "aa", p = "a"
// Output: false
// Explanation: "a" does not match the entire string "aa".
// Example 2:

// Input: s = "aa", p = "a*"
// Output: true
// Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
// Example 3:

// Input: s = "ab", p = ".*"
// Output: true
// Explanation: ".*" means "zero or more (*) of any character (.)".
 

// Constraints:

// 1 <= s.length <= 20
// 1 <= p.length <= 20
// s contains only lowercase English letters.
// p contains only lowercase English letters, '.', and '*'.
// It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
