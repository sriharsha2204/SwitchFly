package Json;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

import org.json.JSONObject;

/**
 * Fetch the Json data from URl and Count No. of Characters in a string
 */
public class FetchJson {
    /**
     * Fetch the Json data from URl and Count No. of Characters in a string
     *
     * @return String
     * @throws Exception
     */
    public String fetch() throws Exception {

        Properties properties = readPropertiesFile("JsonFile.properties");
        URL url = new URL(properties.getProperty("JSON_URL"));
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

        JSONObject object = new JSONObject(response.toString());
        System.out.println("title : " + object.getString("title"));

        String title = object.getString("title");

        return title;

    }

    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }

    public static void main(String[] args) throws Exception {
        FetchJson json = new FetchJson();
        Calculation calculation = new Calculation();

        FetchAndCalculate fetchAndCalculate = new FetchAndCalculate(json, calculation);
        fetchAndCalculate.getAndProcess();

    }
}


