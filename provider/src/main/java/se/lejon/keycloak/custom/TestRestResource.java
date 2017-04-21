package se.lejon.keycloak.custom;

import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.cache.NoCache;
import org.keycloak.models.KeycloakSession;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class TestRestResource {
    private final KeycloakSession session;

    private static final Logger logger = Logger.getLogger(TestRestResource.class);


    public TestRestResource(KeycloakSession session) {
        this.session = session;
    }

    @GET
    @Path("")
    @NoCache
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTest() {
        logger.info("In test");
        final String json = "{\"value\": \"test\"}";
        return Response.ok(json, MediaType.APPLICATION_JSON_TYPE).build();
    }
}