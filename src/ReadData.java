import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception{
        java.io.File file = new java.io.File("exampleFile");

        Scanner input = new Scanner(file);

        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + score);
        }
        input.close();

    }
}
