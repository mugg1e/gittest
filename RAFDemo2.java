package raf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 
 * 	@author muggle
 *
 */
public class RAFDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf	= new RandomAccessFile("raf.dat","r");
		/*
		 *  int read()
		 * 	从文件中读取1个字节，并以int形式返回。
		 * 	 如果返回值为-1则表示读取到了文件末尾
		 *  EOF:end of file   文件末尾
		 *  
		 *  rad.dat文件内容
		 * 	00000001  00000010
		 */
		//00000000 00000000 00000000
		int d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		raf.close();
	}
}
