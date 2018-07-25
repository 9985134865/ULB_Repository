package org.innowave.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Jeevan1.Employee", uniqueConstraints= {@UniqueConstraint(columnNames= {"eid"})})
public class EmployeeBean {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eid",length=10,nullable=false,unique=true)
	private int empl_Id;
	@Column(name="ename",length=20,nullable=false,unique=false)
	private String empl_Name;
	@Column(name="eadd",length=20,nullable=false,unique=false)
	private String empl_Add;
	
	public int getEmpl_Id() {
		return empl_Id;
	}
	public void setEmpl_Id(int empl_Id) {
		this.empl_Id = empl_Id;
	}
	public String getEmpl_Name() {
		return empl_Name;
	}
	public void setEmpl_Name(String empl_Name) {
		this.empl_Name = empl_Name;
	}
	public String getEmpl_Add() {
		return empl_Add;
	}
	public void setEmpl_Add(String empl_Add) {
		this.empl_Add = empl_Add;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empl_Id=" + empl_Id + ", empl_Name=" + empl_Name + ", empl_Add=" + empl_Add + "]";
	}
	
	

}
