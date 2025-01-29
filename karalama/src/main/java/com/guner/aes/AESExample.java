package com.guner.aes;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class AESExample {

    public static void main(String[] args) {
        try {
            // Generate AES key
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256); // Key size: 128, 192, or 256 bits
            SecretKey secretKey = keyGenerator.generateKey();

            /*
            // Generate a random IV
            byte[] iv = new byte[16];
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextBytes(iv);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);




             */
            // Sample plaintext
            String plaintext = "This is a secret message";

            // Encrypt the plaintext
            String encryptedText = encrypt(plaintext, secretKey, null);
            System.out.println("Encrypted Text: " + encryptedText);

            // Decrypt the encrypted text
            String decryptedText = decrypt(encryptedText, secretKey, null);
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to encrypt plaintext using AES
    public static String encrypt(String plaintext, SecretKey key, IvParameterSpec iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherText = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(cipherText);
    }

    // Method to decrypt ciphertext using AES
    public static String decrypt(String ciphertext, SecretKey key, IvParameterSpec iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] plainText = cipher.doFinal(Base64.getDecoder().decode(ciphertext));
        return new String(plainText);
    }
}
