package raf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("./image.png","r");
		RandomAccessFile desc = new RandomAccessFile("./image_copy.png","rw");
		int d;
		while((d = src.read())!=-1) {
			desc.write(d);
		}
		System.out.println("复制完毕!");
		src.close();
		desc.close();
	}
}
