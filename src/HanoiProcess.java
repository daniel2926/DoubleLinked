import java.util.Scanner;

public class HanoiProcess {
    public static int NumberOfMove = 0;
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n ;
            System.out.println("Enter number of disks (1 ≤ N ≤ 20): ");
            n = input.nextInt();

            if (n >= 1 && n <= 20){
                countMove(n,'1','2','3');
                System.out.println("The moves are: " +  NumberOfMove);
                moveDisks( n , '1', '2', '3');
            }
            else {
                System.out.println("Sorry only between 1 - 20! ");

        }

    }
    public static void countMove(int n, char firstTower, char SecondTower, char ThirdTower) {
        if (n == 1)
           NumberOfMove++;
        else {
            countMove(n - 1, firstTower, ThirdTower, SecondTower);
            NumberOfMove++;
            countMove(n - 1, SecondTower, firstTower, ThirdTower);
        }
    }

    public static void moveDisks(int n, char firstTower, char SecondTower, char ThirdTower) {
            if (n == 1)
                System.out.println("from " + firstTower + " to " + ThirdTower);
            else {
            moveDisks(n - 1, firstTower, ThirdTower, SecondTower);
            System.out.println("from " + firstTower + " to " + ThirdTower);
            moveDisks(n - 1, SecondTower, firstTower, ThirdTower);
        }
    }
}
