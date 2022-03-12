import java.util.*;
public class Main {
    public static void main(String[] Args) {
        int check_mist = 1;
        System.out.println("Введите Строку:");
        while (check_mist==1) {
            Scanner scr_1 = new Scanner(System.in);
            String scr_1_string = scr_1.nextLine();
            char scr_1_string_arr[] = scr_1_string.toCharArray();
            for (int i = 1; i < scr_1_string_arr.length-1; i++) {
                char Letter = scr_1_string_arr[i];
                try {
                    check_mist = 0;
                    if(
                    (Character.isDigit(scr_1_string_arr[i])==true) || (
                    (Character.isLetter(scr_1_string_arr[i-1]) == true ) &
                    (Character.isLetter(scr_1_string_arr[i]) == true) &
                    (Character.isLetter(scr_1_string_arr[i+1]) == true) &
                    (scr_1_string_arr[i] ==  scr_1_string_arr[i-1]) &
                    (scr_1_string_arr[i] ==  scr_1_string_arr[i+1])  )
                    )
                    {throw new StringException(Letter);}
                    check_mist = 1;
                }
                catch (StringException e){
                    if (i == scr_1_string_arr.length-2) {
                        System.out.println(e.getLetter());
                        System.out.println("Введите строку без ошибок");}
                    check_mist = 1;
                }
            }
        }
    }
}
