import java.io.FileInputStream;
import java.io.IOException;

public class test07 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream(
					"D:/2015-11-XML_UML/workspace/InternetBookStore/src/com/bookstore/main/InternetBookStore.java");
			
			int data;
			while((data=fis.read())!=-1){
				System.out.write(data);
			}
			
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
