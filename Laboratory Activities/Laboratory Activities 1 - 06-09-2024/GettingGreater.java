import java.util.Scanner;

class GreaterValue {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Getting the Greater Value");
        
        System.out.print("Enter first character: ");
        char char1 = input.next().charAt(0);
        System.out.print("Enter second character: ");
        char char2 = input.next().charAt(0);
        
        char greater = (char) Math.max(char1, char2);
        
        System.out.println("-------------------------------------------");
        System.out.println("The character with greater value is: " + greater);
        System.out.println("-------------------------------------------");
        
        System.out.println("Showing the ASCII Codes");
        System.out.println(char1 + " : " + (int) char1);
        System.out.println(char2 + " : " + (int) char2);
        
        input.close();
    }
}
