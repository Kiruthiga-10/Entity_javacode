package entity1;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		Customer c4=new Customer();
		Customer c5=new Customer();
		
		c1.setCid(01);
		c1.setName("Kiruthiga");
		c1.setAddress("Nathapattu");
		c1.setCity("Cuddalore");
		
		c2.setCid(02);
		c2.setName("Jayapriya");
		c2.setAddress("Mudhalayarpet");
		c2.setCity("pudhucherry");
		
		c3.setCid(03);
		c3.setName("Jyotsna");
		c3.setAddress("Lawspet");
		c3.setCity("pudhucherry");
		
		c4.setCid(04);
		c4.setName("Mercy");
		c4.setAddress("Semandalam");
		c4.setCity("Cuddalore");
		
		c5.setCid(05);
		c5.setName("Mugesh");
		c5.setAddress("Nathapattu");
		c5.setCity("Cuddalore");
		
		System.out.println("Customer id:"+c1.getCid()+" Customer name:"+c1.getName()+" Customer address:"+c1.getAddress()+" Customer city:"+c1.getCity());
		System.out.println("Customer id:"+c2.getCid()+" Customer name:"+c2.getName()+" Customer address:"+c2.getAddress()+" Customer city:"+c2.getCity());
		System.out.println("Customer id:"+c3.getCid()+" Customer name:"+c3.getName()+" Customer address:"+c3.getAddress()+" Customer city:"+c3.getCity());
		System.out.println("Customer id:"+c4.getCid()+" Customer name:"+c4.getName()+" Customer address:"+c4.getAddress()+" Customer city:"+c4.getCity());
		System.out.println("Customer id:"+c5.getCid()+" Customer name:"+c5.getName()+" Customer address:"+c5.getAddress()+" Customer city:"+c5.getCity());
	}

}
