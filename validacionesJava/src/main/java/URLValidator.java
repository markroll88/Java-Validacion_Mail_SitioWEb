// Verificar si una URL es válida usando java.net.url
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;


public class URLValidator {
        public static boolean urlValidator(String url)
        {
            /*validación de url*/
            try {
                new URL(url).toURI();
                return true;
            }
            catch (URISyntaxException exception) {
                return false;
            }
            catch (MalformedURLException exception) {
                return false;
            }
        }
        public static void main(String[] args)
        {
            String url = "https://warm-quokka-907cd7.netlify.app/";
            /* validar la url */
            if (urlValidator(url))
                System.out.print("La url dada " + url + " es válida");
            else
                System.out.print("La url dada " + url + " no es válida");
        }
    }





