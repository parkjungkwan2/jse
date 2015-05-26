package oop06.nestedClasses;

import java.awt.Frame;

public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
		
		/*추상 내부클래스 출력*/
		// m.getInnerClassAnonyAbs2();
		/* 익명 내부클래스 출력*/
		m.getInnerClassAnonyImpl();  
		
		/* Static 내부클래스 출력*/
		// m.getInnerClassStatic();
		
		/* 지역 내부클래스 출력*/
		// m.getInnerClassLocal();

		/* 인스턴스 내부클래스 출력*/
		// m.getInnerClassInstance();
	}

	public void getInnerClassAnonyAbs2() {

		InnerClassAnonyAbs2 ex = new InnerClassAnonyAbs2();
		// 추상클래스 를 통해 멤변 메소드 출력 예제
		ex.inn.printData(); 

		/*
		 * 앞의 인터페이스와 추상클래스를 구분지어 쓰는 이유는 무엇인가 
		 * 추상클래스 디렉토리에는 AnonyInner2$1.class 라는
		 * 파일이 존재한다. 이런 파일들이 바로 익명 내부 클래스들이 컴파일되어 
		 * 생성된 바이트 코드이다. 이름이 정의 되지 않아
		 * 컴파일러가 임의로 숫자를 붙여 클래스 이름을 정한 것이다.
		 * 
		 * 추상클래스는 객체인 inn 이 정의되어서 여러군데애서 사용 가능한 점이 다르다.
		 */
	}

	public void getInnerClassAnonyImpl() {
		InnerClassAnonyServiceImpl ai = new InnerClassAnonyServiceImpl();
		ai.print(); // 인터페이스
	}

	public void getInnerClassStatic() {
		InnerClassStatic.Inner inner = new InnerClassStatic.Inner();
		inner.printData();
	}

	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);

	}

	public void getInnerClassInstance() {
		InnerClassInstance.Inner inner = new InnerClassInstance().new Inner();
		inner.printData();
	}

	// Android 에서 많이 사용. 내부클래스
	class Game extends Thread {
		class MyExit extends Frame {
		}
	}
}