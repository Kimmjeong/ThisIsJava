import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test06 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:/JavaTest/InternetBookStore2.png");
		
		int readByteNo;
		byte[] readByes=new byte[100];
		while((readByteNo=fis.read(readByes))!=-1){
		}
		
		fis.close();
	}

}
