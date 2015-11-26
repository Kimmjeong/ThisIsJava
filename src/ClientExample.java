import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {

		Socket socket=null; // Ŭ���̾� ���� : Socket
		
		try {
			socket=new Socket(); // ���� ����
			System.out.println("[���� ��û]");
			socket.connect(new InetSocketAddress("localhost", 5001)); // ���Ͽ� ����
			System.out.println("[���� ����");
		} catch (IOException e) {
			if(!socket.isClosed())
				try {
					socket.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		}
		
	}

}
