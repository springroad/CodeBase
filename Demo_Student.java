package StudyJava;

class DemoStudent{
	public static void main(String[] args){
		Demo_Student s1 = new Demo_Student();
		s1.setName("Spring");
		s1.setAge(22);
		
		System.out.println(s1.getName() + "-----" + s1.getAge());;
	}
}

public class Demo_Student {
	String name;
	int age;
	
	public Demo_Student(){}
	
	public Demo_Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
}
