package calisma4;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import java.security.Key;
import java.security.MessageDigest;
import java.util.Arrays;

public class AESEncrypt {

	private static final String ALGORITHM = "AES";

	/*
	public static void main(String[] args) {
		AESEncrypt aesEncrypt = new AESEncrypt();
		try {
			String encrypted = aesEncrypt.encrypt("ramazan");
			String decrypted = aesEncrypt.decrypt(encrypted);
			System.out.println(encrypted + "-->" + decrypted);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String encrypt(String valueToEnc) throws Exception {
		Key key = generateKey("1");
		Cipher c = Cipher.getInstance(ALGORITHM);
		c.init(Cipher.ENCRYPT_MODE, key);
		// Encode the string into bytes using utf-8
		byte[] utf8 = valueToEnc.getBytes("UTF8");
		byte[] encValue = c.doFinal(utf8);
		String encryptedValue = new BASE64Encoder().encode(encValue);
		return encryptedValue;
	}

	public String decrypt(String encryptedValue) throws Exception {
		Key key = generateKey("1");
		Cipher c = Cipher.getInstance(ALGORITHM);
		c.init(Cipher.DECRYPT_MODE, key);
		byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedValue);
		byte[] decValue = c.doFinal(decordedValue);
		// Decode using utf-8
		String decryptedValue = new String(decValue, "UTF8");
		return decryptedValue;
	}

	public static String toHexString(byte[] array) {
		return DatatypeConverter.printHexBinary(array);
	}

	public static byte[] toByteArray(String s) {
		return DatatypeConverter.parseHexBinary(s);
	}

	private static Key generateKey(String keyString) throws Exception {
		byte[] keyBytes = keyString.getBytes("UTF-8");
		MessageDigest sha = MessageDigest.getInstance("SHA-1");
		keyBytes = sha.digest(keyBytes);
		keyBytes = Arrays.copyOf(keyBytes, 16); // use only first 128 bit
		SecretKey key = new SecretKeySpec(keyBytes, ALGORITHM);
		return key;
	}

	 */
}
