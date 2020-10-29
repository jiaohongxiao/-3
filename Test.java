package jhx;


public class Test {
	public static void main(String[] args) {
		Student stu=new Student(2020322104,"焦鸿霄\n","女\n","Java\n");
		Course cour=new Course(8323,"Java\n","教0610\n","王强\n","周五03/04节\n");
		Course nocourse=new Course();
		Teacher tch=new Teacher(202047,"王强\n","男\n","Java\n");
		tch.setCredit("6.0");
		tch.setTeacourse(cour);
		stu.setScourse(cour);
		stu.setScourse(nocourse);
		if (stu.getScourse().id==0) {
			 System.out.println("该学生已选课。\n");
			 System.out.println(stu);
			 System.out.println(cour);
			 System.out.println(tch);
		}
	else {
		     System.out.println("该学生未选课或已退课。\n");
		     System.out.println(stu);
		     System.out.println("该学生无选课信息！\n");
		}
		
	}
	
}
