import YouTube.CercaYoutube;

import java.util.Scanner;

/**
 * Created by checho on 29/11/2017.
 */
public class CercaResultats {

    private String url;
    private Scanner sc1 = new Scanner(System.in);

    public void CercaResultats() {

        JsonParser info = new JsonParser();
        CercaYoutube cercaYoutube = new CercaYoutube();

        String url;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introdueix una busqueda:");
        url = sc1.nextLine();                        //lee la ubicación
        url = url.replaceAll("\\s","+");            //sustituye los espacios por +
        url = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=" + url +"&key=AIzaSyBDGSa74VWHpyxEN_BmIb9kyhUrLwsJtsA"; //url que contiene el json
        System.out.println(url);

        try {

            cercaYoutube = info.readJsonFile(url);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
