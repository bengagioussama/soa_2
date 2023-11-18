package entity;

public class ChefProjet {
	
	private String matricule;
	private String nom;
	private String prenom;
	private String numTel;
	private String email;
	
	public ChefProjet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChefProjet(String matricule, String nom, String prenom, String numTel, String email) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.email = email;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
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

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
