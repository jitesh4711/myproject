import java.util.*;
abstract class faculty
{
int i,j;
String name=new String();
void show()
{
Scanner jt=new Scanner(System.in);
System.out.println("enter your name");
name=jt.next();
System.out.println("enter your roll no");
i=jt.nextInt();

}
}
class student extends faculty
{
int m1,m2;
void getmark()
{
Scanner jt=new Scanner (System.in);
System.out.println("enter first number");
m1=jt.nextInt();
System.out.println("enter second number");
m2=jt.nextInt();
}
public static void main(String args[])
{
faculty f1=new faculty();
student s1=new student();
f1.show();
s1.getmark();
}
} 