import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket=null; // �������� : ServerSocket
		
		try {
			serverSocket=new ServerSocket(); // ���� ����
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); // ���ϻ���
			
			while(true){
				System.out.println("[���� ��ٸ�]");
				Socket socket=serverSocket.accept(); // ���� ��û�� ������ ����/ Ŭ���̾�Ʈ�� ��û�ϱ� ������ ���ŷ ��
				InetSocketAddress isa=(InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������]"+isa.getHostName());
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
