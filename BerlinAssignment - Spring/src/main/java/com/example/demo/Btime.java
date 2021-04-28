package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "btime")
public class Btime {

	@Id
	@GeneratedValue
	public int id;
	public int hour1;
	public int hour2;
	
	public int min1;
	public int min2;
	
	public int hour;
	public int minute;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHour1() {
		return hour1;
	}
	public void setHour1(int hour1) {
		this.hour1 = hour1;
	}
	public int getHour2() {
		return hour2;
	}
	public void setHour2(int hour2) {
		this.hour2 = hour2;
	}
	public int getMin1() {
		return min1;
	}
	public void setMin1(int min1) {
		this.min1 = min1;
	}
	public int getMin2() {
		return min2;
	}
	public void setMin2(int min2) {
		this.min2 = min2;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}

}
