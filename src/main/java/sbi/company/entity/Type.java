package sbi.company.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Type {
	@Id
	private int tid;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", name=" + name + "]";
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}

}
