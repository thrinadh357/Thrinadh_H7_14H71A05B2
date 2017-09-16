import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
                                  Date d1=new Date(2323223232L);
                                Student st = new Student(01,"Harikrihna",new Date(1997,03,06),63.568);
		Student st2 = new Student(02,"thrinadh",new Date(1997,04,06),63.568);
		Student st3 = new Student(03,"vamsi",new Date(11111111),63.568);
		Student st4 = new Student(04,"samskruthi",d1,63.568);
                                System.out.println("Id is :"+st2.getId());
                                System.out.println("FullName is :"+st2.getFullName());
		System.out.println("BirthDate is :"+st2.getBirthDate());
		System.out.println("Average marks is :"+st2.getAvgMark());
                                st3.setId(5);
 		st3.setFullName("sandeep");
		st3.setBirthDate(new Date(1995,05,05));
		st3.setAvgMark(99.8);
		System.out.println("Id is :"+st3.getId());
                                System.out.println("FullName is :"+st3.getFullName());
		System.out.println("BirthDate is :"+st3.getBirthDate());
		System.out.println("Average marks is :"+st3.getAvgMark());
		

                               
                               
                            

	}

}
