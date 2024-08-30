public class WhiteSpaceRemover {

    public static void main(String[] args) {
        String stringWithBlanks = "        teste do teste teste      ";
        String result = removeSpaces(stringWithBlanks);
        System.out.println(result);
    }

    public static String removeSpaces(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
