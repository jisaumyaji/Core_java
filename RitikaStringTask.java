import java.util.*;

public class RitikaStringTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of substrings
        int N = Integer.parseInt(scanner.nextLine().trim());
        List<String> substrings = new ArrayList<>();

        // Read the substrings
        for (int i = 0; i < N; i++) {
            substrings.add(scanner.nextLine().trim());
        }

        // Read the main string
        String mainString = scanner.nextLine().trim();

        // Read the allowed number of deletions
        int K = Integer.parseInt(scanner.nextLine().trim());

        // Solve the problem
        String result = solve(substrings, mainString, K);
        System.out.print(result); // Use print to avoid an extra newline
    }

    private static String solve(List<String> substrings, String mainString, int maxDeletions) {
        // Step 1: Check if any character in mainString is not present in any substring
        Set<Character> substringChars = new HashSet<>();
        substrings.forEach(sub -> sub.chars().forEach(c -> substringChars.add((char) c)));

        // If any character in the mainString isn't covered by substrings, return "Impossible"
        if (!mainString.chars().allMatch(c -> substringChars.contains((char) c))) {
            return "Impossible";
        }

        // Step 2: Attempt to construct the mainString with deletions
        StringBuilder formedString = new StringBuilder();
        int deletionsUsed = 0;
        int mainIndex = 0; // Pointer in mainString

        while (mainIndex < mainString.length()) {
            boolean foundMatch = false;

            // Try to match the longest possible substring starting from mainString[mainIndex]
            for (String sub : substrings) {
                int matchIndex = 0; // Pointer in the substring

                // Match as much of the substring as possible with mainString
                while (matchIndex < sub.length() && mainIndex + matchIndex < mainString.length()) {
                    if (sub.charAt(matchIndex) == mainString.charAt(mainIndex + matchIndex)) {
                        matchIndex++;
                    } else {
                        break;
                    }
                }

                // If we matched some characters
                if (matchIndex > 0) {
                    foundMatch = true;
                    formedString.append(mainString, mainIndex, mainIndex + matchIndex);
                    mainIndex += matchIndex;

                    // If deletions exceed maxDeletions, return the formed string
                    deletionsUsed += (sub.length() - matchIndex); // Count deletions
                    if (deletionsUsed > maxDeletions) {
                        return formedString.toString();
                    }
                    break;
                }
            }

            // If no match was found, we need to delete this character
            if (!foundMatch) {
                deletionsUsed++;
                mainIndex++;

                // Track the longest formed string before exceeding deletions
                if (deletionsUsed > maxDeletions) {
                    return formedString.length() > 0 ? formedString.toString() : "Nothing";
                }
            }
        }

        // Step 3: Determine final output based on the formed string and deletions
        if (formedString.length() == mainString.length() && deletionsUsed <= maxDeletions) {
            return "Possible"; // Entire string formed within maxDeletions
        } else if (formedString.length() > 0) {
            return formedString.toString(); // Partial string formed within allowed deletions
        } else {
            return "Nothing"; // No portion could be formed
        }
    }
}
