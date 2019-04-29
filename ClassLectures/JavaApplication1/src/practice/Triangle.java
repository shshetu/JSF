
package practice;

public class Triangle {
    
    static double area;
    int b = 2, h = 3;
    public static void main(String[] args) {
         double p, b, h;  // line 1
         if (area == 0) {
             b = 3;
             h = 4;
             p = 0.5;
             area = b * h * p;
        }
           // line 1
         
         System.out.println("Area is: " + area);
    }
    
}
