import java.util.Scanner;

/**
 * @author Fırat Yıldrım
 * @since 21.12.2021
 */
public class Main {

    public static void main(String[] args) {
        int a,b,c;
        double area,u;

        Scanner input = new Scanner(System.in);

        // Get edges from user
        System.out.println("First edge : ");
        a = input.nextInt();

        System.out.println("Second edge : ");
        b = input.nextInt();

        System.out.println("Third edge : ");
        c = input.nextInt();

        //count u
        u=(double)(a+b+c)/2;

        //count area
        Double areaSquare = (u*(u-a)*(u-b)*(u-c));
        area = Math.sqrt(areaSquare);

        System.out.println(area);
    }
}
