import java.io.*;

public class test12 {
    public static void main(String[] args) {

        InputStream input = null;
        OutputStream outPut = null;
        int n;
        try {
            input = new FileInputStream(args[0]);
            outPut = new FileOutputStream(args[1]);
            while ((n = input.read())!=-1){
                outPut.write(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
