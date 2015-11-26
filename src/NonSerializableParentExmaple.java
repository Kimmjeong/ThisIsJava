import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExmaple {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("D:/JavaTest/Object.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1="È«±æµ¿";
		child.field2="È«»ï¿ø";
		oos.writeObject(child);
		oos.flush();oos.close();fos.close();
		
		FileInputStream fis = new FileInputStream("D:/JavaTest/Object.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Child v=(Child) ois.readObject();
		System.out.println("field1: "+v.field1);
		System.out.println("field2: "+v.field2);
		ois.close(); fis.close();
	}
}
