import java.util.Scanner;
public class AreaOfFigures {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String figure = input.nextLine();
        if(figure.equalsIgnoreCase("square"))
        {
            double side = input.nextDouble();
            System.out.printf("%.3f", areaSquare(side));
        }
        else if(figure.equalsIgnoreCase("rectangle"))
        {
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            System.out.printf("%.3f", areaRectangle(side1, side2));
        }
        else if(figure.equalsIgnoreCase("circle"))
        {
            double radius = input.nextDouble();
            System.out.printf("%.3f", areaCircle(radius));
        }
        else if(figure.equalsIgnoreCase("triangle"))
        {
            double side = input.nextDouble();
            double height = input.nextDouble();
            System.out.printf("%.3f", areaTriangle(side, height));
        }
    }
    public static double areaSquare(double side)
    {
        double area = 0.0;
        area = side * side;
        return area;
    }
    public static double areaRectangle(double side1, double side2)
    {
        double area = side1 * side2;
        return area;
    }
    public static double areaCircle(double radius)
    {
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }
    public static double areaTriangle(double side, double height)
    {
        double area = (side * height) / 2;
        return area;
    }
}
