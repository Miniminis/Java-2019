package w04FileInputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		
		//FileInput/FileOutput 기본형 
		OutputStream out = new FileOutputStream("output.txt"); //파일 output instance 생성 --> 새로운 파일 생성
		out.write(7); //생성된 파일에 7 출력 및 저장 
		out.close(); //파일output instance 닫기 
		
		InputStream in = new FileInputStream("output.txt"); //생성된 파일을 읽어 들이기 위한 InputInstance 생성 
		int data=0; //읽어들인 데이터를 저장하기 위한 변수 생성 및 초기화 
		int copyByte=0; //읽어들인 데이터의 크기를 보여주기위한 변수 생성 및 초기화 
		
		while(true) {
			data = in.read();//in.read() 를 통해 data 변수에 파일의 데이터 저장
			if(data==-1) {
				break; //만약 파일 안에 더이상 읽어들일 데이터가 없다면 --> -1 반환하므로 while문 탈출 
			}
			copyByte++; //바이트 데이터 1개 읽어들일때마다 데이터의 크기 1 증가시킴 
			System.out.println(data); //읽어 들인 데이터 확인을 위한 출력 
			
		}
		in.close(); //InputStream 닫기 
		System.out.println(copyByte); //총 읽어들인 데이터의 크기 측정 
		
		

	}

}
