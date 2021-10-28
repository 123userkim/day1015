package com.sist.exam02;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnderGraduate underGraduate = new UnderGraduate("홍길동", "20211234", "컴퓨터공학", 1, 24.0, "방송댄스");
		Graduate graduate = new Graduate("이순신", "20211111", "인공지능", 2, 15, "연구조교", 1);
		System.out.println(underGraduate);
		System.out.println(graduate);
		
	}
}