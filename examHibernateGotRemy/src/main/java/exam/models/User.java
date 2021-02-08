package exam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotBlank;

@Entity(name="user")
@Table(name="user")
public class User {

	@Id
	@Column(name="id", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message="Veuillez saisir un username !")
    @Column(name = "username", nullable = false, length=180)
	private String username;
	
	@NotBlank(message="Veuillez saisir un role !")
    @Column(name = "roles", nullable = false, columnDefinition="LONGTEXT")
	private String roles;
	
	@NotBlank(message="Veuillez saisir un password !")
    @Column(name = "password", nullable = false, length=255)
	private String password;
	
	@NotBlank(message="Veuillez saisir un email !")
    @Column(name = "email", nullable = false, length=255)
	private String email;
	
	@NotBlank(message="Veuillez saisir un nom !")
    @Column(name = "nom", nullable = false, length=255)
	private String nom;
	
	@NotBlank(message="Veuillez saisir un prenom !")
    @Column(name = "prenom", nullable = false, length=255)
	private String prenom;
	
	@NotBlank(message="Veuillez saisir un num_telephone !")
    @Column(name = "num_telephone", nullable = false, length=255)
	private String num_telephone;

	/**
	 * @param id
	 * @param username
	 * @param roles
	 * @param password
	 * @param email
	 * @param nom
	 * @param prenom
	 * @param num_telephone
	 */
	public User(int id, String username, String roles, String password, String email, String nom, String prenom,
			String num_telephone) {
		super();
		this.id = id;
		this.username = username;
		this.roles = roles;
		this.password = password;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.num_telephone = num_telephone;
	}

	public User(String username, String roles, String password, String email, String nom, String prenom,
			String num_telephone) {
		super();
		this.username = username;
		this.roles = roles;
		this.password = password;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.num_telephone = num_telephone;
	}
		
	public User() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNum_telephone() {
		return num_telephone;
	}

	public void setNum_telephone(String num_telephone) {
		this.num_telephone = num_telephone;
	};
	
	
}
