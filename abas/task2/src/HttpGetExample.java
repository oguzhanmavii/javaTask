import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpGetExample {
    public static void main(String[] args) throws IOException{
        String url="https://jsonplaceholder.typicode.com/posts/1";

        //get request
        HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        //checked reponse
        int responseCode=connection.getResponseCode();
        System.out.println("GET request code :"+responseCode);

        //read response
        BufferedReader reader= new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response= new StringBuilder();

        while ((line = reader.readLine()) !=null){
            response.append(line);
        }
        reader.close();


        System.out.println("GET response:"+response.toString());
    }
}
