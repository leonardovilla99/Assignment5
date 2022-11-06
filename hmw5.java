import java.util.*;

public class hmw5 {
    public static void main(String[] args) {
        System.out.println("The number of upper case inside (Hi,mY,name,Is,RoBert) is:");
        System.out.println(numOfUpperCase("Hi,mY,name,Is,RoBert"));
    }

    public static int numOfUpperCase(String wordListCSV){
        int n = 0;
        boolean upper;
        List<String> listWord = Arrays.asList(wordListCSV.split(","));
        for(int i=0; i<listWord.size(); i++){
            upper = false;
            for(int k=0; k<listWord.get(i).length(); k++){
                char c = listWord.get(i).charAt(k);
                if(Character.isUpperCase(c)){
                    upper = true;
                }
            }
            if(upper == true){
                n ++;
            }
        }
        return n;
    }
}
