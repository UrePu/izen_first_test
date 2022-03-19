package 주차관리;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;





public class 컨트롤러 { //박영근작성
	//0. 게시물리스트
	public static ArrayList<차량정보> 차량리스트 = new ArrayList<>();
	
	
	//1.쓰기메소드
	public static void write(int 차량번호, int 입차시간) {
		// TODO Auto-generated method stub
		
	
		차량정보 입차객체 = new 차량정보 (차량번호,입차시간 ) ;
		// 1. 객체화
		차량리스트.add(입차객체);
		// 2. 리스트에 저장
		save();
		// 3. 파일에 저장
	

}
	//2.저장메소드
	public static void save() { //박영근작성
		try {
			// 1. 파일출력 클래스
		FileOutputStream outputStream = new FileOutputStream("C:/mine_data/입차내역.txt");
			// 2. 파일에 작성할 내용[한줄씩 게시물하나에 객체1개씩 ]
		for(차량정보 입차객체 : 차량리스트) {
			String 차량정보 = 입차객체.get차량번호() + "," +입차객체.get주차시간() +"\n";
		
			outputStream.write(차량정보.getBytes());

		}
		}catch(Exception e) {
			System.err.println("알림)) 저장 실패 관리자 에게 문의");
		}
		
	}
}
