import java.util.Scanner;
interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
public class StringStack implements Stack {
	private int len; //stack ��ü ����
	private int re_num; //���� stack
	private String[] stack;
	public StringStack(int len) {
		this.len=len;
		re_num=len;
		stack=new String[len];
	}
	
	
	public int length() {
		return len - re_num; //���� ���ÿ�  �ִ� =��ü -���� 
	}
	public int capacity() {
		return len;
	}
	public String pop() {
		String result = stack[length()-1];
		re_num++;
		
		return result;
	}
	public boolean push(String val) {
		if (re_num == 0)
			return false;
		else {
			
			stack[length()]=val;
			re_num--;
			return true;
		}
	}
}

