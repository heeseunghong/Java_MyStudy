package day13;
import java.util.*; // java.util 패키지에 있는 모든 클래스 import
public class Lotto {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random random= new Random();
		int lottoar[]=new int[6];
		int userar[]=new int[6];
		int bonus,bonususer;
		int count=0;
		// 로또배열에 6개의 랜덤값을 저장
		for(int i=0;i<6;i++) {
			lottoar[i]=random.nextInt(45)+1;//0~44->1~45
		}
		//bonus=random
		bonus=random.nextInt(45)+1;
		
		System.out.println("Lotto:"+Arrays.toString(lottoar)+",bonus:"+bonus);
		
		//사용자에게 6개의 값을 입력
		System.out.print("숫자 6개 입력:");
		for(int i=0;i<6;i++) {
			userar[i]=sc.nextInt();
		}
		System.out.print("보너스 값 입력:");
		bonususer=sc.nextInt();
		System.out.println("user:"+Arrays.toString(userar)+",bonus:"+bonususer);
		//로또배열의 값과 사용자배열의 값중 같은 값이 몇개 있는지 카운팅
		
		for(int j=0;j<6;j++) {
			for(int i=0;i<6;i++) {
				if(lottoar[j]==userar[i]) {
					count++;
				}
			}
		}
		System.out.println("총 맞춘 갯수:"+count);
		//count의 갯수에따라서 등수정하기
		if(count==6) {
			System.out.println("축하드립니다! 1등입니다!");
		}
		else if(count==5) {
			if(bonus==bonususer) {
				System.out.println("축하드립니다! 2등입니다!");
			}
			else {
				System.out.println("축하드립니다! 3등입니다!");
			}
		}
		else if(count==4) {
			System.out.println("축하드립니다! 4등입니다!");
		}
		else if(count==3) {
			System.out.println("축하드립니다! 5등입니다!");
		}
		else {
			System.out.println("아쉽지만 다음기회에..");
		}

	}

}
