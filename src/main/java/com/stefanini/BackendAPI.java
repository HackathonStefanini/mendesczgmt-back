package com.stefanini;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@ApplicationScoped()
@Path("api")
public class BackendAPI extends Application {
}
