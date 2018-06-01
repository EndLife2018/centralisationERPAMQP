package guru.springframework.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "endlife_product_price", schema = "erp", catalog = "")
public class EndlifeProductPriceEntity {
    private int rowid;
    private int entity;
    private Timestamp tms;
    private Timestamp datePrice;
    private Short priceLevel;
    private Double price;
    private Double priceTtc;
    private Double priceMin;
    private Double priceMinTtc;
    private String priceBaseType;
    private String defaultVatCode;
    private double tvaTx;
    private int recuperableonly;
    private Double localtax1Tx;
    private String localtax1Type;
    private Double localtax2Tx;
    private String localtax2Type;
    private Byte tosell;
    private int priceByQty;
    private Integer fkPriceExpression;
    private String importKey;
    private Integer fkMulticurrency;
    private String multicurrencyCode;
    private Double multicurrencyTx;
    private Double multicurrencyPrice;
    private Double multicurrencyPriceTtc;
    @Basic
    @Column(name = "fk_product", nullable = false)
    private Integer fkProduct;
    //private EndlifeProductEntity endlifeProductByFkProduct;


    public Integer getFkProduct() {
        return fkProduct;
    }

    public void setFkProduct(Integer fkProduct) {
        this.fkProduct = fkProduct;
    }

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
    @Column(name = "tms", nullable = false)
    public Timestamp getTms() {
        return tms;
    }

    public void setTms(Timestamp tms) {
        this.tms = tms;
    }

    @Basic
    @Column(name = "date_price", nullable = false)
    public Timestamp getDatePrice() {
        return datePrice;
    }

    public void setDatePrice(Timestamp datePrice) {
        this.datePrice = datePrice;
    }

