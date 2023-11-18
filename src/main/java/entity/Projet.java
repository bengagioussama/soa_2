package entity;

public class Projet {
	
private int id;
private String nom;
private String description;
private String dateDebut;
private String dateFin;
private ChefProjet chefprojet;

public Projet() {
	super();
	// TODO Auto-generated constructor stub
}

public Projet(int id, String nom, String description, String dateDebut, String dateFin, ChefProjet chefprojet) {
	super();
	this.id = id;
	this.nom = nom;
	this.description = description;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.chefprojet = chefprojet;
}

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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getDateDebut() {
	return dateDebut;
}

public void setDateDebut(String dateDebut) {
	this.dateDebut = dateDebut;
}

public String getDateFin() {
	return dateFin;
}

public void setDateFin(String dateFin) {
	this.dateFin = dateFin;
}

public ChefProjet getChefprojet() {
	return chefprojet;
}

public void setChefprojet(ChefProjet chefprojet) {
	this.chefprojet = chefprojet;
}




}