import java.net.InetAddress;
import java.net.UnknownHostException;

public class test09 {

	public static void main(String[] args) {

		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("郴哪腔磐 IP林家: " + local.getHostAddress());

			InetAddress[] iaArr = InetAddress.getAllByName("www.daum.net");
			for (InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP林家: " + remote.getHostAddress());
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
