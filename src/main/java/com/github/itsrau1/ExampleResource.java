package com.github.itsrau1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{field}")
    public MyEntity hello(@PathParam("field") String field) {
        MyEntity entidade = new MyEntity();
        entidade.field = field;
        entidade.persist();
        return entidade;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MyEntity> get () {
        return MyEntity.listAll();
    }

}
