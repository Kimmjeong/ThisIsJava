import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {

		Socket socket=null; // 클라이언 소켓 : Socket
		
		try {
			socket=new Socket(); // 소켓 생성
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001)); // 소켓에 연결
			System.out.println("[연결 성공");
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
