package Json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

public class FetchJson {
  public int fetch() throws Exception  // Fetch the Json data from URl and Count No. of letters in a string
    {

        URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
        URLConnection connection = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = reader.readLine()) != null)
            response.append(inputLine);

        reader.close();

        String toBeWritten = response.toString();
        System.out.println(toBeWritten);

        JSONObject object=new JSONObject(response.toString());
        System.out.println("title : "+object.getString("title"));

        String title=object.getString("title");
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < title.length(); i++) {
            if(title.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in a sentence
        System.out.println("Total number of characters in a sentence: " + count);
        return count;

    }
    public static void main(String[] args) throws Exception
    {
        FetchJson json=new FetchJson();
        json.fetch();
    }
}


