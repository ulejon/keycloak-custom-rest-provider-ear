package se.lejon.keycloak.custom.rest;

import org.keycloak.models.KeycloakSession;
import org.keycloak.services.resource.RealmResourceProvider;

public class TestRestResourceProvider implements RealmResourceProvider {

    private KeycloakSession session;

    public TestRestResourceProvider(KeycloakSession session) {
        this.session = session;
    }

    @Override
    public Object getResource() {
        return new TestRestResource(session);
    }

    @Override
    public void close() {
    }

}