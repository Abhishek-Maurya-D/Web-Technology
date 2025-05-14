import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
public class URLDemo {
    public static void main(String[] args) throws URISyntaxException,IOException {
        try{
            URL url = new URL("https://www.example.com:8080/wt/myfolder/index.html#first");
            URL url1 = new URL("http","www.google.co.in",8635,"/one/index.html");
            URI uri = new URI("https://www.google.co.in");
            URL url2 = uri.toURL();
            HttpURLConnection urlConn = (HttpURLConnection)url2.openConnection();
            System.out.println(url2.getProtocol());
            System.out.println(url2.getHost());
            System.out.println(url2.getFile());
            System.out.println(url2.getPort());
            System.out.println(url2.getRef());
            System.out.println(urlConn.getRequestMethod());
            System.out.println(urlConn.getResponseCode());
            System.out.println(urlConn.getResponseMessage());
            System.out.println(urlConn.getContentLength());
            System.out.println(urlConn.getContentType());
            System.out.println(urlConn.getHeaderField(0));
            System.out.println(urlConn.getHeaderFieldKey(0));
            InputStream stream = urlConn.getInputStream();
            int i=0;
            while ((i = stream.read())!=-1) {
                System.err.print((char)i);
            }
        }
        catch(MalformedURLException mUrlException){
            System.out.println(mUrlException);
        }
    }
}