    @Basic
    @Column(name = "price_level", nullable = true)
    public Short getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(Short priceLevel) {
        this.priceLevel = priceLevel;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 8)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "price_ttc", nullable = true, precision = 8)
    public Double getPriceTtc() {
        return priceTtc;
    }

    public void setPriceTtc(Double priceTtc) {
        this.priceTtc = priceTtc;
    }

    @Basic
    @Column(name = "price_min", nullable = true, precision = 8)
    public Double getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(Double priceMin) {
        this.priceMin = priceMin;
    }

    @Basic
    @Column(name = "price_min_ttc", nullable = true, precision = 8)
    public Double getPriceMinTtc() {
        return priceMinTtc;
    }

    public void setPriceMinTtc(Double priceMinTtc) {
        this.priceMinTtc = priceMinTtc;
    }

    @Basic
    @Column(name = "price_base_type", nullable = true, length = 3)
    public String getPriceBaseType() {
        return priceBaseType;
    }

    public void setPriceBaseType(String priceBaseType) {
        this.priceBaseType = priceBaseType;
    }

    @Basic
    @Column(name = "default_vat_code", nullable = true, length = 10)
    public String getDefaultVatCode() {
        return defaultVatCode;
    }

    public void setDefaultVatCode(String defaultVatCode) {
        this.defaultVatCode = defaultVatCode;
    }

    @Basic
    @Column(name = "tva_tx", nullable = false, precision = 3)
    public double getTvaTx() {
        return tvaTx;
    }

    public void setTvaTx(double tvaTx) {
        this.tvaTx = tvaTx;
    }

    @Basic
    @Column(name = "recuperableonly", nullable = false)
    public int getRecuperableonly() {
        return recuperableonly;
    }

    public void setRecuperableonly(int recuperableonly) {
        this.recuperableonly = recuperableonly;
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
    @Column(name = "localtax1_type", nullable = false, length = 10)
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
    @Column(name = "localtax2_type", nullable = false, length = 10)
    public String getLocaltax2Type() {
        return localtax2Type;
    }

    public void setLocaltax2Type(String localtax2Type) {
        this.localtax2Type = localtax2Type;
    }

    @Basic
    @Column(name = "tosell", nullable = true)
    public Byte getTosell() {
        return tosell;
    }

    public void setTosell(Byte tosell) {
        this.tosell = tosell;
    }

    @Basic
    @Column(name = "price_by_qty", nullable = false)
    public int getPriceByQty() {
        return priceByQty;
    }

    public void setPriceByQty(int priceByQty) {
        this.priceByQty = priceByQty;
    }

    @Basic
    @Column(name = "fk_price_expression", nullable = true)
    public Integer getFkPriceExpression() {
        return fkPriceExpression;
    }

    public void setFkPriceExpression(Integer fkPriceExpression) {
        this.fkPriceExpression = fkPriceExpression;
    }

    @Basic
    @Column(name = "import_key", nullable = true, length = 14)
    public String getImportKey() {
        return importKey;
    }

    public void setImportKey(String importKey) {
        this.importKey = importKey;
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
    @Column(name = "multicurrency_tx", nullable = true, precision = 8)
    public Double getMulticurrencyTx() {
        return multicurrencyTx;
    }

    public void setMulticurrencyTx(Double multicurrencyTx) {
        this.multicurrencyTx = multicurrencyTx;
    }

    @Basic
    @Column(name = "multicurrency_price", nullable = true, precision = 8)
    public Double getMulticurrencyPrice() {
        return multicurrencyPrice;
    }

    public void setMulticurrencyPrice(Double multicurrencyPrice) {
        this.multicurrencyPrice = multicurrencyPrice;
    }

    @Basic
    @Column(name = "multicurrency_price_ttc", nullable = true, precision = 8)
    public Double getMulticurrencyPriceTtc() {
        return multicurrencyPriceTtc;
    }

    public void setMulticurrencyPriceTtc(Double multicurrencyPriceTtc) {
        this.multicurrencyPriceTtc = multicurrencyPriceTtc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlifeProductPriceEntity that = (EndlifeProductPriceEntity) o;
        return rowid == that.rowid &&
                entity == that.entity &&
                Double.compare(that.tvaTx, tvaTx) == 0 &&
                recuperableonly == that.recuperableonly &&
                priceByQty == that.priceByQty &&
                Objects.equals(tms, that.tms) &&
                Objects.equals(datePrice, that.datePrice) &&
                Objects.equals(priceLevel, that.priceLevel) &&
                Objects.equals(price, that.price) &&
                Objects.equals(priceTtc, that.priceTtc) &&
                Objects.equals(priceMin, that.priceMin) &&
                Objects.equals(priceMinTtc, that.priceMinTtc) &&
                Objects.equals(priceBaseType, that.priceBaseType) &&
                Objects.equals(defaultVatCode, that.defaultVatCode) &&
                Objects.equals(localtax1Tx, that.localtax1Tx) &&
                Objects.equals(localtax1Type, that.localtax1Type) &&
                Objects.equals(localtax2Tx, that.localtax2Tx) &&
                Objects.equals(localtax2Type, that.localtax2Type) &&
                Objects.equals(tosell, that.tosell) &&
                Objects.equals(fkPriceExpression, that.fkPriceExpression) &&
                Objects.equals(importKey, that.importKey) &&
                Objects.equals(fkMulticurrency, that.fkMulticurrency) &&
                Objects.equals(multicurrencyCode, that.multicurrencyCode) &&
                Objects.equals(multicurrencyTx, that.multicurrencyTx) &&
                Objects.equals(multicurrencyPrice, that.multicurrencyPrice) &&
                Objects.equals(multicurrencyPriceTtc, that.multicurrencyPriceTtc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowid, entity, tms, datePrice, priceLevel, price, priceTtc, priceMin, priceMinTtc, priceBaseType, defaultVatCode, tvaTx, recuperableonly, localtax1Tx, localtax1Type, localtax2Tx, localtax2Type, tosell, priceByQty, fkPriceExpression, importKey, fkMulticurrency, multicurrencyCode, multicurrencyTx, multicurrencyPrice, multicurrencyPriceTtc);
    }

    /*@ManyToOne
    @JoinColumn(name = "fk_product", referencedColumnName = "rowid", nullable = false)
    public EndlifeProductEntity getEndlifeProductByFkProduct() {
        return endlifeProductByFkProduct;
    }

    public void setEndlifeProductByFkProduct(EndlifeProductEntity endlifeProductByFkProduct) {
        this.endlifeProductByFkProduct = endlifeProductByFkProduct;
    }*/
}
