import java.util.ArrayList;
//stack은 맨앞에 넣고, 지울때도 맨앞에거를!
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