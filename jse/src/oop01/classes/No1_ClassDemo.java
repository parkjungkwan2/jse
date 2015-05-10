package oop01.classes;
/*
프로그래밍 발전 단계
1. 순차적 : GOTO , Line 번호, Fortan
2. 구조적 : 함수((Function) , main() , 포인터, 고속처리, Embeded
3. 객체지향 : 클래스(Class), Reference , C , C# , Java
 * */

/*
객체지향의 개념
1. 재사용성 : 콤포넌트(모듈) 지향 설계
2. 분리가능성 : S/W 모듈이 각각 분리될 수 있음
 * */

/*
개발순서
1. 설계 : 객체 모델링
	● 클래스의 속성과 메소드를 문서상으로 나열 정리
	● 메소드 Stub(원형, 구조) 새성
	● 클래스 형태로 멤버변수, 멤버베소드 선언
2. 정의 : 멤버 변수 정의, 메소드 기능 정의
3. 구현 : 정의된 클래스를 이용해서, 
			메모리상에 객체를 만들고,
			객체를 이용한 프로그래밍 작업
 * */

/*
클래스 구조
 ● 클래스란 ? 사용자 정의 데이터 타입
 ● Primitive Data Type -> 구조체(기본데이터 타입의 집합체) -> 클래스
 * */
public class No1_ClassDemo {
/*
문제) 
월말 급여 내역서 작성
단, 세금은 salary 의 10% 
income 은 salary - tax 

===급여 내역===
성명 :민호
본봉 :200
세금 :20
실수령액 :180

 * */
	public static void main(String[] args) {
		Pay p1 = new Pay();
		
		p1.salary = 200;
		p1.name = "민호";
		p1.tax = (int)(p1.salary * 0.1);
		p1.income = p1.salary - p1.tax;
		
		System.out.println("===급여 내역===");
		System.out.println("성명 : " + p1.name);
		System.out.println("본봉 : " + p1.salary);
		System.out.println("세금 : " + p1.tax);
		System.out.println("실수령액 : " + p1.income);
		
		
	}
}
class Pay{
	String name;
	int salary;
	int tax;
	int income;
}
