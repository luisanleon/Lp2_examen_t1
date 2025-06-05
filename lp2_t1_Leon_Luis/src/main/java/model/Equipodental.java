package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_equipo_dental")
@DynamicInsert
@Getter @Setter
public class Equipodental {
	
	@Id
	@Column (name="nro_equipo")
	private int nro_equipo;
	@Column (name="nombre")
	private String nombre;
	@Column (name="costo")
	private double costo;
	@Column (name="fecha_adquisicion")
	private LocalDate fecha_adquisicion;
	@Column (name="estado")
	private int estado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_dentista")
	
	
	private Dentista dentista;
	

}
