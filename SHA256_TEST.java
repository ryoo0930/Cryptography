public class App {
    public static void main(String[] args) throws Exception {
        String plaintext = "012";
        byte[] Ciphertext = new byte[32];
        System.out.println("plaintext: " + plaintext);
        SHA256.SHA256_Encrpyt(plaintext.getBytes(), plaintext.getBytes().length, Ciphertext);

        for (byte b : Ciphertext) System.out.printf("%02x ", b);
    }
}
