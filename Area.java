import java.util.Scanner;
public class Area
{
   public double areatriangle(int base,int height)
   {
        return 0.5*base*height;
   }
   public double arearectangle(int length,int width)
   {
      return length*width;
   }
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      Area a=new Area();
      System.out.println("area of rectangle is " +a.arearectangle(8,7));
       System.out.println("area of triangle is " +a.areatriangle(6,7));
      
   }
}
   