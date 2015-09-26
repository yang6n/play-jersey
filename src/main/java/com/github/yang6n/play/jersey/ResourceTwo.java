package com.github.yang6n.play.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("resource2")
public class ResourceTwo {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSomeAgain() {
        return "Yes, you're here, again!";
    }
}
