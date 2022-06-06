import java.util.Scanner;
public class QuadraticEquation{
public static void main(String args[]){
int a,b,c;
double root1,root2,d;
Scanner S=new Scanner(System.in);
System.out.println("Given quadratic equation: ax^2+bx+c");
System.out.print("Enter a value: ");
a=S.nextInt();
System.out.print("Enter b value: ");
b=S.nextInt();
System.out.print("Enter c value: ");
c=S.nextInt();
System.out.println("Enter quadratic equation is:" (+a "x^2" "+" +b "x" "+" +c ));

d=b*b-4*a*c;
if(d>0){
System.out.println("roots are real and unequal");
root1=(-b+ Math.sqrt(d)/(2*a));
root2=(+b+ Math.sqrt(d)/(2*a));
System.out.println("First root is: "+root1);
System.out.println("Second root is: "+root2);}
else if(d==0){
System.out.println("roots are real and equal");
root1=(-b+ Math.sqrt(d)/(2*a));
System.out.println("Root: "+root1);}
else{
System.out.println("roots are imaginary");
}
}}
