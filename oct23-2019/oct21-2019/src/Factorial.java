class Factorial
{
static	int fact = 1;
public static void main(String[] args)
{

int a = factorial(5);
System.out.println(a);
}


public static int factorial(int num)
{
for(int i=num; i>=1; i--)
{
fact = fact  * i;
}
return fact;

}
}