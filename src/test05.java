import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test05 {

	public static void main(String[] args) throws Exception {

		File dir=new File("D:/JavaTest/FileTest2");
		File file1=new File("D:/test.txt");
		File file2=new File("D:/test3.txt");
		File file3=new File(new URI("file:///D:/test2.txt"));
		
		if(dir.exists()==false) {dir.mkdirs();}
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file2.createNewFile();}
		if(file3.exists()==false) {file2.createNewFile();}
		
		File temp=new File("D:/JavaTest");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd	a	HH:mm");
		File[] contents=temp.listFiles();
		
		System.out.println("날짜\t\t시간\t형태\t크기\t이름");
		System.out.println("------------------------------------");
		for(File file : contents){
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()){
				System.out.println("\t<DIR>\t\t\t"+file.getName());
			}
			else{
				System.out.println("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
	}
}
