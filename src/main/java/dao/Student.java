package dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name = "id")
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="age")
	private int age;
	
	@Column(name="city")
	private String city;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getCity()
	{
		return city;
	}
	 public void setCity(String city)
	 {
		 this.city=city;
	 }
	
	
	
	
	
	
	
	
	
}
