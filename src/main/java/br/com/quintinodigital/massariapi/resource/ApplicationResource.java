package br.com.quintinodigital.massariapi.resource;

import br.com.quintinodigital.massariapi.service.ApplicationService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/application")
public class ApplicationResource {

    @Inject
    private ApplicationService applicationService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getApplication() {
        return this.applicationService.hello();
    }

}