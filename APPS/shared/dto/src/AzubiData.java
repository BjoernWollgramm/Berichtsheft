import java.time.LocalDate;

public class AzubiData {
    private int azubiId;
    private int benutzerId;

    public int getAzubiId() {
        return azubiId;
    }

    public void setAzubiId(int azubiId) {
        this.azubiId = azubiId;
    }

    public int getBenutzerId() {
        return benutzerId;
    }

    public void setBenutzerId(int benutzerId) {
        this.benutzerId = benutzerId;
    }

    public LocalDate getAusbildungsbeginn() {
        return ausbildungsbeginn;
    }

    public void setAusbildungsbeginn(LocalDate ausbildungsbeginn) {
        this.ausbildungsbeginn = ausbildungsbeginn;
    }

    private LocalDate ausbildungsbeginn;

}
