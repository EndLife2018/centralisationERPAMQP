package guru.springframework.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "endlife_categorie", schema = "erp", catalog = "")
public class EndlifeCategorieEntity {
    private int rowid;
    private int entity;
    private int fkParent;
    private String label;
    private byte type;
    private String description;
    private String color;
    private Integer fkSoc;
    private byte visible;
    private String importKey;

    @Id
    @Column(name = "rowid", nullable = false)
    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
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
    @Column(name = "fk_parent", nullable = false)
    public int getFkParent() {
        return fkParent;
    }

    public void setFkParent(int fkParent) {
        this.fkParent = fkParent;
    }

    @Basic
    @Column(name = "label", nullable = false, length = 255)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "color", nullable = true, length = 8)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "fk_soc", nullable = true)
    public Integer getFkSoc() {
        return fkSoc;
    }

    public void setFkSoc(Integer fkSoc) {
        this.fkSoc = fkSoc;
    }

    @Basic
    @Column(name = "visible", nullable = false)
    public byte getVisible() {
        return visible;
    }

    public void setVisible(byte visible) {
        this.visible = visible;
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
        EndlifeCategorieEntity that = (EndlifeCategorieEntity) o;
        return rowid == that.rowid &&
                entity == that.entity &&
                fkParent == that.fkParent &&
                type == that.type &&
                visible == that.visible &&
                Objects.equals(label, that.label) &&
                Objects.equals(description, that.description) &&
                Objects.equals(color, that.color) &&
                Objects.equals(fkSoc, that.fkSoc) &&
                Objects.equals(importKey, that.importKey);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowid, entity, fkParent, label, type, description, color, fkSoc, visible, importKey);
    }
}
