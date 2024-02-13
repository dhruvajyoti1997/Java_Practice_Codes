package FirstRepo;

import java.util.Comparator;

public class student  {

	private  String name;
	private int rollno;
	private int percentage;
	public student(String name, int rollno, int percentage) {
		//super();
		this.name = name;
		this.rollno = rollno;
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	//WE CAN CREATE A COMPARATOR EITHER BY STATIC OBJECT OR BY IMPLEMENTING IN THE CLASS NAME 
public static Comparator<student> rollno1 = new Comparator<student>()
{
public int compare1(student e1, student e2) {
	
	return e1.rollno - e2.rollno;
}	


@Override
public int compare(student o1, student o2) {
	// TODO Auto-generated method stub
	String name= "";
	return o2.name.compareTo(o1.name);
}
};
	
	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + ", percentage=" + percentage + "]";
	}
	
	
}
