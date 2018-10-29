import flyable.Aircraft;
import flyable.AircraftFactory;
import flyable.Flyable;
import sun.tools.java.ScannerInputReader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by msemenov on 10/29/18.
 */
public class Main {
    public static void main(String[] args) {

       try(Scanner sc = new Scanner(new File(args[0]))){

            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e){
           System.out.println(e.getMessage());
        }
    }
}
