package io.aegis.saml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Custom SAML 2.0 Identity Provider (OpenSAML 5) — Spring provides only SP support.
 *
 * <p>Maturity: scaffold. This is a buildable, secured resource-server skeleton (health + a
 * protected info endpoint + the shared hardening baseline) ready for feature work. See
 * aegis-platform-docs/architecture/SERVICE-CATALOG.md for the intended contract. */
@SpringBootApplication
public class SamlApplication {
    public static void main(String[] args) {
        SpringApplication.run(SamlApplication.class, args);
    }
}
