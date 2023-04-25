import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Enter a message to encrypt/ decrypt:");
        String msg = prompt.nextLine().toUpperCase();

        System.out.println("Enter a shift key for encryption/ decryption: ");
        int key = prompt.nextInt();

        CaesarCipher ob = new CaesarCipher(key);

        System.out.println("Enter E to encrypt or D to decrypt: ");
        char c = prompt.next().charAt(0);
        if(c == 'E' || c == 'e')
            System.out.println("The encrypted message is:\n" + ob.encrypt(msg));
        else if(c == 'D' || c == 'd')
            System.out.println("The decrypted message is:\n" + ob.decrypt(msg));
        else
            System.out.println("Wrong input!");
    }
}