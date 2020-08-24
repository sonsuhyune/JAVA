class Seat{ //좌석 값 설정(이름 설정, 삭제, 이름전달, 좌석 예약 여부)
	        //이 클래스로 좌석 객체를 만들기 
	        //한 좌석이라 생각하고, method랑 변수 작성하기
	private String name;
	public Seat() {
		this.name=null;
	}
	public String show_name() {
		return name;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public void delete_name(String name) {
		this.name = null;
	}
	public boolean check_name(String name) {
		if (this.name.equals(name))
			return true; //이미 예약되어 있으면 true
		else
			return false;
	}
	
}