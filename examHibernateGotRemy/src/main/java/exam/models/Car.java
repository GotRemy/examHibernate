package exam.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jakarta.validation.constraints.NotBlank;

@Entity(name="car")
@Table(name="car")
public class Car {

	@Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="garage_id", referencedColumnName = "id")
	private Garage garage_id;
	
    @NotBlank(message="Veuillez saisir un marque !")
    @Column(name = "marque", nullable = false, length=255)
	private String marque;
	
    @NotBlank(message="Veuillez saisir un modele !")
    @Column(name = "modele", nullable = false, length=255)
	private String modele;
	
    @NotBlank(message="Veuillez saisir un carburant !")
    @Column(name = "carburant", nullable = false, length=255)
	private String carburant;
	
    @NotBlank(message="Veuillez saisir un annee !")
    @Column(name = "annee", nullable = false)
	private int annee;
	
    @NotBlank(message="Veuillez saisir un kilometrage !")
    @Column(name = "kilometrage", nullable = false)
	private int kilometrage;
	
    @NotBlank(message="Veuillez saisir un prix !")
    @Column(name = "prix", nullable = false)
	private int prix;
	
	@NotBlank(message="Veuillez saisir une date !")
    @Column(name = "date_ajout", nullable = false)
    @Temporal(TemporalType.DATE)
	private Date date_ajout;
	
    @NotBlank(message="Veuillez saisir un description !")
    @Column(name = "description", nullable = false, columnDefinition="LONGTEXT")
	private String description;

	/**
	 * @param id
	 * @param garage_id
	 * @param marque
	 * @param modele
	 * @param carburant
	 * @param annee
	 * @param kilometrage
	 * @param prix
	 * @param date_ajout
	 * @param description
	 */
	public Car(int id, Garage garage_id, String marque, String modele, String carburant, int annee, int kilometrage,
			int prix, Date date_ajout, String description) {
		super();
		this.id = id;
		this.garage_id = garage_id;
		this.marque = marque;
		this.modele = modele;
		this.carburant = carburant;
		this.annee = annee;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.date_ajout = date_ajout;
		this.description = description;
	}

	/**
	 * @param garage_id
	 * @param marque
	 * @param modele
	 * @param carburant
	 * @param annee
	 * @param kilometrage
	 * @param prix
	 * @param date_ajout
	 * @param description
	 */
	public Car(Garage garage_id, String marque, String modele, String carburant, int annee, int kilometrage, int prix,
			Date date_ajout, String description) {
		super();
		this.garage_id = garage_id;
		this.marque = marque;
		this.modele = modele;
		this.carburant = carburant;
		this.annee = annee;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.date_ajout = date_ajout;
		this.description = description;
	}
    
   public Car() {}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Garage getGarage_id() {
	return garage_id;
}

public void setGarage_id(Garage garage_id) {
	this.garage_id = garage_id;
}

public String getMarque() {
	return marque;
}

public void setMarque(String marque) {
	this.marque = marque;
}

public String getModele() {
	return modele;
}

public void setModele(String modele) {
	this.modele = modele;
}

public String getCarburant() {
	return carburant;
}

public void setCarburant(String carburant) {
	this.carburant = carburant;
}

public int getAnnee() {
	return annee;
}

public void setAnnee(int annee) {
	this.annee = annee;
}

public int getKilometrage() {
	return kilometrage;
}

public void setKilometrage(int kilometrage) {
	this.kilometrage = kilometrage;
}

public int getPrix() {
	return prix;
}

public void setPrix(int prix) {
	this.prix = prix;
}

public Date getDate_ajout() {
	return date_ajout;
}

public String getDate_ajoutString() {
	return date_ajout.getDay()+"/"+date_ajout.getMonth()+"/"+date_ajout.getYear();
}

public void setDate_ajout(Date date_ajout) {
	this.date_ajout = date_ajout;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
};
   
   
}
