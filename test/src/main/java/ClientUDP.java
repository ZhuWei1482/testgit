import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Socket编程 UDP
 * 客户端
 *
 * @Author ZhuWei
 * @Date 2020/2/16 17:47
 * @Version 1.0
 */
public class ClientUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        ds.setSoTimeout(1000);//设置等待时间
        ds.connect(InetAddress.getByName("localhost"), 6666); // 连接指定服务器和端口

        //创建数据包 发送消息
        byte[] bytesf = "Hello".getBytes();
        DatagramPacket dp = new DatagramPacket(bytesf, bytesf.length);
        ds.send(dp);

        //创建数据包 接收消息
        byte[] bytesj = new byte[1024];
        dp = new DatagramPacket(bytesj, bytesj.length);
        ds.receive(dp);
        String s = new String(dp.getData(), dp.getOffset(), dp.getLength());
        ds.disconnect();
    }
}
