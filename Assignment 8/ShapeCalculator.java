class ShapeCalculator{
void area(int side){
int Square = side * side;
System.out.println(Square);
}

void area(int length, int width){
int Rectangle = length * width;
System.out.println(Rectangle);
}

void area(double radius){
double Circle = 3.14 * radius* radius;
System.out.println(Circle);
}
}
public class Shape{
public static void main(String[]args){
ShapeCalculator sc = new ShapeCalculator();
sc.area(7);
sc.area(28,9);
sc.area(6.5);
}
}