package exam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import jakarta.validation.constraints.NotBlank;

@Entity(name="images")
@Table(name="images")
public class Images {

	@Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message="Veuillez saisir un nom !")
    @Column(name = "nom", nullable = false, length=250)
	private String nom;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="car_id", referencedColumnName = "id")
	private Car car_id;

	/**
	 * @param id
	 * @param nom
	 * @param car_id
	 */
	public Images(int id, String nom, Car car_id) {
		super();
		this.id = id;
		this.nom = nom;
		this.car_id = car_id;
	}

	/**
	 * @param nom
	 * @param car_id
	 */
	public Images(String nom, Car car_id) {
		super();
		this.nom = nom;
		this.car_id = car_id;
	}
	
	public Images() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Car getCar_id() {
		return car_id;
	}

	public void setCar_id(Car car_id) {
		this.car_id = car_id;
	};
	
	
}
