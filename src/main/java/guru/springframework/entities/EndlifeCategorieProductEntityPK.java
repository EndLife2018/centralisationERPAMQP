/*package guru.springframework.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EndlifeCategorieProductEntityPK implements Serializable {
    private int fkCategorie;
    private int fkProduct;

    @Column(name = "fk_categorie", nullable = false)
    @Id
    public int getFkCategorie() {
        return fkCategorie;
    }

    public void setFkCategorie(int fkCategorie) {
        this.fkCategorie = fkCategorie;
    }

    @Column(name = "fk_product", nullable = false)
    @Id
    public int getFkProduct() {
        return fkProduct;
    }

    public void setFkProduct(int fkProduct) {
        this.fkProduct = fkProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlifeCategorieProductEntityPK that = (EndlifeCategorieProductEntityPK) o;
        return fkCategorie == that.fkCategorie &&
                fkProduct == that.fkProduct;
    }

    @Override
    public int hashCode() {

        return Objects.hash(fkCategorie, fkProduct);
    }
}
*/