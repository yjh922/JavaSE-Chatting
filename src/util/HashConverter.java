package util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashConverter {
	
	public HashConverter(String password) {
		//String password = "minzino";
		
		/*
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		*/
		
		// Hash 알고리즘으로 처리
		StringBuilder str = new StringBuilder();
		
		try {
			byte[] b = password.getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			
			byte[] hash = md.digest(b); // 쪼개진 바이트 데이터를 대상으로 알고리즘을 적용!!
			
			for(int i=0; i<hash.length; i++) {
				// System.out.println(hash[i]);
				String hex = Integer.toHexString(0xff & hash[i]);
				System.out.println(hex);
				if(hex.length() == 1) str.append("0");
				str.append(hex);
			}
			
			System.out.println(str.toString());
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
}
