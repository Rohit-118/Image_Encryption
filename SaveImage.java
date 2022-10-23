import java.io.*;


public class SaveImage {

    public static void saveFile(byte[] bytes) throws IOException {

        FileOutputStream fos = new FileOutputStream("decrypt.jpg");
        fos.write(bytes);
        fos.close();

    }
    public static void saveFile2(byte[] bytes) throws IOException {

        FileOutputStream fos = new FileOutputStream("encrypt.jpg");
        fos.write(bytes);
        fos.close();
    }
    
}
