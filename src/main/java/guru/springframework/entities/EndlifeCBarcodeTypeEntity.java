package guru.springframework.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "endlife_c_barcode_type", schema = "erp", catalog = "")
public class EndlifeCBarcodeTypeEntity {
    private int rowid;
    private String code;
    private int entity;
    private String libelle;
    private String coder;
    private String example;

    @Id
    @Column(name = "rowid", nullable = false)
    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 16)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "entity", nullable = false)
    public int getEntity() {
        return entity;
    }

    public void setEntity(int entity) {
        this.entity = entity;
    }

    @Basic
    @Column(name = "libelle", nullable = false, length = 50)
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Basic
    @Column(name = "coder", nullable = false, length = 16)
    public String getCoder() {
        return coder;
    }

    public void setCoder(String coder) {
        this.coder = coder;
    }

    @Basic
    @Column(name = "example", nullable = false, length = 16)
    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlifeCBarcodeTypeEntity that = (EndlifeCBarcodeTypeEntity) o;
        return rowid == that.rowid &&
                entity == that.entity &&
                Objects.equals(code, that.code) &&
                Objects.equals(libelle, that.libelle) &&
                Objects.equals(coder, that.coder) &&
                Objects.equals(example, that.example);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowid, code, entity, libelle, coder, example);
    }
}
