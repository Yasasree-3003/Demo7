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
class Access2
{
public static void main(String args[])
{
Student3[] s1=new Student3[5];
s1[0]=new Student3();
s1[0].setId(3003);
s1[0].setName("Yasasree");
System.out.println("ID:"+s1[0].getId());
System.out.println("Name:"+s1[0].getName());

//Student3[1] s2=new Student3[3]
s1[1]=new Student3();
s1[1].setId(3008);
s1[1].setName("Nadiya");
System.out.println("ID:"+s1[1].getId());
System.out.println("Name:"+s1[1].getName());

//Student3 s3=new Student3();
s1[2]=new Student3();
s1[2].setId(505);
s1[2].setName("Roshini");
System.out.println("ID:"+s1[2].getId());
System.out.println("Name:"+s1[2].getName());

//Student3 s4=new Student3();
s1[3]=new Student3();
s1[3].setId(3026);
s1[3].setName("Chandana");
System.out.println("ID:"+s1[3].getId());
System.out.println("Name:"+s1[3].getName());

//Student3 s5=new Student3();
s1[4]=new Student3();
s1[4].setId(506);
s1[4].setName("Geethika");
System.out.println("ID:"+s1[4].getId());
System.out.println("Name:"+s1[4].getName());
}
}