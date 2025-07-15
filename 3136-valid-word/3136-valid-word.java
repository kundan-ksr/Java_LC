class Solution {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public boolean isValid(String word) {
        if (word.length() < 3)
            return false;

        int v = 0, c = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch))
                continue;

            if (Character.isLetter(ch)) {
                if (VOWELS.contains(ch))
                    ++v;
                else
                    ++c;
            } else {
                return false; // invalid symbol
            }
        }
        return v > 0 && c > 0; //if Vowels and consonant present.
    }
}