import java.io.StringReader;

import YouTube.CercaYoutube;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

/**
 * Created by checho on 05/12/2017.
 */
public class JsonParser {

    public CercaYoutube readJsonFile(String url) {

        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader (new StringReader(url));

       CercaYoutube cercaYoutube = gson.fromJson(jsonReader, CercaYoutube.class);

        return cercaYoutube;
    }
}
