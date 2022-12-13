
import java.util.regex.*;
import java.util.*;
public class Email_Validation{
    public static void main(String args[]){
        ArrayList<String> email = new ArrayList<String>();
        email.add("marcealebrahim@gmail.com");
        email.add("ejemplo@domain.com");
        email.add("156ejemplo3@domain.com");
        email.add("codoacodo@ba.gob.ar");
        email.add("@helloworld.com");
        //Expresiones regulares como usé en JS
        String regx = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        //Compilacion de las expresiones regulares pra obtener los patrones
        Pattern pattern = Pattern.compile(regx);
        //Iteracionon del array lista de emails
        for(String email1 : email){
            //se craa la instancia de compatibildad
            Matcher matcher = pattern.matcher(email1);
            System.out.println(email1 +" : "+ matcher.matches()+"\n");
        }
    }
}