import java.io.*;



public class GetByteArray {

    public static byte[] getFile(String path){ 

        File f = new File(path);

       
       InputStream is = null;
       try {
           is = new FileInputStream(f);
       } catch (FileNotFoundException e2) {
           
           e2.printStackTrace();
       }
       byte[] content = null;
       try {
           content = new byte[is.available()];
       } catch (IOException e1) {
           
           e1.printStackTrace();
       }
       try {
           is.read(content);
       } catch (IOException e) {
           
           e.printStackTrace();
       }

       return content;
   }


    
}
