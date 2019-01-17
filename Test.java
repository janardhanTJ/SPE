import java.util.scanner;
public class caladd{
pulbic static void main(String args[])
{
float a,b,res;
char choice,ch;
Scanner scan=new scanner(System.in);
do
{
System.out.println("Enter two numbers\n");
System.out.println("2.Exit\n");
System.out.print("3.Enter your choice:");
choice=scan.next().charAt(0);
switch(choice)
{
case '1': System.out.print("Enter your number:");
          a=scan.nextFloat();
          b=scan.nextFloat();
          res=a+b;
          System.out.print("Result=" +res);
          break;
case '2': System.exit(0);
          break;
default : System.out.print("Invalid choice!");
          break;
}
System.out.print("\n----------------------------------\n");
}while(choice!=2);
