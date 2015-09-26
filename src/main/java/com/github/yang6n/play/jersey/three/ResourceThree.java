package com.github.yang6n.play.jersey.three;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("resource3")
public class ResourceThree {

	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSomeAgainAgain() {
        return "Yes, you're here, again, again!";
    }
    
	@GET
    @Produces(MediaType.TEXT_PLAIN)
	@Path("aaa")
    public String getSomeAgainAgainAndAagain() {
        return "Yes, you're here, again, again and again!";
    }
}
