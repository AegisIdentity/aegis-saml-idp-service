# aegis-saml-idp-service

Custom SAML 2.0 Identity Provider (OpenSAML 5) — Spring provides only SP support.

**Maturity: scaffold.** Buildable, secured resource-server skeleton — health endpoint, a protected
placeholder API, and the shared `aegis-security-commons` hardening baseline. Feature work goes here;
the intended contract is in
[`aegis-platform-docs/architecture/SERVICE-CATALOG.md`](../aegis-platform-docs/architecture/SERVICE-CATALOG.md).

- Port: `9104` · Required scope for `/api/**`: `saml:admin`
- Build: `./mvnw verify` (needs `aegis-platform-parent` + `aegis-platform-commons` installed to `~/.m2` first)
