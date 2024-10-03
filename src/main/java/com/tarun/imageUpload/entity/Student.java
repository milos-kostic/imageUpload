package com.tarun.imageUpload.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private int id;
	private String name;
	private String Address;
	private Date dob;
	private String profileImage;
	
		
}
