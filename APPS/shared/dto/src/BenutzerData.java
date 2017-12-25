import java.util.ArrayList;
import java.util.List;

public class BenutzerData {
    private int benutzerId;
    private String vorname;
    private String nachname;

    public List<RolleData> getRollen() {
        return rollen;
    }

    public void setRollen(List<RolleData> rollen) {
        this.rollen = rollen;
    }

    private List<RolleData> rollen;

    public BenutzerData(){
        rollen = new ArrayList<RolleData>();
    }

    public int getBenutzerId() {
        return benutzerId;
    }

    public void setBenutzerId(int benutzerId) {
        this.benutzerId = benutzerId;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }


}
