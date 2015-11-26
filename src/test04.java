import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class test04 {

	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("D:/test.txt");
		char[] data="ABCD".toCharArray();
		for(int i=0;i<data.length;i++){
			writer.write(data[i]);
		}
		
		writer.flush();
		writer.close();
	}

}
