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
class Access1
{
public static void main(String args[])
{
Student3 s1=new Student3();
s1.setId(3003);
s1.setName("Yasasree");
System.out.println("ID:"+s1.getId());
System.out.println("Name:"+s1.getName());
Student3 s2=new Student3();
s2.setId(3008);
s2.setName("Nadiya");
System.out.println("ID:"+s2.getId());
System.out.println("Name:"+s2.getName());
Student3 s3=new Student3();
s3.setId(505);
s3.setName("Roshini");
System.out.println("ID:"+s3.getId());
System.out.println("Name:"+s3.getName());
Student3 s4=new Student3();
s4.setId(3026);
s4.setName("Chandana");
System.out.println("ID:"+s4.getId());
System.out.println("Name:"+s4.getName());
Student3 s5=new Student3();
s5.setId(506);
s5.setName("Geethika");
System.out.println("ID:"+s5.getId());
System.out.println("Name:"+s5.getName());
}
}