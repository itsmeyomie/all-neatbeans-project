/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HalloWorld;

import javax.ws.rs.core.Context
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author devyo
 */
@Path("HalloWorld")
public class HalloWorld {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HalloWorld
     */
    public HalloWorld() {
    }

    /**
     * Retrieves representation of an instance of HalloWorld.HalloWorld
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
    public String getHtml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of HalloWorld
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
