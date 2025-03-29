package week3.day1;

public class OldClassToUpperClass {
    public static void main(String[] args) {
        String givenText="changeme";
        String changeText = "";
        char[] textArray = givenText.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            if(i%2 != 0)
            {
                char one = Character.toUpperCase(textArray[i]);
                changeText += one;
            }
            else
            {
                char two = textArray[i];
                changeText += two;
            }
        }
        System.out.println(changeText);
    }
}
