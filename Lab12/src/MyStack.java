import java.util.ArrayList;
//stack�� �Ǿտ� �ְ�, ���ﶧ�� �Ǿտ��Ÿ�!
public class MyStack<T> implements IStack<T>{
	ArrayList<T> al = new ArrayList<T>();
	
	public T pop() {
		if(al.size() == 0)
			return null;
		return al.remove(0);
	}
	public boolean push(T ob)
	{
		
		al.add(0,ob);
		return true;
		
		
		}
}