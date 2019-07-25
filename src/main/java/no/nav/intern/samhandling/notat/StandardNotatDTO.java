package no.nav.intern.samhandling.notat;

import java.time.LocalDate;

public class StandardNotatDTO {
    private LocalDate dato = LocalDate.now();
    private String brukersNavn = "Petter Smart";
    private String brukersFnr = "123123123123";
    private String saksnummer ="A0123123123";
    private String saksbehandler = "saksbehandler";
    private String enhet = "Enhetsnummer her";
    private String gjelder = "POC av pdf-generering";
    private String tittel = "Her er tittelen";
    private String tekst = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor\n incididunt ut <b>labore</b> et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public LocalDate getDato() {
        return dato;
    }

    public String getBrukersNavn() {
        return brukersNavn;
    }

    public String getBrukersFnr() {
        return brukersFnr;
    }

    public String getSaksnummer() {
        return saksnummer;
    }

    public String getSaksbehandler() {
        return saksbehandler;
    }

    public String getEnhet() {
        return enhet;
    }

    public String getGjelder() {
        return gjelder;
    }

    public String getTekst() {
        return tekst;
    }

    public String getTittel() {
        return tittel;
    }
}
