public class KMP {

    static void match(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        int lps[] = new int[patternLength];
        computeLPS(pattern, lps, patternLength);

        int i = 0, j = 0;
        while (i <= textLength - patternLength + 1) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }

            }

            if (j == patternLength) {
                System.out.println("Pattern found at : " + (i - j));
                j = lps[j - 1];
            }

        }

    }

    static void computeLPS(String pattern, int lsp[], int patternLength) {
        int len = 0;
        int i = 1;
        lsp[0] = 0;

        while (i < patternLength) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lsp[i] = len;
                i++;
            } else {

                if (len != 0) {
                    len = lsp[len - 1];
                } else {
                    lsp[i] = 0;
                    i++;
                }

            }
        }

    }

    public static void main(String[] args) {
        String text = "Akashasdas";
        String pattern = "as";

        match(text, pattern);
    }
}
