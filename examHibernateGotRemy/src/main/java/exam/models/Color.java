package exam.models;

import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import jakarta.validation.constraints.NotBlank;

@Entity(name="color")
@Table(name="color")
public class Color {

	@Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
    @NotBlank(message="Veuillez saisir un libelle !")
    @Column(name = "libelle", nullable = false, length=255)
	private String libelle;

    @ManyToMany()
    @JoinTable(
    		name = "color_car",
    		joinColumns = { @JoinColumn(name = "color_id") },
    		inverseJoinColumns = { @JoinColumn(name = "car_id") }  		
    		)
    private List<Car> cars;

	/**
	 * @param id
	 * @param libelle
	 * @param cars
	 */
	public Color(int id, String libelle, List<Car> cars) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.cars = cars;
	}

	/**
	 * @param libelle
	 */
	public Color(String libelle) {
		super();
		this.libelle = libelle;
	}

	public Color () {
		this.cars = Collections.emptyList();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
    
    
}
