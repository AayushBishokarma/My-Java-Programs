import java.util.Scanner;
class Myclass
{
public static boolean msg(int a , int b, int c)
{
a = a% 10;
b = b%10;
c = c%10;
if(a==b && b==c)
{
return true;
}
else
{
return false;
}
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
boolean d = msg(a,b,c);
System.out.println(d);
}
} 