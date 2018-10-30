import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class DesEncrypter {

	Cipher ecipher;

	Cipher dcipher;

	public static void main(String[] argv) throws Exception {
		SecretKey desKey = KeyGenerator.getInstance("DES").generateKey();
		String key = "Bar12345Bar12345"; // 128 bit key
		// Create key and cipher
		// SecretKey aesKey = new SecretKeySpec(key.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES");
		DesEncrypter encrypter = new DesEncrypter(desKey);
		String encrypted = encrypter.encrypt("Don't tell anybody!");
		System.out.println(encrypted);
		String decrypted = encrypter.decrypt(encrypted);
		System.out.println(decrypted);
	}

	DesEncrypter(SecretKey key) throws Exception {
		ecipher = Cipher.getInstance("DES");
		dcipher = Cipher.getInstance("DES");
		ecipher.init(Cipher.ENCRYPT_MODE, key);
		dcipher.init(Cipher.DECRYPT_MODE, key);
	}

	public String encrypt(String str) throws Exception {
		// Encode the string into bytes using utf-8
		byte[] utf8 = str.getBytes("UTF8");

		// Encrypt
		byte[] enc = ecipher.doFinal(utf8);

		// Encode bytes to base64 to get a string
		return new BASE64Encoder().encode(enc);
	}

	public String decrypt(String str) throws Exception {
		// Decode base64 to get bytes
		byte[] dec = new BASE64Decoder().decodeBuffer(str);

		byte[] utf8 = dcipher.doFinal(dec);

		// Decode using utf-8
		return new String(utf8, "UTF8");
	}

}
