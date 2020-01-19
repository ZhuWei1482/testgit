import java.io.*;
import java.nio.charset.StandardCharsets;

public class test13 {
    public static void main(String[] args) {
        //序列化理解，编写小游戏
        try {
            reade();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] authorInt={26417,23041,32534,20889};
        System.out.println(getAuthor(authorInt));
    }

    public static void reade() throws IOException {
        Reader rea= new CharArrayReader("朱威编写".toCharArray());
        for(;;){
            int n = rea.read();
            if(n == -1){
                break;
            }
            System.out.println(n);
        }
        rea.close();
    }

    public static String getAuthor(int[] authorInt){
        String author = "";
        for(int i = 0;i<authorInt.length;i++){
            author += (char)authorInt[i];
        }
        return author;
    }
}
