package guru.springframework.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "endlife_c_units", schema = "erp", catalog = "")
public class EndlifeCUnitsEntity {
    private int rowid;
    private String code;
    private String label;
    private String shortLabel;
    private byte active;

    @Id
    @Column(name = "rowid", nullable = false)
    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 3)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "label", nullable = true, length = 50)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "short_label", nullable = true, length = 5)
    public String getShortLabel() {
        return shortLabel;
    }

    public void setShortLabel(String shortLabel) {
        this.shortLabel = shortLabel;
    }

    @Basic
    @Column(name = "active", nullable = false)
    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlifeCUnitsEntity that = (EndlifeCUnitsEntity) o;
        return rowid == that.rowid &&
                active == that.active &&
                Objects.equals(code, that.code) &&
                Objects.equals(label, that.label) &&
                Objects.equals(shortLabel, that.shortLabel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowid, code, label, shortLabel, active);
    }
}
