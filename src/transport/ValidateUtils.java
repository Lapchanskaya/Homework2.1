package transport;

public class ValidateUtils {


        public static String validateString ( String value, String defaultValue){
            return (value == null || value.isEmpty()) ? defaultValue : value;

        }



}
