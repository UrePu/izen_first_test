package 주차관리;

public class 차량정보 { //박영근작성

	
	//필드
	private String 차량번호;
	private String 입차시간;
	private String 출차시간;
	private int 매출;

	//전부 String 으로 바꿨습니다. 
	
	
	//생성자
	
	public 차량정보() {};
	//빈생성자
	
	
	
	public 차량정보(String 차량번호, String 입차시간) { //박영근작성 
		super();
		this.차량번호 = 차량번호;
		this.입차시간 = 입차시간; 
	}
	
	
		
	public 차량정보(String 차량번호, String 입차시간, String 출차시간, int 매출) {
		super();
		this.차량번호 = 차량번호;
		this.입차시간 = 입차시간;
		this.출차시간 = 출차시간;
		this.매출 = 매출;
	}
	
		
	
	
	public String get차량번호() {
		return 차량번호;
	}
	public void set차량번호(String 차량번호) {
		this.차량번호 = 차량번호;
	}
	public String get입차시간() {
		return 입차시간;
	}
	public void set입차시간(String 입차시간) {
		this.입차시간 = 입차시간;
	}
	public String get출차시간() {
		return 출차시간;
	}
	public void set출차시간(String 출차시간) {
		this.출차시간 = 출차시간;
	}
	public int get매출() {
		return 매출;
	}
	public void set매출(int 매출) {
		this.매출 = 매출;
	}
	
	
	
	
	
	
	
	
}