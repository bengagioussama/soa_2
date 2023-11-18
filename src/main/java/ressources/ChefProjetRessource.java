package ressources;

import business.ChefProjetBusiness;
import entity.ChefProjet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/chefsprojet")
public class ChefProjetRessource {

    private final ChefProjetBusiness chefProjetBusiness = new ChefProjetBusiness();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addChefProjet(ChefProjet chefProjet) {
        String result = chefProjetBusiness.addChefProjet(chefProjet);
        if (result != null) {
            return Response.status(Response.Status.CREATED).entity(result).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
