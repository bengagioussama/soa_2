package ressources;
import business.ProjetBusiness;
import javax.ws.rs.Path;

import business.ProjetBusiness;
import entity.Projet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/projets")
public class ProjetBusinessRessource {

    private final ProjetBusiness projetBusiness = new ProjetBusiness();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addProjet(Projet projet) {
        String result = projetBusiness.addProjet(projet);
        if (result != null) {
            return Response.status(Response.Status.CREATED).entity(result).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProjets() {
        List<Projet> projets = projetBusiness.getProjets();
        if (!projets.isEmpty()) {
            return Response.status(Response.Status.OK).entity(projets).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteProjet(@PathParam("id") int id) {
        if (projetBusiness.deleteProjet(id)) {
            return Response.status(Response.Status.OK).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProjetsByMatricule(@QueryParam("matricule") String matricule) {
        List<Projet> projets = (List<Projet>) projetBusiness.getProjetByMatricule(matricule);
        if (!projets.isEmpty()) {
            return Response.status(Response.Status.OK).entity(projets).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}

