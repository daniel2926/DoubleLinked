
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("exampleFile");
        if(file.exists()) {
            System.out.println("file already excist");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("Daniel Ganteng ");
        output.println(19);
        output.print("meisam husaine ");
        output.print(12);

        output.close();
    }

}
