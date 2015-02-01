
public class Threads extends Thread{
	
	private String fileName;
	private String url;
	
	public Threads(String fileName, String url) 
	{
		this.fileName = fileName;
		this.url = url;
	}
	
	public void run()
	{
		Crawling crawler = new Crawling(fileName, url);
		crawler.counter++;
		System.out.println("Crawled " + crawler.counter + " time.");
	}

}
