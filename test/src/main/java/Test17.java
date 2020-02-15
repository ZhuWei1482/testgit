import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * Socket编程
 *
 * @Author ZhuWei
 * @Date 2020/2/15 18:39
 * @Version 1.0
 */
public class Test17 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1028);
        System.out.println("run.....");
        for(;;) {
            Socket s = ss.accept();
            Thread t = new SerThread(s);
            t.start();
        }
    }
}

class SerThread extends Thread{
    static int n;
    Socket socket;

    public SerThread(Socket socket){
        this.socket = socket;
        n++;
    }

    @Override
    public void run() {
        System.out.println("连接"+n);
        try {
            InputStream input = this.socket.getInputStream();
            OutputStream output = this.socket.getOutputStream();
            ser(input,output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ser(InputStream input, OutputStream output) throws IOException{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        writer.write("hello\n");
        writer.flush();
        for (;;) {
            String s = reader.readLine();
            if (s.equals("bye")) {
                writer.write("bye\n");
                writer.flush();
                break;
            }
            writer.write("ok: " + s + "\n");
            writer.flush();
        }
    }
}
