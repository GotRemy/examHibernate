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

@Entity(name="garage")
@Table(name="garage")
public class Garage {

	@Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="user_id", referencedColumnName = "id")
	private User user_id;
	
    @NotBlank(message="Veuillez saisir un nom !")
    @Column(name = "nom", nullable = false, length=255)
	private String nom;
	
    @NotBlank(message="Veuillez saisir un rue !")
    @Column(name = "rue", nullable = false, length=255)
	private String rue;

    @NotBlank(message="Veuillez saisir un code_postal !")
    @Column(name = "code_postal", nullable = false, length=255)
	private String code_postal;
	
    @NotBlank(message="Veuillez saisir un ville !")
    @Column(name = "ville", nullable = false, length=255)
	private String ville;
	
    @NotBlank(message="Veuillez saisir un num_telephone !")
    @Column(name = "num_telephone", nullable = false, length=255)
	private String num_telephone;
	
    @NotBlank(message="Veuillez saisir un num_siret !")
    @Column(name = "num_siret", nullable = false, length=255)
	private String num_siret;

	/**
	 * @param id
	 * @param user_id
	 * @param nom
	 * @param rue
	 * @param code_postal
	 * @param ville
	 * @param num_telephone
	 * @param num_siret
	 */
	public Garage(int id, User user_id, String nom, String rue, String code_postal, String ville, String num_telephone,
			String num_siret) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.nom = nom;
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
		this.num_telephone = num_telephone;
		this.num_siret = num_siret;
	}

	/**
	 * @param user_id
	 * @param nom
	 * @param rue
	 * @param code_postal
	 * @param ville
	 * @param num_telephone
	 * @param num_siret
	 */
	public Garage(User user_id, String nom, String rue, String code_postal, String ville, String num_telephone,
			String num_siret) {
		super();
		this.user_id = user_id;
		this.nom = nom;
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
		this.num_telephone = num_telephone;
		this.num_siret = num_siret;
	}
    
    public Garage() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNum_telephone() {
		return num_telephone;
	}

	public void setNum_telephone(String num_telephone) {
		this.num_telephone = num_telephone;
	}

	public String getNum_siret() {
		return num_siret;
	}

	public void setNum_siret(String num_siret) {
		this.num_siret = num_siret;
	};
    
    
}
