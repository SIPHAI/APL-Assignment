import java.util.Scanner;

public class Exercise08 {
    //set the size of input password
public static final int PASSWORD_LENGTH = 8;

   public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print(
                    "A password must have exactly 8 characters.\n" +
                    "A password must consist of only digits and letters.\n" +
                    "A password must always start with a digit.\n" +
                    "A password must contain at least one uppercase letter. \n" +
                    "Input a password : ");
            String s = input.nextLine();

            if (is_Valid_Password(s)) {
                System.out.println("Password is valid: " + s);
            } else {
                System.out.println("Not a valid password: " + s.toUpperCase());
            }
        }

    }
//for the valid passwords within the counting and num count
    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
            
            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    //for uppercase Cha at least one.

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    //This is for counting the number from o to 9 is it the numeric or not?
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}
