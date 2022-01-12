package net.javaguides.springboot.model;

import javax.persistence.Entity;

import org.hibernate.annotations.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Location")
public class Location {
	
	@Id
	@Generatedvalue(strategy=Generetiontype.IDENTITY)
	private Long Id;
	private String place;
	private String description;
    private double Longutude;
    private double Latitude;   
}
