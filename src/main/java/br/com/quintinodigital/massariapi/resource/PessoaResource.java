package br.com.quintinodigital.massariapi.resource;

import br.com.quintinodigital.massariapi.entity.PessoaEntity;
import br.com.quintinodigital.massariapi.service.PessoaService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;
import java.util.List;

@Path("/pessoa")
public class PessoaResource implements Serializable {

    @Inject
    private PessoaService pessoaService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public PessoaEntity saveOne(PessoaEntity pessoaEntity) {
        return this.pessoaService.saveOne(pessoaEntity);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PessoaEntity> findAll() {
        return this.pessoaService.findAll();
    }

}
