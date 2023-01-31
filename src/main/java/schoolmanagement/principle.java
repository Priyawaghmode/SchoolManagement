package schoolmanagement;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class principle {
	private String name;
	private String age;
	private String mail;
	private String pass;
	@Id
	private String mobileno;
	public principle(String name, String age, String mail, String pass, String mobileno) {
		super();
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.pass = pass;
		this.mobileno = mobileno;
	}
	
	public principle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	
}


