package guru.springframework.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "endlife_contratdet", schema = "erp", catalog = "")
public class EndlifeContratdetEntity {
    private int rowid;
    private Timestamp tms;
    private Short statut;
    private String label;
    private String description;
    private Integer fkRemiseExcept;
    private Timestamp dateCommande;
    private Timestamp dateOuverturePrevue;
    private Timestamp dateOuverture;
    private Timestamp dateFinValidite;
    private Timestamp dateCloture;
    private String vatSrcCode;
    private Double tvaTx;
    private Double localtax1Tx;
    private String localtax1Type;
    private Double localtax2Tx;
    private String localtax2Type;
    private double qty;
    private Double remisePercent;
    private Double subprice;
    private Double priceHt;
    private Double remise;
    private Double totalHt;
    private Double totalTva;
    private Double totalLocaltax1;
    private Double totalLocaltax2;
    private Double totalTtc;
    private Integer productType;
    private Integer infoBits;
    private Double buyPriceHt;
    private Integer fkProductFournisseurPrice;
    private int fkUserAuthor;
    private Integer fkUserOuverture;
    private Integer fkUserCloture;
    private String commentaire;
    private Integer fkMulticurrency;
    private String multicurrencyCode;
    private Double multicurrencySubprice;
    private Double multicurrencyTotalHt;
    private Double multicurrencyTotalTva;
    private Double multicurrencyTotalTtc;
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
    @Column(name = "tms", nullable = false)
    public Timestamp getTms() {
        return tms;
    }

    public void setTms(Timestamp tms) {
        this.tms = tms;
    }

    @Basic
    @Column(name = "statut", nullable = true)
    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    @Basic
    @Column(name = "label", nullable = true, length = -1)
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
    @Column(name = "fk_remise_except", nullable = true)
    public Integer getFkRemiseExcept() {
        return fkRemiseExcept;
    }

    public void setFkRemiseExcept(Integer fkRemiseExcept) {
        this.fkRemiseExcept = fkRemiseExcept;
    }

    @Basic
    @Column(name = "date_commande", nullable = true)
    public Timestamp getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Timestamp dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Basic
    @Column(name = "date_ouverture_prevue", nullable = true)
    public Timestamp getDateOuverturePrevue() {
        return dateOuverturePrevue;
    }

    public void setDateOuverturePrevue(Timestamp dateOuverturePrevue) {
        this.dateOuverturePrevue = dateOuverturePrevue;
    }

    @Basic
    @Column(name = "date_ouverture", nullable = true)
    public Timestamp getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Timestamp dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    @Basic
    @Column(name = "date_fin_validite", nullable = true)
    public Timestamp getDateFinValidite() {
        return dateFinValidite;
    }

    public void setDateFinValidite(Timestamp dateFinValidite) {
        this.dateFinValidite = dateFinValidite;
    }

