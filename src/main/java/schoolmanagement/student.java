package schoolmanagement;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class student {
	@Id
	private int id;
	private String name;
	private String Branch;
	private int fee;
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
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
		
	}
	public student(int id, String name, String branch, int fee) {
		super();
		this.id = id;
		this.name = name;
		Branch = branch;
		this.fee = fee;
		
	}
	public student() {
		super();
	}

}



