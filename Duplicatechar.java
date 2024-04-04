public class Duplicatechar {

    public static void findDuplicateCharacters(String str) {
        str = str.toLowerCase();

        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            charCount[ch]++;
        }

        System.out.print("Duplicate characters in the string '" + str + "': ");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1 && (char) i != ' ') {
                System.out.print((char) i + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hello Welcome to Java";

        findDuplicateCharacters(str);
    }
}
