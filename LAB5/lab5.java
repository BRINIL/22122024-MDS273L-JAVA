import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cipher cipher = new Cipher();

        while (true) {
            System.out.println("Press 1. to Encrypt a message: \nPress 2. to Decrypt a message: \nPress 3. to Exit the program:");
            System.out.println("Select an option");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the message to Encrypt:");
                    String plaintext = scanner.nextLine();
                    String ciphertext = cipher.encrypt(plaintext);
                    System.out.println("Encrypted message: " + ciphertext);
                    break;
                case 2:
                    System.out.println("Enter the message to Decrypt:");
                    String ciphertext2 = scanner.nextLine();
                    String plaintext2 = cipher.decrypt(ciphertext2);
                    System.out.println("Decrypted message: " + plaintext2);
                    break;
                case 3:
                    System.out.println("You pressed 3 and now you successfully exited from the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}

class Cipher {
    private static final String PLAIN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CIPHER = "XYZABCDEFGHIJKLMNOPQRSTUVW";

    public String encrypt(String plaintext) {
        plaintext = plaintext.toUpperCase();
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            int index = PLAIN.indexOf(c);
            if (index >= 0) {
                ciphertext += CIPHER.charAt(index);
            } else {
                ciphertext += c;
            }
        }
        return ciphertext;
    }

    public String decrypt(String ciphertext) {
        ciphertext = ciphertext.toUpperCase();
        String plaintext = "";
        for (int i = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);
            int index = CIPHER.indexOf(c);
            if (index >= 0) {
                plaintext += PLAIN.charAt(index);
            } else {
                plaintext += c;
            }
        }
        return plaintext;
    }
}
