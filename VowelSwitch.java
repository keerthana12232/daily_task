import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);  // Read a single character
        
        
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
                break;
        }
        
        scanner.close();  
    }
}
