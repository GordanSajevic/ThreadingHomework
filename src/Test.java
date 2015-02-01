import java.util.ArrayList;


public class Test {
	
	public static void main(String[] args) 
	{
		ArrayList<String> urls = new ArrayList<String>();
		urls.add("http://www.klix.ba/");
		urls.add("http://www.sportsport.ba/");
		urls.add("http://www.vijesti.ba/");
		urls.add("http://www.zenicablog.com/");
		urls.add("http://www.nba.com/");
		for (int i=0; i<urls.size(); i++)
		{
			Threads threads = new Threads(random(), urls.get(i));
			threads.start();
		}
	}

	private static String random() {
		int num = (int)(1+Math.random()*(5-1));
		if (num == 1)
		{
			return "klix";
		}
		else if(num == 2)
		{
			return "sportsport";
		}
		else if (num == 3)
		{
			return "vijesti";
		}
		else if (num == 4)
		{
			return "zenicablog";
		}
		return "nba";
	}

}
