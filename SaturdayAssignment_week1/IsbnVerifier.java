import java.util.*;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        String cleaned = stringToVerify.replaceAll("[-]","");

        if (cleaned.matches(".*[a-vA-VyYzZ].*") || cleaned.matches(".*[^xX0-9].*")) {
            return false;
        }

        ArrayList<String> isbnList = new ArrayList<String>(Arrays.asList(cleaned.split("")));

        if (isbnList.size() != 10) {
            return false;

        }
        if(isbnList.contains("X")){
            if (isbnList.indexOf("X") != 9) {
                return false;
            }
        }

        ArrayList<Integer> isbnNum =new ArrayList<Integer>();
        for (int i = 0; i < isbnList.size() ; i++){

            if (isbnList.get(i).equals("X")) {
                isbnNum.add(10);

            }
            else{
                isbnNum.add(Integer.parseInt(isbnList.get(i)));
            }

        }

        int isbnsum = 0;

        for (int i = 0; i < isbnNum.size(); i++) {

            isbnsum = isbnsum + isbnNum.get(i) * (10-i);

        }

        if (isbnsum%11 == 0) {
            return true;

        }
        else{
            return false;
        }
    }

}
