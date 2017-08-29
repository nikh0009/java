package tripathy.nikhil.networking;
//Java program to get the list of repositories of a particular user!
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class FirstHttps {
public static void main(String[] args) {
    JsonObject jobj= new JsonObject();
    JsonParser parser = new JsonParser();
    
  try {
      System.out.println("Enter the user name you want to search!");
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String user=br.readLine();
      final String USER_AGENT = "Mozilla/5.0";
      String url = "https://api.github.com/users/"+user+"/repos";
      URL obj = new URL(url);
      HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
      //Optional by default GET method used
      con.setRequestMethod("GET");
      //Set request header
      con.setRequestProperty("User-Agent", USER_AGENT);
      int response_code =con.getResponseCode();
      System.out.println(response_code);
      InputStream is = con.getInputStream();
      BufferedReader brr = new BufferedReader(new InputStreamReader(is));
      String res;
      StringBuilder temp=new StringBuilder();
      while((res= brr.readLine()) != null ) {
	  temp.append(res);
	  temp.append("\r");
      }
      brr.close();
     br.close(); 
     // System.out.println(temp.toString());
      JsonArray jarr = parser.parse(temp.toString()).getAsJsonArray();
      //Getting the entire object as Json array.
      System.out.println("User has "+jarr.size()+" repositories:\nList of repos!");
      for(int i=0;i<jarr.size();i++) {
	      jobj=(JsonObject)jarr.get(i);
	      String repo=jobj.get("name").toString();
	      System.out.println(repo.substring(1,repo.length()-1));
      }
  }catch(MalformedURLException e) {
      System.out.println("URL malformed!");
  }catch(IOException e) {
      System.out.println("IOException!");
  }catch(IllegalStateException e) {
      System.out.println("Illegal state exception!");
      e.printStackTrace();
  }
}
}
