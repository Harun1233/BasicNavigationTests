package utilities;

public class StringUtility {

    public static void verifyEquals(String expected,String actual){

        if(expected.equals(actual)){
            System.out.println("PASS");
            System.out.println("Expected result : " + expected);
            System.out.println("Actual result :"+ actual);

        }else{
            System.out.println("FAIL");
            System.out.println("Expected result : " + expected);
            System.out.println("Actual result :"+ actual);
        }




    }
}

