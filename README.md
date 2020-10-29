# java-2020.10.26  云班课  实验三 学生模拟选课系统
## 实验3

### **计G202  2020322104  焦鸿霄**

**阅读程序**

**一、实验目的**

***初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法：***
1. 掌握面向对象的类设计方法（属性、方法)；
2. 掌握类的继承用法，通过构造方法实例化对象；
3. 学会使用super()，用于实例化子类；
4. 学会定义属性，促使属性的多样化
5. 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中；

**二、实验要求**

说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
* 人员：编号、姓名、性别、课程
* 教师：编号、姓名、性别、所授课程
* 学生：编号、姓名、性别、所选课程
* 课程：课程编号、课程名称、课程地点、教课教师、上课时间
* 学分
* * * 

**三、实验方法**

##### 实验流程图

![](https://h5.qzone.qq.com/page/photo?init=photo.v7/common/viewer2/index&picKey=NR8AVjZiQ2dBeE56VTJNek16TlRBeTlGR2FYNGJKN1FJIQcAcGhvdG9neg!!&ownerUin=1756333502&appid=4&topicId=V14OgiUM41LMqp_NR8AVjZiQ2dBeE56VTJNek16TlRBeTlGR2FYNGJKN1FJIQcAcGhvdG9neg!!_0_0&pre=http%3A%2F%2Fa1.qpic.cn%2Fpsc%3F%2FV14OgiUM41LMqp%2FruAMsa53pVQWN7FLK88i5hyXvgFzBcC59P9eulreqT7Y8xD1a*X*w4ni2wI55MR683e8IFaZcyAZOIPM*f3L546OhRbSX5n2e1Zrxk92Xik!%2Fm%26ek%3D1%26kp%3D1%26pt%3D0%26bo%3DdAXSAgAAAAADJ6M!%26tl%3D1%26vuin%3D1756333502%26tm%3D1603947600%26sce%3D60-3-3%26rf%3D0-0&useqzfl=1&useinterface=1&noCloseBtn=0&inqq=1)

##### 实验里的核心代码、注释
```
	//父类People的有参构造方法
	People(int id,String name,String sex,String major){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.major=major;
	}
```

```
	//父类People的输出方式toString()
	public String toString() {
		return "编码："+id+"\n"+
				"姓名："+name+
				"性别："+sex+
				"课程："+major;
	}
```

```
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
```

```
//通过嵌套语句：if...else..实现程序
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
```

**四、实验结果**

```
该学生已选课。

学生信息：
编码：2020322104
姓名：焦鸿霄
性别：女
课程：Java

学生选课信息：
课程编号：8323
课程名字：Java
课程地点：教0610
教课老师：王强
上课时间：周五03/04节

教师信息：
编码：202047
姓名：王强
性别：男
课程：Java

学分：6.0
```

**五、实验感想**

通过这次实验学会使用Java编写简单的继承方法，并巩固了java知识点，如：封装、继承、函数构造等，复习了之前的if...else...语句使用方法，同时学会了toString()和super的使用方法。

实验中遇到的问题：
1. 未提前复习导致上课实验进程慢，不会写代码；
2. 之前学过的嵌套语句基本忘记，需要重新复习；
3. 继承还是不熟练不会使用，通过同学的请教和课本的查阅解决问题。 
