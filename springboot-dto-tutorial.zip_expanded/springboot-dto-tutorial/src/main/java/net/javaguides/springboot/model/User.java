package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
@Entity
@Table(name="users")

public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long Id; 
	private String email;
	
	@Column(name = "first_name") 
	private String firstName;
	
	@Column(name = "Last_name") 
	private String LastName;
	private String password; 

}
