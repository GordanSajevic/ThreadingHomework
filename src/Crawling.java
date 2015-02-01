import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class Crawling {
	
	private String file;
	private String url; 
	private String path = System.getProperty("user.home") + File.separator + "workspace" + 
			File.separator + "ThreadingHomework" + File.separator + "src" + File.separator + 
			"Files" + File.separator;
	public static int counter = 0;
	
	public Crawling(String file, String url) 
	{
		
		this.file = file;
		this.url = url;
		this.path += file;
		crawlingUrl();
	}
	
	private void crawlingUrl()
	{
		
		try {
			URL address = new URL(this.url);
			URLConnection connection = address.openConnection();
			InputStream in = connection.getInputStream();
			FileOutputStream fos = new FileOutputStream(this.path);
			URL currentUrl = connection.getURL();
			int bytes = 0;
			byte[] buffer = new byte[1024];
			while ((bytes = in.read(buffer)) >= 0) {
				fos.write(buffer, 0, bytes);

			}
			PrintWriter out = new PrintWriter(new FileOutputStream(this.path, true));
			out.print(currentUrl.toString());
			fos.close();
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
