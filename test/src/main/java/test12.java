import java.io.*;

public class test12 {
    public static void main(String[] args) {

        InputStream input = null;
        OutputStream outPut = null;
        int n;
        try {
            input = new FileInputStream("C:\\Users\\Administrator\\Desktop\\git\\test\\target\\classes\\1.txt");
            outPut = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\git\\test\\target\\classes\\2.txt");
            while ((n = input.read())!=-1){
                outPut.write(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
