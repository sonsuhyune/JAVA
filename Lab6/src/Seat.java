class Seat{ //�¼� �� ����(�̸� ����, ����, �̸�����, �¼� ���� ����)
	        //�� Ŭ������ �¼� ��ü�� ����� 
	        //�� �¼��̶� �����ϰ�, method�� ���� �ۼ��ϱ�
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
			return true; //�̹� ����Ǿ� ������ true
		else
			return false;
	}
	
}