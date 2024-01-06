import java.util.Scanner;
class Student3
{
private int id;
private String name;
private String dept;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public void setDept(String dept)
{
this.dept=dept;
}
public int getId()
{
return this.id;
}
public String getName()
{
return this.name;
}
public String getDept()
{
return this.dept;
}
}
class Employee
{
public static void main(String args[])
{
Scanner s2=new Scanner(System.in);
Student3[] s1=new Student3[5];
for(int i=0;i<5;i++) {
s1[i]=new Student3();
s1[i].setId(s2.nextInt());
s1[i].setName(s2.next());
s1[i].setDept(s2.next());
}
System.out.println("Details are:\n");
for(int j=0;j<5;j++) {
System.out.println("ID:"+s1[j].getId());
System.out.println("Name:"+s1[j].getName());
System.out.println("Department:"+s1[j].getDept());
}
}
}
