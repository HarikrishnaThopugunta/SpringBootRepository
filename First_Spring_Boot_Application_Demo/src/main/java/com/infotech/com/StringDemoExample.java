package com.infotech.com;

public class StringDemoExample {

	public static void main(String[] args) {
		
		/*
		 * String s1 = "ABC"; String s2 = "BC";
		 */
		String s1 = "BC";
		String s2 = "BANGALORE";
		System.out.println("op1 output --->"+getOutput(s1,s2,"op1"));
		System.out.println("op2 output --->"+getOutput(s1,s2,"op2"));
		
	}

	private static String getOutput(String str1, String str2, String value) {
		// TODO Auto-generated method stub
		String returnStr = "";
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		char[] arr;
		char[] compaingArray;
		if(value.equals("op1")) {
			arr = str1Array;
			compaingArray = str2Array;
		} else {
			arr = str2Array;
			compaingArray = str1Array;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(!isCharacterExist(arr[i], compaingArray)) {
				
				returnStr = returnStr.concat(String.valueOf(arr[i]));
			}
		}			
		return returnStr;
	}
	
	
	public static boolean isCharacterExist(char c,char[] charArray) {
		boolean isCharExixst = false;
		for(int i=0;i<charArray.length;i++) {
			if(c ==charArray[i]) {
				isCharExixst = true;
			}
		}
		
		return isCharExixst;
	}
	
	
	
	
	
	
}
