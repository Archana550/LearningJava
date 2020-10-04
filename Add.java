//Adding two numbers by taking input from command line.

public class Add{
public static void main(String []args)
{
if(args.length==2)
{
int a= Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int s=a+b;
System.out.println("Sum of " + a+ "and" +b + "is" + s);
}
else
System.out.print("Wrong number of arguments");  
}
}
