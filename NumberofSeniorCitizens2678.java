public class NumberofSeniorCitizens2678 {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (String s : details) {
            int age = Integer.parseInt(s.substring(11, 13));
            if (age > 60)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] deets = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };
        System.out.println(countSeniors(deets));
    }
}
