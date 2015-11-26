import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class test01 {

	public static void main(String[] args) throws IOException {
		OutputStream os=new FileOutputStream("D:/test.txt");
		byte[] data="ABC".getBytes();
		os.write(data,1,2);
		
		os.flush();
		os.close();
	}

}
