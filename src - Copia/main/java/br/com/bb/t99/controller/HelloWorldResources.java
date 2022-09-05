package br.com.bb.t99.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import br.com.bb.t99.services.clienteService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/hello")
@ApplicationScoped
public class HelloWorldResources {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello() {
        log.info("Escrevendo \"Hello!\"");
        return Response.status(Response.Status.OK).entity("Hello!").build();
    }

    @GET
    @Path("{nome}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloYou(@PathParam String nome) {
        log.info("Escrevendo \"Hello, Nome!\"");
        return Response.status(Response.Status.OK).entity("Hello, " + nome + " !").build();
    }

    @GET
    @Path("{nome}/horario")
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloTime(@PathParam String nome) {
        log.info("Escrevendo \"Hello, Nome! Agora são Horário, não esqueça!\"");
        return Response.status(Response.Status.OK).entity("Hello, " + nome + "! Agora são " + clienteService.horario() +", não esqueça!").build();
    }
}
