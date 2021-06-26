package com.vm.sprinboot.entity;

public class Student 
{
	
	private int id;
	private String name;
	private int sum;
	private int avg;
	
	/**
	 * we have declared parameterized constructor
	 * @param id
	 * @param name
	 * @param sum
	 * @param avg
	 */
	public Student(int id, String name, int sum, int avg) {
		super();
		this.id = id;
		this.name = name;
		this.sum = sum;
		this.avg = avg;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sum
	 */
	public int getSum() {
		return sum;
	}
	/**
	 * @param sum the sum to set
	 */
	public void setSum(int sum) {
		this.sum = sum;
	}
	/**
	 * @return the avg
	 */
	public int getAvg() {
		return avg;
	}
	/**
	 * @param avg the avg to set
	 */
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
	
	
	

}
