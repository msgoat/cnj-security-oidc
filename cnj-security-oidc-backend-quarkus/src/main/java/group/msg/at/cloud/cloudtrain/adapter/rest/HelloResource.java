package group.msg.at.cloud.cloudtrain.adapter.rest;

import group.msg.at.cloud.cloudtrain.core.entity.Message;
import group.msg.at.cloud.cloudtrain.core.boundary.HelloWorld;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST endpoint returning welcome messages.
 * <p>
 * Handles only the mapping of a REST invocation to a Java method invocation;
 * all transactional business logic is encapsulated in a {@code Boundary} this resource class delegates to.
 * </p>
 * <p>
 * Please note that JAX-RS {@code Resource} classes must be {@code @RequestScoped} according to the JAX-RS 2.1 spec in
 * order for JAX-RS to work properly with CDI.
 * </p>
 */
@RequestScoped
@Path("v1/hello")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RolesAllowed("CLOUDTRAIN_USER")
public class HelloResource {

    @Inject
    HelloWorld boundary;

    @GET
    public Response getWelcomeMessage() {
        Response result;
        Message welcomeMessage = this.boundary.getHelloMessage();
        if (welcomeMessage != null) {
            result = Response.ok(welcomeMessage).build();
        } else {
            result = Response.status(Response.Status.NOT_FOUND).build();
        }
        return result;
    }
}
