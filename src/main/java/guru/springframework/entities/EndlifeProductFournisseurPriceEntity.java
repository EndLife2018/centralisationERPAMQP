package guru.springframework.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "endlife_product_fournisseur_price", schema = "erp", catalog = "")
public class EndlifeProductFournisseurPriceEntity {
    private int rowid;
    private int entity;
    private Timestamp datec;
    private Timestamp tms;
    private Integer fkSoc;
    private String refFourn;
    private Integer fkAvailability;
    private Double price;
    private Double quantity;
    private double remisePercent;
    private double remise;
    private Double unitprice;
    private Double charges;
    private Double unitcharges;
    private String defaultVatCode;
    private double tvaTx;
    private int infoBits;
    private Integer fkSupplierPriceExpression;
    private String importKey;
    private Integer deliveryTimeDays;
    private String supplierReputation;
    private Integer fkMulticurrency;
    private String multicurrencyCode;
    private Double multicurrencyTx;
    private Double multicurrencyPrice;
    private Double multicurrencyPriceTtc;
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
    @Column(name = "entity", nullable = false)
    public int getEntity() {
        return entity;
    }

    public void setEntity(int entity) {
        this.entity = entity;
    }

    @Basic
    @Column(name = "datec", nullable = true)
    public Timestamp getDatec() {
        return datec;
    }

    public void setDatec(Timestamp datec) {
        this.datec = datec;
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
    @Column(name = "fk_soc", nullable = true)
    public Integer getFkSoc() {
        return fkSoc;
    }

    public void setFkSoc(Integer fkSoc) {
        this.fkSoc = fkSoc;
    }

    @Basic
    @Column(name = "ref_fourn", nullable = true, length = 30)
    public String getRefFourn() {
        return refFourn;
    }

    public void setRefFourn(String refFourn) {
        this.refFourn = refFourn;
    }

    @Basic
    @Column(name = "fk_availability", nullable = true)
    public Integer getFkAvailability() {
        return fkAvailability;
    }

    public void setFkAvailability(Integer fkAvailability) {
        this.fkAvailability = fkAvailability;
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
    @Column(name = "quantity", nullable = true, precision = 0)
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "remise_percent", nullable = false, precision = 0)
    public double getRemisePercent() {
        return remisePercent;
    }

    public void setRemisePercent(double remisePercent) {
        this.remisePercent = remisePercent;
    }

    @Basic
    @Column(name = "remise", nullable = false, precision = 0)
    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    @Basic
    @Column(name = "unitprice", nullable = true, precision = 8)
    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    @Basic
    @Column(name = "charges", nullable = true, precision = 8)
    public Double getCharges() {
        return charges;
    }

    public void setCharges(Double charges) {
        this.charges = charges;
    }

    @Basic
    @Column(name = "unitcharges", nullable = true, precision = 8)
    public Double getUnitcharges() {
        return unitcharges;
    }

    public void setUnitcharges(Double unitcharges) {
        this.unitcharges = unitcharges;
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
    @Column(name = "info_bits", nullable = false)
    public int getInfoBits() {
        return infoBits;
    }

    public void setInfoBits(int infoBits) {
        this.infoBits = infoBits;
    }

    @Basic
    @Column(name = "fk_supplier_price_expression", nullable = true)
    public Integer getFkSupplierPriceExpression() {
        return fkSupplierPriceExpression;
    }

    public void setFkSupplierPriceExpression(Integer fkSupplierPriceExpression) {
        this.fkSupplierPriceExpression = fkSupplierPriceExpression;
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
    @Column(name = "delivery_time_days", nullable = true)
    public Integer getDeliveryTimeDays() {
        return deliveryTimeDays;
    }

    public void setDeliveryTimeDays(Integer deliveryTimeDays) {
        this.deliveryTimeDays = deliveryTimeDays;
    }

    @Basic
    @Column(name = "supplier_reputation", nullable = true, length = 10)
    public String getSupplierReputation() {
        return supplierReputation;
    }

    public void setSupplierReputation(String supplierReputation) {
        this.supplierReputation = supplierReputation;
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
        EndlifeProductFournisseurPriceEntity that = (EndlifeProductFournisseurPriceEntity) o;
        return rowid == that.rowid &&
                entity == that.entity &&
                Double.compare(that.remisePercent, remisePercent) == 0 &&
                Double.compare(that.remise, remise) == 0 &&
                Double.compare(that.tvaTx, tvaTx) == 0 &&
                infoBits == that.infoBits &&
                Objects.equals(datec, that.datec) &&
                Objects.equals(tms, that.tms) &&
                Objects.equals(fkSoc, that.fkSoc) &&
                Objects.equals(refFourn, that.refFourn) &&
                Objects.equals(fkAvailability, that.fkAvailability) &&
                Objects.equals(price, that.price) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(unitprice, that.unitprice) &&
                Objects.equals(charges, that.charges) &&
                Objects.equals(unitcharges, that.unitcharges) &&
                Objects.equals(defaultVatCode, that.defaultVatCode) &&
                Objects.equals(fkSupplierPriceExpression, that.fkSupplierPriceExpression) &&
                Objects.equals(importKey, that.importKey) &&
                Objects.equals(deliveryTimeDays, that.deliveryTimeDays) &&
                Objects.equals(supplierReputation, that.supplierReputation) &&
                Objects.equals(fkMulticurrency, that.fkMulticurrency) &&
                Objects.equals(multicurrencyCode, that.multicurrencyCode) &&
                Objects.equals(multicurrencyTx, that.multicurrencyTx) &&
                Objects.equals(multicurrencyPrice, that.multicurrencyPrice) &&
                Objects.equals(multicurrencyPriceTtc, that.multicurrencyPriceTtc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowid, entity, datec, tms, fkSoc, refFourn, fkAvailability, price, quantity, remisePercent, remise, unitprice, charges, unitcharges, defaultVatCode, tvaTx, infoBits, fkSupplierPriceExpression, importKey, deliveryTimeDays, supplierReputation, fkMulticurrency, multicurrencyCode, multicurrencyTx, multicurrencyPrice, multicurrencyPriceTtc);
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
