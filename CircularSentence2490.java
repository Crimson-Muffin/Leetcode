class CircularSentence2490 {
    public boolean isCircularSentence(String s) {
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        String[] arr = s.split(" ");
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i - 1].charAt(arr[i - 1].length() - 1) != arr[i].charAt(0)) {
                return false;
            }
        }
        return true;
    }

    // optimized
    public boolean isCircularSentence1(String s) {
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;

        int k = s.indexOf(" ");
        if (k == -1)
            return true;

        while (k != -1) {
            if (s.charAt(k - 1) != s.charAt(k + 1)) {
                return false;
            }

            k = s.indexOf(" ", k + 1);
        }
        return true;
    }
}