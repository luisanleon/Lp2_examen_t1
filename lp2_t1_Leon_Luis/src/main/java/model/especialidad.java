package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_especialidad")
@DynamicInsert
@Getter @Setter
public class especialidad {
	
	@Id
	
	@Column (name="id_especialidad")
	private int id_especialidad;
	@Column (name="titulo")
	private String titulo;

}
