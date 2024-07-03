package com.example.railway.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Pass_tbl")
public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
private int id;
	@Column(name="name")
private String name;
	@Column(name="city")
private String city;
@OneToOne(targetEntity=Train.class,cascade=CascadeType.ALL)
@JoinColumn(name="train")
private Train train;
public Passenger() {
	super();
}
public Passenger(int id, String name, String city, Train train) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.train = train;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Train getTrain() {
	return train;
}
public void setTrain(Train train) {
	this.train = train;
}
@Override
public String toString() {
	return "Passenger [id=" + id + ", name=" + name + ", city=" + city + ", train=" + train + "]";
}
}
