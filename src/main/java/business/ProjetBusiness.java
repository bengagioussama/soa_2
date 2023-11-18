package business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import entity.Projet;

public class ProjetBusiness {

	 public static List<Projet> projets;
	    ChefProjetBusiness ChPB=new ChefProjetBusiness();
	    public ProjetBusiness() {
	    	projets= new ArrayList<Projet>();
	    }
	    
	    
	 
	 public String addProjet(Projet p){
	       
	    		if( projets.add(p))
	    		   return "Projet a été ajouté avec succès";
	    		   else 
	    			   return null ;
	    }
	 
	 public List<Projet> getProjets() {
	        return projets;
	    }
	
	 
	    public boolean deleteProjet(int id){
	        Iterator<Projet> iterator=projets.iterator();
	        while(iterator.hasNext()){
	            Projet p=iterator.next();
	            if(p.getId()==id){
	                iterator.remove();
	                return true;
	            }
	        }
	        return false;
	    }
	 
	 
	    public Projet getProjetByMatricule(String matricule){

	        for (Projet l:projets){
	        	 if(l.getChefprojet().getMatricule()==matricule)
	        	
	                return l;
	        }
	        return null;
	    }
	    
}
