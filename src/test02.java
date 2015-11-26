import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class test02 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("D:/test.txt"); // 바이트 기반 : 파일 크기만 리턴해줌
		int readByteNo;
		byte[] readBytes=new byte[100];
		while((readByteNo=is.read(readBytes))!=-1){
			System.out.println(readByteNo);
		}
		
		is.close();
	}

}
