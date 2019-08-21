package lesson02;

public class SecondProgram {

    public static String everyNth(String s, int n) {
        if (s.isEmpty()) {
            return "String is empty!";
        }

        String result = "";
        for(int i = 0; i < s.length(); i += n) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2)); // → "Mrce"
        System.out.println(everyNth("abcdefg", 2)); // → "aceg"
        System.out.println(everyNth("abcdefg", 3)); // → "adg"
        System.out.println(everyNth("", 5));
    }

}
