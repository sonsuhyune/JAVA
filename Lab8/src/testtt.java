import java.util.StringTokenizer;
public class testtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("df=gdgw=ewr","=");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
