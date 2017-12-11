import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import sun.net.www.protocol.http.HttpURLConnection;

/**
 * Hace la conexión con el servidor de internet
 * @author Manel Checho
 * @version 1.0
 */
public class Servidor {

    private static final String USER_AGENT = "Mozilla/5.0";

    /**
     * Prepara la conexión con el servidor con datos del tipo de la opción 1
     * @param link el link al servidor
     * @return response.toString()
     * @throws Exception
     */
    public static String datos(String link) throws Exception {

        String url = link;
        URL obj = new URL(url);

        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add request header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        //System.out.println("\nSending 'POST' request to URL : " + url);
        //System.out.println("Post parameters : " + urlParameters);
        //System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        //System.out.println(response.toString());
        return response.toString();
    }

    /**
     * Conecta con el servidor con datos del tipo de la opción 2
     * @param link el link al servidor
     * @return responser.toString()
     * @throws IOException
     */
    public static String datos2(String link) throws IOException {

        String url = link;
        URL obj = new URL(url);

        HttpURLConnection urlConnection = (HttpURLConnection) obj.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.setRequestProperty("User-Agent", USER_AGENT);

        BufferedReader bffReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String inputLine;
        StringBuffer response = new StringBuffer();         //response tiene el json

        while((inputLine = bffReader.readLine()) != null){

            response.append(inputLine);
        }

        bffReader.close();

        //System.out.println(response.toString());
        return response.toString();
    }


}
