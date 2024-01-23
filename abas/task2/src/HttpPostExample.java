import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpPostExample {
    public static void main(String[] args) throws Exception{
        //target url
        String url="https://jsonplaceholder.typicode.com/posts";

        //post request
        HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type","application/json");
        connection.setDoOutput(true);

        //create post data
        String postData="{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";
        byte [] postDataBytes=postData.getBytes(StandardCharsets.UTF_8);

        //write data
        try(DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())){
            outputStream.write(postDataBytes);
        }
        //checked response
        int responseCode=connection.getResponseCode();
        System.out.println("POST request code :"+responseCode);

        //read response
        BufferedReader reader= new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response= new StringBuilder();

        while ((line = reader.readLine()) !=null){
            response.append(line);
        }
        reader.close();

        //write response
        System.out.println("Post response:" + response.toString());

    }
}
