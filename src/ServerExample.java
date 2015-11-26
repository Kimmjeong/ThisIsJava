import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket=null; // 서버소켓 : ServerSocket
		
		try {
			serverSocket=new ServerSocket(); // 소켓 생성
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); // 소켓생성
			
			while(true){
				System.out.println("[연결 기다림]");
				Socket socket=serverSocket.accept(); // 연결 요청이 들어오면 받음/ 클라이언트가 요청하기 전까지 블로킹 됨
				InetSocketAddress isa=(InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]"+isa.getHostName());
			}
		} catch (IOException e) {

			if(!serverSocket.isClosed()){
				try {
					serverSocket.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
	}

}
