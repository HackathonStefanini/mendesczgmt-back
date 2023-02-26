package com.stefanini;

import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("api")
public class BackendApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger("BackendApplication");

    void onStart(@Observes StartupEvent event) {
        LOGGER.info("A aplicação iniciou usando o profile: {}", ProfileManager.getActiveProfile());
    }
    
}
