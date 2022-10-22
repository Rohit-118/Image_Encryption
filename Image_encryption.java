

import java.io.*;

import java.security.*;
import javax.crypto.spec.SecretKeySpec;

import java.util.*;
public class Image_encryption {
    
    public static void main(String args[])
            throws NoSuchAlgorithmException, InstantiationException, IllegalAccessException, IOException {    
       Scanner scanner = new Scanner(System.in);

        SecretKeySpec secretKey;
        byte[] key;

        String myKey;
        System.out.println("Enter the key: ");
        myKey=scanner.nextLine();
        MessageDigest sha = null;
        key=myKey.getBytes("UTF-8");
        
        sha = MessageDigest.getInstance("SHA-1");
        key = sha.digest(key);
        key = Arrays.copyOf(key, 16); 
       secretKey = new SecretKeySpec(key, "AES");

        System.out.println("Enter 1 to encrypt and 2 to decrypt: ");
       
        int choice = scanner.nextInt();
       
       scanner.nextLine();
       System.out.println("Enter the path of the file to be encrypted/decrypted: ");
       String path = scanner.nextLine();
       path = path.replace("\\", "/");
        scanner.close();
        if (choice == 1) {
            byte[] content = GetByteArray.getFile(path);
            byte[] encrypted = CipherImage.encryptImage(secretKey, content);
            SaveImage.saveFile2(encrypted);
            System.out.println("File encrypted successfully");
        } else if (choice == 2) {
            byte[] content = GetByteArray.getFile(path);
            byte[] decrypted = CipherImage.decryptImage(secretKey, content);
            SaveImage.saveFile(decrypted);
            System.out.println("File decrypted successfully");
        } else {
            System.out.println("Invalid choice");
        }

    }

}