package entity2;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.setSid(01);
		s1.setSname("Mercy");
		s1.setDept("ECE");
		s1.setYear(2025);
		s1.setMobileno("1234567890");
		
		s2.setSid(02);
		s2.setSname("Jayapriya");
		s2.setDept("ECE");
		s2.setYear(2025);
		s2.setMobileno("7894561230");
		
		s3.setSid(03);
		s3.setSname("Jyotsna");
		s3.setDept("ECE");
		s3.setYear(2025);
		s3.setMobileno("2468135790");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
