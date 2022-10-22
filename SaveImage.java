import java.io.*;


public class SaveImage {

    public static void saveFile(byte[] bytes) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:/Users/KIIT/Desktop/test/test/dec.jpg");
        fos.write(bytes);
        fos.close();

    }
    public static void saveFile2(byte[] bytes) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:/Users/KIIT/Desktop/test/test/enc.jpg");
        fos.write(bytes);
        fos.close();
    }
    
}
