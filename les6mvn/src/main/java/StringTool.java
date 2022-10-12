public class StringTool {

    public static String reverse (String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            result = c + result;
        }

        return result;
    }

    public static String makeDouble(String str) {
        return str + str;
    }
}
