package 주차관리;

public class 매출정보 {
	private int 년;
	private int 월;
	private int 일;
	private int 매출;
	
	public 매출정보() {}

	
	
	
	
	public 매출정보(int 년, int 월, int 일, int 매출) {
		super();
		this.년 = 년;
		this.월 = 월;
		this.일 = 일;
		this.매출 = 매출;
	}





	public int get년() {
		return 년;
	}

	public void set년(int 년) {
		this.년 = 년;
	}

	public int get월() {
		return 월;
	}

	public void set월(int 월) {
		this.월 = 월;
	}

	public int get일() {
		return 일;
	}

	public void set일(int 일) {
		this.일 = 일;
	}

	public int get매출() {
		return 매출;
	}

	public void set매출(int 매출) {
		this.매출 = 매출;
	}

	
	
	
}
