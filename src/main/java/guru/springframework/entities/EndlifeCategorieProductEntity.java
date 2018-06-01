package guru.springframework.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "endlife_categorie_product", schema = "erp", catalog = "")
public class EndlifeCategorieProductEntity implements Serializable {
    private int fkCategorie;
    private int fkProduct;
    private String importKey;


    public EndlifeCategorieProductEntity(int fkCategorie, int fkProduct) {
        this.fkCategorie = fkCategorie;
        this.fkProduct = fkProduct;
    }

    public EndlifeCategorieProductEntity() {
    }

    @Id
    @Column(name = "fk_categorie", nullable = false)
    public int getFkCategorie() {
        return fkCategorie;
    }

    public void setFkCategorie(int fkCategorie) {
        this.fkCategorie = fkCategorie;
    }

    //@Id
    @Column(name = "fk_product", nullable = false)
    public int getFkProduct() {
        return fkProduct;
    }

    public void setFkProduct(int fkProduct) {
        this.fkProduct = fkProduct;
    }

    @Basic
    @Column(name = "import_key", nullable = true, length = 14)
    public String getImportKey() {
        return importKey;
    }

    public void setImportKey(String importKey) {
        this.importKey = importKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlifeCategorieProductEntity that = (EndlifeCategorieProductEntity) o;
        return fkCategorie == that.fkCategorie &&
                fkProduct == that.fkProduct &&
                Objects.equals(importKey, that.importKey);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fkCategorie, fkProduct, importKey);
    }
}