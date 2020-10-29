package jhx;

public class People {
	 int id;
	 String name;
	 String sex;
	 String major; 
	//父类People的有参构造方法
	People(int id,String name,String sex,String major){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.major=major;
	}
	//父类People的输出方式toString()
	public String toString() {
		return "编码："+id+"\n"+
				"姓名："+name+
				"性别："+sex+
				"课程："+major;
	}
}
//课程
class Course {
	int id;
	String name;
	String place;
	String teacher;
	String time;
	Course(){
	}
	//构造函数
	Course(int id,String name,String place,String teacher,String time){
		this.id=id;
		this.name=name;
		this.place=place;
		this.teacher=teacher;
		this.time=time;
	}
	public String toString(){
		return "学生选课信息："+"\n"+
				"课程编号："+id+"\n"+
				"课程名字："+name+
				"课程地点："+place+
				"教课老师："+teacher+
				"上课时间："+time;
	}
	
}
//学生
class Student extends People{  
	Course scourse;
	double grade;
	
	Student(int id,String name,String sex,String major){
		super(id,name,sex,major);
	}
	
	public String toString() {
		return "学生信息："+"\n"+
	           super.toString()+"\n";
	}
	//实现属性的封装
	public Course getScourse() {
		return scourse;
	}
	public void setScourse(Course scourse) {
		this.scourse=scourse;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade=grade;
	}
}
//教师
class Teacher extends People{
	Course teacourse;
	String credit;
	
	Teacher(int id,String name,String sex,String major){
		super(id,name,sex,major);
	}
	public String toString() {
		return "教师信息："+"\n"+
	           super.toString()+"\n"+
	           "学分："+credit;
	}
	//实现属性的封装
	public Course getTeacourse() {
		return teacourse;
	}
	public void setTeacourse(Course teacourse) {
		this.teacourse=teacourse;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit=credit;
	}
}

