package raf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 	
 * 	java.io.RandomAccessFile
 * 	RAF是专门设计用来读写文件数据的API，其基于指针对文件
 * 	任意位置进行读写操作。
 * 	@author muggle
 *
 */
public class RAFDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 	RAF常用的构造器
		 * 	RandomAccessFile(String path,String mode)
		 * 	RandomAccessFile(File file,String mode)
		 * 	对指定文件进行操作，第一个参数可以为字符串用于
		 * 	表示操作的文件的路径。也可以是一个File对象。
		 * 
		 * 	第二个参数是操作权限，有两种：
		 * 	"r":只是读操作
		 * 	"w":只是写操作
		 * 
		 * 	实例化RandomAccessFile时，如果抛出异常：
		 * 	FileNotFoundException
		 * 	通常由于下列情况导致：
		 * 	1：路径中含有不存在的目录
		 * 		列如：
		 * 		./demo/raf.dat	如果当前目录下没有demo目录
		 * 	2：raf.dat文件本身不存在，并且权限为"r"
		 * 	3：路径或文件名拼写有错误	
		 */
		RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
		
		/*
		 * 	向文件中写入1个字节，写入的是给定的int值
		 * 	所对应的2进制"低八位"
		 * 	void write(int d)
		 * 
		 * 
		 */
		raf.write(1);
		raf.write(2);
		System.out.println("写出完毕！");
		raf.close();
	}
}
