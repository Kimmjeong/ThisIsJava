import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class test03 {

	public static void main(String[] args) throws IOException {

		Reader reader=new FileReader("D:/test.txt"); // 문자기반 : 문서 내용인 문자를 리턴해줌
		
		int readData;
		
		while((readData=reader.read())!=-1){
			char charData=(char)readData;
			System.out.print(charData);
		}
		
		reader.close();
	}

}
