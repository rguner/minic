
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * Aes encryption
 */
public class AESDeneme {

	private static SecretKeySpec secretKey;
	private static byte[] key;

	private static String decryptedString;
	private static String encryptedString;

	public static void setKey(String myKey) {

		MessageDigest sha = null;
		try {
			key = myKey.getBytes("UTF-8");
			System.out.println(key.length);
			sha = MessageDigest.getInstance("SHA-1");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 16); // use only first 128 bit
			System.out.println(key.length);
			System.out.println(new String(key, "UTF-8"));
			secretKey = new SecretKeySpec(key, "AES");

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getDecryptedString() {
		return decryptedString;
	}

	public static void setDecryptedString(String decryptedString) {
		AESDeneme.decryptedString = decryptedString;
	}

	public static String getEncryptedString() {
		return encryptedString;
	}

	public static void setEncryptedString(String encryptedString) {
		AESDeneme.encryptedString = encryptedString;
	}

	public static String encrypt(String strToEncrypt) {
		try {
			// Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			Cipher cipher = Cipher.getInstance("AES");

			cipher.init(Cipher.ENCRYPT_MODE, secretKey);

			setEncryptedString(Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes("UTF-8"))));

		} catch (Exception e) {

			System.out.println("Error while encrypting: " + e.toString());
		}
		return null;
	}

	public static String decrypt(String strToDecrypt) {
		try {
			// Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			Cipher cipher = Cipher.getInstance("AES");

			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			setDecryptedString(new String(cipher.doFinal(Base64.decodeBase64(strToDecrypt))));

		} catch (Exception e) {

			System.out.println("Error while decrypting: " + e.toString());
		}
		return null;
	}

	public static void main(String args[]) {
		final String strToEncrypt = "ramazan guner";
		final String strPssword = "key1key1key2key2";
		AESDeneme.setKey(strPssword);

		AESDeneme.encrypt(strToEncrypt.trim());

		System.out.println("String to Encrypt: " + strToEncrypt);
		System.out.println("Encrypted: " + AESDeneme.getEncryptedString());

		final String strToDecrypt = AESDeneme.getEncryptedString();
		AESDeneme.decrypt(strToDecrypt.trim());

		System.out.println("String To Decrypt : " + strToDecrypt);
		System.out.println("Decrypted : " + AESDeneme.getDecryptedString());

	}

}
