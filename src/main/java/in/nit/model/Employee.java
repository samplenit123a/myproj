package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@Column(name="eid")
	private int empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private double empSal;
	
	
}
