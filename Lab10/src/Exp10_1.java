import java.util.Calendar;
public class Exp10_1 {
	public static void Good(Calendar cal)
	{	
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("현재 시간은 "+cal.get(Calendar.HOUR_OF_DAY)+"시 "+cal.get(Calendar.MINUTE)+"분 입니다.");
		if (hour >= 4 && hour <12)
			System.out.println("Good Morning");
		else if (hour >= 12 && hour <18)
			System.out.println("Good Afternoon");
		else if(hour >= 18 && hour < 24)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	} 
	public static void main(String arg[]) {
		Calendar now = Calendar.getInstance();
		Good(now);
	}
		
	
}
