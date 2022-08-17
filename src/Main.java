import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How long is the passwords in digits ?");
        Scanner scanner = new Scanner(System.in);
        int digits = scanner.nextInt();

        String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String number_cases = "0123456789";
        String symbol_cases = "!@#$%^&*()_-+{},.<>/?";

        String password = "";

        for(int i = 0;i < digits;i ++){
            int rand = (int)(4*Math.random());

            switch (rand){
                case 0:
                    rand = (int)(lower_cases.length()*Math.random());
                    password += String.valueOf(lower_cases.charAt(rand));
                    break;
                case 1:
                    rand = (int)(upper_cases.length()*Math.random());
                    password += String.valueOf(upper_cases.charAt(rand));
                    break;
                case 2:
                    rand = (int)(number_cases.length()*Math.random());
                    password += String.valueOf(number_cases.charAt(rand));
                    break;
                case 3:
                    rand = (int)(symbol_cases.length()*Math.random());
                    password += String.valueOf(symbol_cases.charAt(rand));
                    break;
            }
        }
        System.out.println(password);
    }
}
