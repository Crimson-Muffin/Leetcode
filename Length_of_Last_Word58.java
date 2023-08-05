class Length_of_Last_Word58{
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length()-s.lastIndexOf(" ")-1;
    }
}