    @Basic
    @Column(name = "date_cloture", nullable = true)
    public Timestamp getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Timestamp dateCloture) {
        this.dateCloture = dateCloture;
    }

    @Basic
    @Column(name = "vat_src_code", nullable = true, length = 10)
    public String getVatSrcCode() {
        return vatSrcCode;
    }

    public void setVatSrcCode(String vatSrcCode) {
        this.vatSrcCode = vatSrcCode;
    }

    @Basic
    @Column(name = "tva_tx", nullable = true, precision = 3)
    public Double getTvaTx() {
        return tvaTx;
    }

    public void setTvaTx(Double tvaTx) {
        this.tvaTx = tvaTx;
    }

    @Basic
    @Column(name = "localtax1_tx", nullable = true, precision = 3)
    public Double getLocaltax1Tx() {
        return localtax1Tx;
    }

    public void setLocaltax1Tx(Double localtax1Tx) {
        this.localtax1Tx = localtax1Tx;
    }

    @Basic
    @Column(name = "localtax1_type", nullable = true, length = 10)
    public String getLocaltax1Type() {
        return localtax1Type;
    }

    public void setLocaltax1Type(String localtax1Type) {
        this.localtax1Type = localtax1Type;
    }

    @Basic
    @Column(name = "localtax2_tx", nullable = true, precision = 3)
    public Double getLocaltax2Tx() {
        return localtax2Tx;
    }

    public void setLocaltax2Tx(Double localtax2Tx) {
        this.localtax2Tx = localtax2Tx;
    }

    @Basic
    @Column(name = "localtax2_type", nullable = true, length = 10)
    public String getLocaltax2Type() {
        return localtax2Type;
    }

    public void setLocaltax2Type(String localtax2Type) {
        this.localtax2Type = localtax2Type;
    }

    @Basic
    @Column(name = "qty", nullable = false, precision = 0)
    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "remise_percent", nullable = true, precision = 0)
    public Double getRemisePercent() {
        return remisePercent;
    }

    public void setRemisePercent(Double remisePercent) {
        this.remisePercent = remisePercent;
    }

    @Basic
    @Column(name = "subprice", nullable = true, precision = 8)
    public Double getSubprice() {
        return subprice;
    }

    public void setSubprice(Double subprice) {
        this.subprice = subprice;
    }

    @Basic
    @Column(name = "price_ht", nullable = true, precision = 0)
    public Double getPriceHt() {
        return priceHt;
    }

    public void setPriceHt(Double priceHt) {
        this.priceHt = priceHt;
    }

    @Basic
    @Column(name = "remise", nullable = true, precision = 0)
    public Double getRemise() {
        return remise;
    }

    public void setRemise(Double remise) {
        this.remise = remise;
    }

    @Basic
    @Column(name = "total_ht", nullable = true, precision = 8)
    public Double getTotalHt() {
        return totalHt;
    }

    public void setTotalHt(Double totalHt) {
        this.totalHt = totalHt;
    }

    @Basic
    @Column(name = "total_tva", nullable = true, precision = 8)
    public Double getTotalTva() {
        return totalTva;
    }

    public void setTotalTva(Double totalTva) {
        this.totalTva = totalTva;
    }

    @Basic
    @Column(name = "total_localtax1", nullable = true, precision = 8)
    public Double getTotalLocaltax1() {
        return totalLocaltax1;
    }

    public void setTotalLocaltax1(Double totalLocaltax1) {
        this.totalLocaltax1 = totalLocaltax1;
    }

    @Basic
    @Column(name = "total_localtax2", nullable = true, precision = 8)
    public Double getTotalLocaltax2() {
        return totalLocaltax2;
    }

    public void setTotalLocaltax2(Double totalLocaltax2) {
        this.totalLocaltax2 = totalLocaltax2;
    }

    @Basic
    @Column(name = "total_ttc", nullable = true, precision = 8)
    public Double getTotalTtc() {
        return totalTtc;
    }

    public void setTotalTtc(Double totalTtc) {
        this.totalTtc = totalTtc;
    }

    @Basic
    @Column(name = "product_type", nullable = true)
    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "info_bits", nullable = true)
    public Integer getInfoBits() {
        return infoBits;
    }

    public void setInfoBits(Integer infoBits) {
        this.infoBits = infoBits;
    }

    @Basic
    @Column(name = "buy_price_ht", nullable = true, precision = 8)
    public Double getBuyPriceHt() {
        return buyPriceHt;
    }

    public void setBuyPriceHt(Double buyPriceHt) {
        this.buyPriceHt = buyPriceHt;
    }

    @Basic
    @Column(name = "fk_product_fournisseur_price", nullable = true)
    public Integer getFkProductFournisseurPrice() {
        return fkProductFournisseurPrice;
    }

    public void setFkProductFournisseurPrice(Integer fkProductFournisseurPrice) {
        this.fkProductFournisseurPrice = fkProductFournisseurPrice;
    }

    @Basic
    @Column(name = "fk_user_author", nullable = false)
    public int getFkUserAuthor() {
        return fkUserAuthor;
    }

    public void setFkUserAuthor(int fkUserAuthor) {
        this.fkUserAuthor = fkUserAuthor;
    }

    @Basic
    @Column(name = "fk_user_ouverture", nullable = true)
    public Integer getFkUserOuverture() {
        return fkUserOuverture;
    }

    public void setFkUserOuverture(Integer fkUserOuverture) {
        this.fkUserOuverture = fkUserOuverture;
    }

    @Basic
    @Column(name = "fk_user_cloture", nullable = true)
    public Integer getFkUserCloture() {
        return fkUserCloture;
    }

    public void setFkUserCloture(Integer fkUserCloture) {
        this.fkUserCloture = fkUserCloture;
    }

    @Basic
    @Column(name = "commentaire", nullable = true, length = -1)
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Basic
    @Column(name = "fk_multicurrency", nullable = true)
    public Integer getFkMulticurrency() {
        return fkMulticurrency;
    }

    public void setFkMulticurrency(Integer fkMulticurrency) {
        this.fkMulticurrency = fkMulticurrency;
    }

    @Basic
    @Column(name = "multicurrency_code", nullable = true, length = 255)
    public String getMulticurrencyCode() {
        return multicurrencyCode;
    }

    public void setMulticurrencyCode(String multicurrencyCode) {
        this.multicurrencyCode = multicurrencyCode;
    }

    @Basic
    @Column(name = "multicurrency_subprice", nullable = true, precision = 8)
    public Double getMulticurrencySubprice() {
        return multicurrencySubprice;
    }

    public void setMulticurrencySubprice(Double multicurrencySubprice) {
        this.multicurrencySubprice = multicurrencySubprice;
    }

    @Basic
    @Column(name = "multicurrency_total_ht", nullable = true, precision = 8)
    public Double getMulticurrencyTotalHt() {
        return multicurrencyTotalHt;
    }

    public void setMulticurrencyTotalHt(Double multicurrencyTotalHt) {
        this.multicurrencyTotalHt = multicurrencyTotalHt;
    }

    @Basic
    @Column(name = "multicurrency_total_tva", nullable = true, precision = 8)
    public Double getMulticurrencyTotalTva() {
        return multicurrencyTotalTva;
    }

    public void setMulticurrencyTotalTva(Double multicurrencyTotalTva) {
        this.multicurrencyTotalTva = multicurrencyTotalTva;
    }

    @Basic
    @Column(name = "multicurrency_total_ttc", nullable = true, precision = 8)
    public Double getMulticurrencyTotalTtc() {
        return multicurrencyTotalTtc;
    }

    public void setMulticurrencyTotalTtc(Double multicurrencyTotalTtc) {
        this.multicurrencyTotalTtc = multicurrencyTotalTtc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlifeContratdetEntity that = (EndlifeContratdetEntity) o;
        return rowid == that.rowid &&
                Double.compare(that.qty, qty) == 0 &&
                fkUserAuthor == that.fkUserAuthor &&
                Objects.equals(tms, that.tms) &&
                Objects.equals(statut, that.statut) &&
                Objects.equals(label, that.label) &&
                Objects.equals(description, that.description) &&
                Objects.equals(fkRemiseExcept, that.fkRemiseExcept) &&
                Objects.equals(dateCommande, that.dateCommande) &&
                Objects.equals(dateOuverturePrevue, that.dateOuverturePrevue) &&
                Objects.equals(dateOuverture, that.dateOuverture) &&
                Objects.equals(dateFinValidite, that.dateFinValidite) &&
                Objects.equals(dateCloture, that.dateCloture) &&
                Objects.equals(vatSrcCode, that.vatSrcCode) &&
                Objects.equals(tvaTx, that.tvaTx) &&
                Objects.equals(localtax1Tx, that.localtax1Tx) &&
                Objects.equals(localtax1Type, that.localtax1Type) &&
                Objects.equals(localtax2Tx, that.localtax2Tx) &&
                Objects.equals(localtax2Type, that.localtax2Type) &&
                Objects.equals(remisePercent, that.remisePercent) &&
                Objects.equals(subprice, that.subprice) &&
                Objects.equals(priceHt, that.priceHt) &&
                Objects.equals(remise, that.remise) &&
                Objects.equals(totalHt, that.totalHt) &&
                Objects.equals(totalTva, that.totalTva) &&
                Objects.equals(totalLocaltax1, that.totalLocaltax1) &&
                Objects.equals(totalLocaltax2, that.totalLocaltax2) &&
                Objects.equals(totalTtc, that.totalTtc) &&
                Objects.equals(productType, that.productType) &&
                Objects.equals(infoBits, that.infoBits) &&
                Objects.equals(buyPriceHt, that.buyPriceHt) &&
                Objects.equals(fkProductFournisseurPrice, that.fkProductFournisseurPrice) &&
                Objects.equals(fkUserOuverture, that.fkUserOuverture) &&
                Objects.equals(fkUserCloture, that.fkUserCloture) &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(fkMulticurrency, that.fkMulticurrency) &&
                Objects.equals(multicurrencyCode, that.multicurrencyCode) &&
                Objects.equals(multicurrencySubprice, that.multicurrencySubprice) &&
                Objects.equals(multicurrencyTotalHt, that.multicurrencyTotalHt) &&
                Objects.equals(multicurrencyTotalTva, that.multicurrencyTotalTva) &&
                Objects.equals(multicurrencyTotalTtc, that.multicurrencyTotalTtc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowid, tms, statut, label, description, fkRemiseExcept, dateCommande, dateOuverturePrevue, dateOuverture, dateFinValidite, dateCloture, vatSrcCode, tvaTx, localtax1Tx, localtax1Type, localtax2Tx, localtax2Type, qty, remisePercent, subprice, priceHt, remise, totalHt, totalTva, totalLocaltax1, totalLocaltax2, totalTtc, productType, infoBits, buyPriceHt, fkProductFournisseurPrice, fkUserAuthor, fkUserOuverture, fkUserCloture, commentaire, fkMulticurrency, multicurrencyCode, multicurrencySubprice, multicurrencyTotalHt, multicurrencyTotalTva, multicurrencyTotalTtc);
    }

    @ManyToOne
    @JoinColumn(name = "fk_product", referencedColumnName = "rowid")
    public EndlifeProductEntity getEndlifeProductByFkProduct() {
        return endlifeProductByFkProduct;
    }

    public void setEndlifeProductByFkProduct(EndlifeProductEntity endlifeProductByFkProduct) {
        this.endlifeProductByFkProduct = endlifeProductByFkProduct;
    }
}
