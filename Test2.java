package com.sh.test;

public class Test2 {

	public static void main(String[] args) {
	
		Test2 test = new Test2();
		test.test2();
	}
	
	public void test2() {
		
		String name1 = "홍길동";
		int age1 = 22;
		String gender1 = "남";
		String number1 = "01012341234";
		String email1 = "hgd@naver.com";
		String address1 = "경기도 광주시";
		
		String name2 = "홍길순";
		int age2 = 20;
		String gender2 = "여";
		String number2 = "010123412341";
		String email2 = "hgs@gmail.com";
		String address2 = "전라남도 광주시";
		
		System.out.println("=======================================================================");
		System.out.printf("%s%5s%3s%8s%12s%13s\n", "이름", "나이", "성별", "전화번호", "이메일", "주소");
		System.out.println("=======================================================================");
		System.out.printf("%s, %s, %s, %s, %s, %s\n", name1, age1, gender1, number1, email1, address1);
		System.out.printf("%s, %s, %s, %s, %s, %s", name2, age2, gender2, number2, email2, address2);
		
	}
}