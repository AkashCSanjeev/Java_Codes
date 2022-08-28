class RabinKarp {

    static void match(String text, String pattern) {
        int d = 255;
        int textLength = text.length();
        int patternLength = pattern.length();
        int hashPattern = 0;
        int hashText = 0;

        for (int i = patternLength; i > 0; i--) {

            hashPattern = (int) (hashPattern + (pattern.charAt(i - 1)) * Math.pow(d, patternLength - i));

            hashText = (int) (hashText + (text.charAt(i - 1)) * Math.pow(d, patternLength - i));
        }

        for (int i = 0; i <= textLength - patternLength; i++) {
            if (hashPattern == hashText) {
                int j;
                for (j = 0; j < patternLength; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                if (j == patternLength) {
                    System.out.println("Pattern found at : " + i);
                }

            }

            if (i >= textLength - patternLength)
                break;

            int sub = ((int) ((text.charAt(i)) * Math.pow(d, patternLength - 1)));
            int add = ((int) ((text.charAt(i + patternLength)) * Math.pow(d, 0)));

            hashText = (hashText - sub) * d + add;

        }

    }

    public static void main(String[] args) {

        String text = "Akashasdas";
        String pattern = "as";

        match(text, pattern);

    }
}
