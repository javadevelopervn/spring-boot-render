package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@Table(name = "employees")
public class Employee extends BaseEntity {
	public String lastName;
	public String firstName;
	public String title;
	public String titleOfCourtesy;
	public LocalDate birthDate;
	public LocalDate hireDate;
	public String address;
	public String city;
	public String region;
	public String postalCode;
	public String country;
	public String homePhone;
	public String extension;
	public byte[] photo;
	public String notes;
	public short reportsTo;
	public String photoPath;
}
