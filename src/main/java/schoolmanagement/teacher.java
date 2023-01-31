package schoolmanagement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class teacher {
	@Id
	private int id;
	private String name;
	private String sub;
	private double sal;
	public teacher(int id, String name, String sub, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
		this.sal = sal;
	}
	public teacher() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

}


