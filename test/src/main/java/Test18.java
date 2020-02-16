import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

/**
 *Socket编程 UDP
 *
 * @Author ZhuWei
 * @Date 2020/2/16 17:34
 * @Version 1.0
 */
public class Test18 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8080);
        for(;;){//无限循环
            //创建数据包
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            // 收取到的数据存储在dp中，由dp.getOffset(), dp.getLength()指定起始位置和长度
            // 将其按UTF-8编码转换为String:
            String s = new String(dp.getData(), dp.getOffset(), dp.getLength(), StandardCharsets.UTF_8);
            //发送数据
            byte[] data = "ACK".getBytes(StandardCharsets.UTF_8);
            dp.setData(data);
            ds.send(dp);
        }
    }
}
