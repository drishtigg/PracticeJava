import java.util.*;

public class Strings {
    

    // for concatenation and length function
    /*{
        
        Scanner sc = new Scanner(System.in);
        String firstName = "Drishti";
        String lastName = "Gautam";
        String fullName = firstName + " " + lastName;
        
        System.out.println(fullName);   // print fullName which is using concatenation
        System.out.print(fullName.length());    // print length of the fullName

    }*/



   //compareTo function in string(Strings are compare with alphabetical value not length(eg. hello>cello))
    /*String name1 = "Tony";
        String name2 = "Tony";
        
        if(name1.compareTo(name2) > 0) {
            System.out.print("name1 is greater");
        } else if (name1.compareTo(name2) < 0){
            System.out.print("name2 is greater");
        }else{
            System.out.print("name1 is equal name2");
        }
    }*/


     // comparing 2 strings with equalto(==) to see the output which is wrong that's why we use compareTo 
    /* if(new String("Tony") == new String("Tony")) {
            System.out.print("String1 is equal to string2");
        }else{
            System.out.print("String1 is not equal to string2");
        }*/




     //SubString function here the upper limit not require if the string is printer till last charater 
     //substring = (begining index, ending index)   
        /* String sentence = "My Name Is Tony";
        String name = sentence.substring(2, 7); //upper limit is exlusive charater at index 7 will not print
        
        System.out.print(name);
       */

}
