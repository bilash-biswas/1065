import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] a = new int[6];
    int i,count = 0;
    for(i = 1;i <= 5;i++)
    {
     a[i] = input.nextInt();
    }
    for(i = 1;i <= 5;i++)
    {
    if(a[i] % 2 == 0)
    {
        count = count + 1;
    }
    }
    System.out.printf("%d valores pares\n", count);
  } 
}
