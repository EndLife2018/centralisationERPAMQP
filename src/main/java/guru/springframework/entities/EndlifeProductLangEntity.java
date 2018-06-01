package guru.springframework.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "endlife_product_lang", schema = "erp", catalog = "")
public class EndlifeProductLangEntity {
    private int rowid;
    private String lang;
    private String label;
    private String description;
    private String note;
    private String importKey;
    private EndlifeProductEntity endlifeProductByFkProduct;

    @Id
    @Column(name = "rowid", nullable = false)
    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    @Basic
    @Column(name = "lang", nullable = false, length = 5)
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
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
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "note", nullable = true, length = -1)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        EndlifeProductLangEntity that = (EndlifeProductLangEntity) o;
        return rowid == that.rowid &&
                Objects.equals(lang, that.lang) &&
                Objects.equals(label, that.label) &&
                Objects.equals(description, that.description) &&
                Objects.equals(note, that.note) &&
                Objects.equals(importKey, that.importKey);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowid, lang, label, description, note, importKey);
    }

    @ManyToOne
    @JoinColumn(name = "fk_product", referencedColumnName = "rowid", nullable = false)
    public EndlifeProductEntity getEndlifeProductByFkProduct() {
        return endlifeProductByFkProduct;
    }

    public void setEndlifeProductByFkProduct(EndlifeProductEntity endlifeProductByFkProduct) {
        this.endlifeProductByFkProduct = endlifeProductByFkProduct;
    }
}
