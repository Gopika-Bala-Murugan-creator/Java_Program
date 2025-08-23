import java.util.*;

public class StringVsStringBuilder{
	public static void main(String[] args){
		int limit = 100000;
		long startTime = System.currentTimeMillis();
		String str="";
		for(int i=0; i<limit; i++){
			str+=i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time using String: "+(endTime-startTime)+ " ms");
	
		startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<limit; i++){
			sb.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Execution time using StringBuilder: "+(endTime-startTime)+ " ms");
	}
} 