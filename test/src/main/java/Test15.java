import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Base64;

/**
 * @Author ZhuWei
 * @Date 2020/1/22 22:50
 * @Version 1.0
 */
public class Test15{
    public static void main(String[] args) throws Exception{
        //哈希算法
        MessageDigest md = MessageDigest.getInstance("sha-256");
        md.update("zhu".getBytes("utf-8"));
        md.update("wei".getBytes("utf-8"));
        byte[] re = md.digest();
        System.out.println(new BigInteger(1,re).toString(16));

        //对称加密算法
        String msg = "朱威";
        byte[] key = "1234567890abcdef".getBytes("UTF-8");
        byte[] input = msg.getBytes("UTF-8");
        //加密
        byte[] encrypted = encrypt(key, input);
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(encrypted));
        //解密
        byte[] decrypted = decrypt(key, encrypted);
        System.out.println("Decrypted: " + new String(decrypted, "UTF-8"));
    }

    /*
    对称加密算法 加密
    AES算法是目前应用最广泛的加密算法。我们先用ECB模式
     */
    public static byte[] encrypt (byte[] key, byte[] input) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(input);
    }

    /*
    对称加密算法 解密
    AES算法是目前应用最广泛的加密算法。我们先用ECB模式
    */
    public static byte[] decrypt (byte[] key, byte[] input) throws GeneralSecurityException{
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return cipher.doFinal(input);
    }
}
