import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test10 {

	public static void main(String[] args) throws Exception {

		Path path=Paths.get("D:/JavaTest/Object.txt");
		System.out.println("디렉토리 여부: "+Files.isDirectory(path));
		System.out.println("파일 여부: "+Files.isRegularFile(path));
		System.out.println(Files.getLastModifiedTime(path));
		System.out.println(Files.size(path));
		System.out.println(Files.getOwner(path).getName());
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isWritable(path));
	}

}
