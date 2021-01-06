package com.training.mp.wf.articles.config;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/config")
@RequestScoped
public class ConfigTestController {

    @Inject
    @ConfigProperty(name = "injected.value")
    String injectedValue;

    @Path("/injected")
    @GET
    public String getInjectedConfigValue() {
        return String.format("Config value as Injected by CDI %s, and accountName: %s", injectedValue);
    }

    @Path("/lookup")
    @GET
    public String getLookupConfigValue() {
        Config config = ConfigProvider.getConfig();
        String value = config.getValue("value", String.class);
        return "Config value from ConfigProvider " + value;
    }
}
