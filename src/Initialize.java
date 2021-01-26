import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Initialize {

    private String readUserName(String format, Object... args) throws IOException {
        if(System.console() != null){
            return System.console().readLine(format, args);
        }
        System.out.print(String.format(format, args));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private char[] readPassword(String format, Object... args) throws IOException {
        if (System.console() != null)
            return System.console().readPassword(format, args);
        return this.readUserName(format, args).toCharArray();
    }

    /** test main */
    public static void main(String[] args) throws IOException {
        Initialize newMain = new Initialize();
        Console newConsole = System.console();
        String userName = newMain.readUserName(" User Name : ");
        char[] password = newMain.readPassword(" Password : ");
        System.out.println(" password : " + String.valueOf(password));
    }
}
