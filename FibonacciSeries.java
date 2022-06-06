class FibonacciSeries
{
public static void main(String args[])
{
int a,b,c,count;
a=0;
System.out.print(a);
b=1;
System.out.print(" "+b);
count=0;
while(count<=10)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
count=count+1;
}
}
}