package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer>ar = new ArrayList<Integer>();
		
		ArrayList<Integer>ar2 = new ArrayList<>();
		
		System.out.println(ar);
		System.out.println(ar.toString());
		
		//추가
		ar.add(3);
		ar.add(7);
		ar.add(1);
		
		System.out.println(ar);
		
		//길이
		System.out.println(ar.size());
		
		//조회
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		//원하는 자리에 추가
		//add(인덱스번호, 새로운 값)
		//해당 인덱스번호에 새로운 값이 추가된다
		ar.add(0,4);
		System.out.println(ar);
		
		//수정
		//set(인덱스번호, 새로운 값)
		//해당 인덱스번호의 값이 새로운 값으로 수정된다
		ar.set(0, 20);
		System.out.println(ar);
		
		//삭제
		ar.remove(0);
		System.out.println(ar);
		
		//존재 여부 확인
		System.out.println(ar.contains(20));
		
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		//Collections 클래스에 컬렉션에서 사용할수 있는
		//메서드들이 선언되어 있다
		
		//정렬(오름차순)
		Collections.sort(ar);
		System.out.println(ar);
		
		//정렬(내림차순)
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);
		
		//shuffle(안에 있는 숫자를 무작위로 바꾼다)
		Collections.shuffle(ar);
		System.out.println(ar);
		
	}

}
