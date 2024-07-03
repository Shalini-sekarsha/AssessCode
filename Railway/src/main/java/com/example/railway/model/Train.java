package com.example.railway.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Tra_tbl")
public class Train {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tid")
private int tid;
	@Column(name="tname")
private String tname;
	@Column(name="time")
private int  time;
	public Train() {
		super();
		
	}
	public Train(int tid, String tname, int time) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.time = time;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Train [tid=" + tid + ", tname=" + tname + ", time=" + time + "]";
	}
}
