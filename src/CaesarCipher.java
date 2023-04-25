import static java.lang.Character.isLetter;

public class CaesarCipher {
    int shift;

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    CaesarCipher(int shift){
        this.shift = shift;
    }

    public String encrypt(String msg){
        String encryptedMsg = "";

        for(int i=0; i<msg.length(); i++){
            int pos = alphabet.indexOf(msg.charAt(i));
            if(isLetter(msg.charAt(i))){
                int encryptPos = ((pos + shift) % 26) ;
                if(encryptPos > 25)
                    encryptPos = encryptPos - 26;
                encryptedMsg = encryptedMsg + alphabet.charAt(encryptPos);
            }
            else
                encryptedMsg = encryptedMsg + msg.charAt(i);
        }
        return encryptedMsg;
    }

    public String decrypt(String msg){
        String decryptedMsg = "";

        for (int i = 0; i < msg.length(); i++) {
            int pos = alphabet.indexOf(msg.charAt(i));
            if (isLetter(msg.charAt(i))) {
                int decryptPos = ((pos - shift) % 26);
                if (decryptPos < 0)
                    decryptPos = decryptPos + 26;
                decryptedMsg = decryptedMsg + alphabet.charAt(decryptPos);
            } else
                decryptedMsg = decryptedMsg + msg.charAt(i);
        }
        return decryptedMsg;
    }
}
