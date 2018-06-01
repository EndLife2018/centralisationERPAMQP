package guru.springframework.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "endlife_c_country", schema = "erp", catalog = "")
public class EndlifeCCountryEntity {
    private int rowid;
    private String code;
    private String codeIso;
    private String label;
    private byte active;
    private byte favorite;

    @Id
    @Column(name = "rowid", nullable = false)
    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 2)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "code_iso", nullable = true, length = 3)
    public String getCodeIso() {
        return codeIso;
    }

    public void setCodeIso(String codeIso) {
        this.codeIso = codeIso;
    }

    @Basic
    @Column(name = "label", nullable = false, length = 50)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "active", nullable = false)
    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @Basic
    @Column(name = "favorite", nullable = false)
    public byte getFavorite() {
        return favorite;
    }

    public void setFavorite(byte favorite) {
        this.favorite = favorite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlifeCCountryEntity that = (EndlifeCCountryEntity) o;
        return rowid == that.rowid &&
                active == that.active &&
                favorite == that.favorite &&
                Objects.equals(code, that.code) &&
                Objects.equals(codeIso, that.codeIso) &&
                Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowid, code, codeIso, label, active, favorite);
    }
}
