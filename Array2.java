import java.util.Scanner;
class Student3
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public int getId()
{
return this.id;
}
public String getName()
{
return this.name;
}
}
class Access3
{
public static void main(String args[])
{
Scanner s2=new Scanner(System.in);
Student3[] s1=new Student3[3];
for(int i=0;i<3;i++) {
s1[i]=new Student3();
s1[i].setId(s2.nextInt());
s1[i].setName(s2.next());
}
System.out.println("Details are:\n");
for(int j=0;j<3;j++) {
System.out.println("ID:"+s1[j].getId());
System.out.println("Name:"+s1[j].getName());
}
}
}
