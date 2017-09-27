package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class testRead {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
      
		BufferedReader br = new BufferedReader(new FileReader("/home/hadoop/Documents/re.txt"));
		
		
		String sCurrentLine;
		int a =0;
//		
		try {
			while ((sCurrentLine = br.readLine()) != null ) {
//				String[] sub = sCurrentLine.split(",");
//				if(sub[1].contains("false")&& sub[1].contains("true")){
//					a++;
				  Map<String, String>map=new HashMap<String, String>();   
			 sCurrentLine=	sCurrentLine.substring(2,sCurrentLine.length()-1).replace(")","");
			 String[] sub = sCurrentLine.split(",");
			 if(sCurrentLine.contains("true")&&sCurrentLine.contains("false")){
				 System.out.println(sCurrentLine);
				 a++;
			 }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(a);
	}

}
