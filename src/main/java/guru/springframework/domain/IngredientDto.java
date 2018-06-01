package guru.springframework.domain;

public class IngredientDto {
    private int idcomposant;
    private String nomcomposant;
    private String descriptioncomposant;

    public int getIdcomposant() {
        return idcomposant;
    }

    public void setIdcomposant(int idcomposant) {
        this.idcomposant = idcomposant;
    }

    public String getNomcomposant() {
        return nomcomposant;
    }

    public void setNomcomposant(String nomcomposant) {
        this.nomcomposant = nomcomposant;
    }

    public String getDescriptioncomposant() {
        return descriptioncomposant;
    }

    public void setDescriptioncomposant(String descriptioncomposant) {
        this.descriptioncomposant = descriptioncomposant;
    }
}
