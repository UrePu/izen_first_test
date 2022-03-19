package 주차관리;

public class 차량정보 { //박영근작성

	
	//필드
	private int 차량번호;
	private int 입차시간;

	
	
	
	//생성자
	
	public 차량정보() {};
	//빈생성자
	
	

	public 차량정보(int 차량번호, int 주차시간) { //박영근작성
		super();
		this.차량번호 = 차량번호;
		this.입차시간 = 입차시간;
	}
	
	
	
	//메소드
	public int get차량번호() {
		return 차량번호;
	}
	public void set차량번호(int 차량번호) {
		this.차량번호 = 차량번호;
	}
	public int get주차시간() {
		return 입차시간;
	}
	public void set주차시간(int 주차시간) {
		this.입차시간 = 입차시간;
	}
	
	
	
	
	
	
}