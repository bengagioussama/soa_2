package business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entity.ChefProjet;


public class ChefProjetBusiness {

	  public static List<ChefProjet> ChProjet;
	  
	  
	  public ChefProjetBusiness() {
		  ChProjet=new ArrayList<ChefProjet>();
		  ChProjet.add(new ChefProjet ("matricule111","Asma", "Khaldi","23444655","asma.Kh@gmail.com"));

	    }
	 
	 public String addChefProjet(ChefProjet c){
	       
	    		if( ChProjet.add(c))
	    		   return "Ajout avec succés";
	    		   else 
	    			   return null ;
	    }
	 
	 public List<ChefProjet> getchProjets() {
	        return ChProjet;
	    }
	
	 
	    public boolean deleteChProjet(String m){
	        Iterator<ChefProjet> iterator=ChProjet.iterator();
	        while(iterator.hasNext()){
	            ChefProjet p=iterator.next();
	            if(p.getMatricule()==m){
	                iterator.remove();
	                return true;
	            }
	        }
	        return false;
	    }
	 
	 
	    public ChefProjet getChefProjetByMatricule(String m){

	        for (ChefProjet Ch:ChProjet){
	            if(Ch.getMatricule()==m)
	                return Ch;
	        }
	        return null;
	    }
	    
}

	  
	

