class Student1
{
int rollno;
String name;
static String college="ITS";
static void change()
{
college="MTIET";
}
Student1(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class Staticmethod
{
public static void main(String args[])
{
Student1 s1=new Student1(111,"Karan");
Student1 s2=new Student1(222,"John"); 
s1.display();
s2.display();
Student1.change();
s1.display();
s2.display();
Student1 s3=new Student1(333,"Aryan");
//s1.display();
//s2.display();
s3.display();
}
}