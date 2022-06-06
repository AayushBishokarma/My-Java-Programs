import java.util.Scanner;
class ThisDemo
{
int n1,n2;
public void setvalues()
{
System.out.println("Enter n1 and n2 values");
Scanner sc = new Scanner(System.in);
n1 = sc.nextInt();
n2 = sc.nextInt();
this.n1=n1;
this.n2=n2;
//return this;
}
public void show()
{
if(n1>n2)
{
System.out.println("n1 is biggest " + n1);
}
else
{
System.out.println("n2 is biggest " + n2);
}
}
public static void main(String args[])
{
ThisDemo t= new ThisDemo();
t.setvalues();
t.show();
}
}