class Student
{
int rollno;
String name;
static String college="MTIET";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class Student1
{
public static void main(String args[])
{
Student a=new Student(111,"Karan");
Student b=new Student(222,"John");
Student.college="ITS";
a.display();
b.display();
}
}