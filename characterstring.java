	public class characterstring {
    public static void main(String[] args) {
        String s = "Piyush sharma";
        int count = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("number of characters in string: " + count);
    }
}