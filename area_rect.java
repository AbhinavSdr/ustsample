import java.util.Scanner;;

public class area_rect {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length = input.nextInt();
        System.out.println("Enter Width ");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area is " + area);
    }
}
