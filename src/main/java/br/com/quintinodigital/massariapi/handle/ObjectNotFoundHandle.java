package br.com.quintinodigital.massariapi.handle;

import br.com.quintinodigital.massariapi.exception.ObjectNotFoundException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ObjectNotFoundHandle implements ExceptionMapper<ObjectNotFoundException> {

    @Override
    public Response toResponse(ObjectNotFoundException objectNotFoundException) {
        return Response.status(Response.Status.NOT_FOUND).type(MediaType.APPLICATION_JSON_TYPE).entity(objectNotFoundException.getMessage()).build();
    }

}
