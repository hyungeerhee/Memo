package com.hyungeerhee.memo.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtils {
	
	// 문자열 암호화 기능
	// Hashing - md5(알고리즘)
	// 암호화 할 문자열을 전달 받고, 암화와된 문자열을 돌려주는 기능
	
	public static String md5(String message) {
		
		String result = "";
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			
			// 문자열을 byte 타입 데이터로 변환 
			byte[] bytes = message.getBytes();
			md.update(bytes);
			
			// 암호화된 결과 
			byte[] digest = md.digest();
			
			// byte 배열로 문자열로 변경 
			// 16진수 숫자 
			for(int i = 0; i < digest.length; i++) {
				// byte 값을 16진수로 변환
				// 비트연산 
				result += Integer.toHexString(digest[i] & 0xff);
				
			} 
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
