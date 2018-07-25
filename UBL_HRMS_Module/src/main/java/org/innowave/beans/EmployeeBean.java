package org.innowave.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints= {@UniqueConstraint(columnNames= {"empl_Id"})})
public class EmployeeBean {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empl_Id",length=10,unique=true)
	private int empl_Id;
	@Column(name="empl_Name",length=20)
	private String empl_Name;
	@Column(name="empl_Add",length=20)
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
