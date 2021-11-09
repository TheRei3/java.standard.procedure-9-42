package ex9no42;

import java.util.*;

public class ex9no42 {  //  517p
	public static void main(String[] args) {
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		for(int i =0; i < result.length ; i++) {
			System.out.print(result[i] + "|");
		}
		
		System.out.println("개수 : " + result.length);
		
		int i = 0;
		for(;st.hasMoreTokens();i++) {
			System.out.print(st.nextToken() + "|");
		}
		
		System.out.println("개수 : " + i);
	}

}
