package simpleclient;

public class DataHandler {
    
    public static boolean userInputValid(String userTextInput, String userItterInput) {
        
        //checks if user input is valid. i.e. text is non-null and itteration
        //input is an integer greater than 0
        
        if(!userTextInput.isEmpty()) { //is not null?
            try {//is an integer?
                Integer.parseInt(userItterInput);
                if(Integer.parseInt(userItterInput) <=0) { //is greater than 0?
                    return false;
                } else {
                    return true;
                }
            } catch(NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
        
    }
}
