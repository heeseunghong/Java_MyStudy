package day33;

public class Date1 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		System.out.println("시작시간:"+start);
		int a=0;
		for(int i=1;i<10000000;i++) {
			a++;
		}
		long and=System.currentTimeMillis();
		System.out.println("종료시간:"+and);
		System.out.println("걸린 작업 시간:"+(and-start));
	}

}
