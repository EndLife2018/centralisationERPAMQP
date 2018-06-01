package guru.springframework.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "endlife_product", schema = "erp", catalog = "")
public class EndlifeProductEntity {
    private int rowid;
    private String ref;
    private int entity;
    private String refExt;
    private Timestamp datec;
    private Timestamp tms;
    private Integer fkParent;
    private String label;
    private String description;
    private String notePublic;
    private String note;
    private String customcode;
    private Double price;
    private Double priceTtc;
    private Double priceMin;
    private Double priceMinTtc;
    private String priceBaseType;
    private Double costPrice;
    private String defaultVatCode;
    private Double tvaTx;
    private int recuperableonly;
    private Double localtax1Tx;
    private String localtax1Type;
    private Double localtax2Tx;
    private String localtax2Type;
    private Integer fkUserAuthor;
    private Integer fkUserModif;
    private Byte tosell;
    private Byte tobuy;
    private Byte onportal;
    private byte tobatch;
    private Integer fkProductType;
    private String duration;
    private Integer seuilStockAlerte;
    private String url;
    private String barcode;
    private String accountancyCodeSell;
    private String accountancyCodeBuy;
    private String partnumber;
    private Double weight;
    private Byte weightUnits;
    private Double length;
    private Byte lengthUnits;
    private Double width;
    private Byte widthUnits;
    private Double height;
    private Byte heightUnits;
    private Double surface;
    private Byte surfaceUnits;
    private Double volume;
    private Byte volumeUnits;
    private Double stock;
    private double pmp;
    private Double fifo;
    private Double lifo;
    private String canvas;
    private Byte finished;
    private Byte hidden;
    private String importKey;
    private String modelPdf;
    private Integer fkPriceExpression;
    private Integer desiredstock;
    private Byte priceAutogen;
    private Byte isSync;
    //private Collection<EndlifeCategorieProductEntity> endlifeCategorieProductsByRowid;
    /*private Collection<EndlifeContratdetEntity> endlifeContratdetsByRowid;
    private EndlifeCCountryEntity endlifeCCountryByFkCountry;
    private EndlifeCBarcodeTypeEntity endlifeCBarcodeTypeByFkBarcodeType;
    private EndlifeCUnitsEntity endlifeCUnitsByFkUnit;
    private Collection<EndlifeProductCustomerPriceEntity> endlifeProductCustomerPricesByRowid;
    private Collection<EndlifeProductFournisseurPriceEntity> endlifeProductFournisseurPricesByRowid;
    private Collection<EndlifeProductLangEntity> endlifeProductLangsByRowid;
    private Collection<EndlifeProductPriceEntity> endlifeProductPricesByRowid;*/
    private String crud;

    @Transient
    public String getCrud() {
        return crud;
    }

    public void setCrud(String crud) {
        this.crud = crud;
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
    @Column(name = "ref", nullable = false, length = 128)
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
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
    @Column(name = "ref_ext", nullable = true, length = 128)
    public String getRefExt() {
        return refExt;
    }

    public void setRefExt(String refExt) {
        this.refExt = refExt;
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
    @Column(name = "fk_parent", nullable = true)
    public Integer getFkParent() {
        return fkParent;
    }

    public void setFkParent(Integer fkParent) {
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
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "note_public", nullable = true, length = -1)
    public String getNotePublic() {
        return notePublic;
    }

    public void setNotePublic(String notePublic) {
        this.notePublic = notePublic;
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
    @Column(name = "customcode", nullable = true, length = 32)
    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode;
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
    @Column(name = "cost_price", nullable = true, precision = 8)
    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
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
    @Column(name = "tva_tx", nullable = true, precision = 3)
    public Double getTvaTx() {
        return tvaTx;
    }

    public void setTvaTx(Double tvaTx) {
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
    @Column(name = "fk_user_author", nullable = true)
    public Integer getFkUserAuthor() {
        return fkUserAuthor;
    }

    public void setFkUserAuthor(Integer fkUserAuthor) {
        this.fkUserAuthor = fkUserAuthor;
    }

    @Basic
    @Column(name = "fk_user_modif", nullable = true)
    public Integer getFkUserModif() {
        return fkUserModif;
    }

    public void setFkUserModif(Integer fkUserModif) {
        this.fkUserModif = fkUserModif;
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
    @Column(name = "tobuy", nullable = true)
    public Byte getTobuy() {
        return tobuy;
    }

    public void setTobuy(Byte tobuy) {
        this.tobuy = tobuy;
    }

    @Basic
    @Column(name = "onportal", nullable = true)
    public Byte getOnportal() {
        return onportal;
    }

    public void setOnportal(Byte onportal) {
        this.onportal = onportal;
    }

    @Basic
    @Column(name = "tobatch", nullable = false)
    public byte getTobatch() {
        return tobatch;
    }

    public void setTobatch(byte tobatch) {
        this.tobatch = tobatch;
    }

    @Basic
    @Column(name = "fk_product_type", nullable = true)
    public Integer getFkProductType() {
        return fkProductType;
    }

    public void setFkProductType(Integer fkProductType) {
        this.fkProductType = fkProductType;
    }

    @Basic
    @Column(name = "duration", nullable = true, length = 6)
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "seuil_stock_alerte", nullable = true)
    public Integer getSeuilStockAlerte() {
        return seuilStockAlerte;
    }

    public void setSeuilStockAlerte(Integer seuilStockAlerte) {
        this.seuilStockAlerte = seuilStockAlerte;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "barcode", nullable = true, length = 255)
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Basic
    @Column(name = "accountancy_code_sell", nullable = true, length = 32)
    public String getAccountancyCodeSell() {
        return accountancyCodeSell;
    }

    public void setAccountancyCodeSell(String accountancyCodeSell) {
        this.accountancyCodeSell = accountancyCodeSell;
    }

    @Basic
    @Column(name = "accountancy_code_buy", nullable = true, length = 32)
    public String getAccountancyCodeBuy() {
        return accountancyCodeBuy;
    }

    public void setAccountancyCodeBuy(String accountancyCodeBuy) {
        this.accountancyCodeBuy = accountancyCodeBuy;
    }

    @Basic
    @Column(name = "partnumber", nullable = true, length = 32)
    public String getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber;
    }

    @Basic
    @Column(name = "weight", nullable = true, precision = 0)
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "weight_units", nullable = true)
    public Byte getWeightUnits() {
        return weightUnits;
    }

    public void setWeightUnits(Byte weightUnits) {
        this.weightUnits = weightUnits;
    }

    @Basic
    @Column(name = "length", nullable = true, precision = 0)
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Basic
    @Column(name = "length_units", nullable = true)
    public Byte getLengthUnits() {
        return lengthUnits;
    }

    public void setLengthUnits(Byte lengthUnits) {
        this.lengthUnits = lengthUnits;
    }

    @Basic
    @Column(name = "width", nullable = true, precision = 0)
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Basic
    @Column(name = "width_units", nullable = true)
    public Byte getWidthUnits() {
        return widthUnits;
    }

    public void setWidthUnits(Byte widthUnits) {
        this.widthUnits = widthUnits;
    }

    @Basic
    @Column(name = "height", nullable = true, precision = 0)
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Basic
    @Column(name = "height_units", nullable = true)
    public Byte getHeightUnits() {
        return heightUnits;
    }

    public void setHeightUnits(Byte heightUnits) {
        this.heightUnits = heightUnits;
    }

    @Basic
    @Column(name = "surface", nullable = true, precision = 0)
    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    @Basic
    @Column(name = "surface_units", nullable = true)
    public Byte getSurfaceUnits() {
        return surfaceUnits;
    }

    public void setSurfaceUnits(Byte surfaceUnits) {
        this.surfaceUnits = surfaceUnits;
    }

    @Basic
    @Column(name = "volume", nullable = true, precision = 0)
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Basic
    @Column(name = "volume_units", nullable = true)
    public Byte getVolumeUnits() {
        return volumeUnits;
    }

    public void setVolumeUnits(Byte volumeUnits) {
        this.volumeUnits = volumeUnits;
    }

    @Basic
    @Column(name = "stock", nullable = true, precision = 0)
    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "pmp", nullable = false, precision = 8)
    public double getPmp() {
        return pmp;
    }

    public void setPmp(double pmp) {
        this.pmp = pmp;
    }

    @Basic
    @Column(name = "fifo", nullable = true, precision = 8)
    public Double getFifo() {
        return fifo;
    }

    public void setFifo(Double fifo) {
        this.fifo = fifo;
    }

    @Basic
    @Column(name = "lifo", nullable = true, precision = 8)
    public Double getLifo() {
        return lifo;
    }

    public void setLifo(Double lifo) {
        this.lifo = lifo;
    }

    @Basic
    @Column(name = "canvas", nullable = true, length = 32)
    public String getCanvas() {
        return canvas;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    @Basic
    @Column(name = "finished", nullable = true)
    public Byte getFinished() {
        return finished;
    }

    public void setFinished(Byte finished) {
        this.finished = finished;
    }

    @Basic
    @Column(name = "hidden", nullable = true)
    public Byte getHidden() {
        return hidden;
    }

    public void setHidden(Byte hidden) {
        this.hidden = hidden;
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
    @Column(name = "model_pdf", nullable = true, length = 255)
    public String getModelPdf() {
        return modelPdf;
    }

    public void setModelPdf(String modelPdf) {
        this.modelPdf = modelPdf;
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
    @Column(name = "desiredstock", nullable = true)
    public Integer getDesiredstock() {
        return desiredstock;
    }

    public void setDesiredstock(Integer desiredstock) {
        this.desiredstock = desiredstock;
    }

    @Basic
    @Column(name = "price_autogen", nullable = true)
    public Byte getPriceAutogen() {
        return priceAutogen;
    }

    public void setPriceAutogen(Byte priceAutogen) {
        this.priceAutogen = priceAutogen;
    }

    /*@Basic
    @Column(name = "is_sync", nullable = true)
    public Byte getIsSync() {
        return isSync;
    }

    public void setIsSync(Byte isSync) {
        this.isSync = isSync;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EndlifeProductEntity that = (EndlifeProductEntity) o;
        return rowid == that.rowid &&
                entity == that.entity &&
                recuperableonly == that.recuperableonly &&
                tobatch == that.tobatch &&
                Double.compare(that.pmp, pmp) == 0 &&
                Objects.equals(ref, that.ref) &&
                Objects.equals(refExt, that.refExt) &&
                Objects.equals(datec, that.datec) &&
                Objects.equals(tms, that.tms) &&
                Objects.equals(fkParent, that.fkParent) &&
                Objects.equals(label, that.label) &&
                Objects.equals(description, that.description) &&
                Objects.equals(notePublic, that.notePublic) &&
                Objects.equals(note, that.note) &&
                Objects.equals(customcode, that.customcode) &&
                Objects.equals(price, that.price) &&
                Objects.equals(priceTtc, that.priceTtc) &&
                Objects.equals(priceMin, that.priceMin) &&
                Objects.equals(priceMinTtc, that.priceMinTtc) &&
                Objects.equals(priceBaseType, that.priceBaseType) &&
                Objects.equals(costPrice, that.costPrice) &&
                Objects.equals(defaultVatCode, that.defaultVatCode) &&
                Objects.equals(tvaTx, that.tvaTx) &&
                Objects.equals(localtax1Tx, that.localtax1Tx) &&
                Objects.equals(localtax1Type, that.localtax1Type) &&
                Objects.equals(localtax2Tx, that.localtax2Tx) &&
                Objects.equals(localtax2Type, that.localtax2Type) &&
                Objects.equals(fkUserAuthor, that.fkUserAuthor) &&
                Objects.equals(fkUserModif, that.fkUserModif) &&
                Objects.equals(tosell, that.tosell) &&
                Objects.equals(tobuy, that.tobuy) &&
                Objects.equals(onportal, that.onportal) &&
                Objects.equals(fkProductType, that.fkProductType) &&
                Objects.equals(duration, that.duration) &&
                Objects.equals(seuilStockAlerte, that.seuilStockAlerte) &&
                Objects.equals(url, that.url) &&
                Objects.equals(barcode, that.barcode) &&
                Objects.equals(accountancyCodeSell, that.accountancyCodeSell) &&
                Objects.equals(accountancyCodeBuy, that.accountancyCodeBuy) &&
                Objects.equals(partnumber, that.partnumber) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(weightUnits, that.weightUnits) &&
                Objects.equals(length, that.length) &&
                Objects.equals(lengthUnits, that.lengthUnits) &&
                Objects.equals(width, that.width) &&
                Objects.equals(widthUnits, that.widthUnits) &&
                Objects.equals(height, that.height) &&
                Objects.equals(heightUnits, that.heightUnits) &&
                Objects.equals(surface, that.surface) &&
                Objects.equals(surfaceUnits, that.surfaceUnits) &&
                Objects.equals(volume, that.volume) &&
                Objects.equals(volumeUnits, that.volumeUnits) &&
                Objects.equals(stock, that.stock) &&
                Objects.equals(fifo, that.fifo) &&
                Objects.equals(lifo, that.lifo) &&
                Objects.equals(canvas, that.canvas) &&
                Objects.equals(finished, that.finished) &&
                Objects.equals(hidden, that.hidden) &&
                Objects.equals(importKey, that.importKey) &&
                Objects.equals(modelPdf, that.modelPdf) &&
                Objects.equals(fkPriceExpression, that.fkPriceExpression) &&
                Objects.equals(desiredstock, that.desiredstock) &&
                Objects.equals(priceAutogen, that.priceAutogen) &&
                Objects.equals(isSync, that.isSync);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rowid, ref, entity, refExt, datec, tms, fkParent, label, description, notePublic, note, customcode, price, priceTtc, priceMin, priceMinTtc, priceBaseType, costPrice, defaultVatCode, tvaTx, recuperableonly, localtax1Tx, localtax1Type, localtax2Tx, localtax2Type, fkUserAuthor, fkUserModif, tosell, tobuy, onportal, tobatch, fkProductType, duration, seuilStockAlerte, url, barcode, accountancyCodeSell, accountancyCodeBuy, partnumber, weight, weightUnits, length, lengthUnits, width, widthUnits, height, heightUnits, surface, surfaceUnits, volume, volumeUnits, stock, pmp, fifo, lifo, canvas, finished, hidden, importKey, modelPdf, fkPriceExpression, desiredstock, priceAutogen, isSync);
    }

    /*@OneToMany(mappedBy = "endlifeProductByFkProduct")
    public Collection<EndlifeCategorieProductEntity> getEndlifeCategorieProductsByRowid() {
        return endlifeCategorieProductsByRowid;
    }

    public void setEndlifeCategorieProductsByRowid(Collection<EndlifeCategorieProductEntity> endlifeCategorieProductsByRowid) {
        this.endlifeCategorieProductsByRowid = endlifeCategorieProductsByRowid;
    }*/

    /*@OneToMany(mappedBy = "endlifeProductByFkProduct")
    public Collection<EndlifeContratdetEntity> getEndlifeContratdetsByRowid() {
        return endlifeContratdetsByRowid;
    }

    public void setEndlifeContratdetsByRowid(Collection<EndlifeContratdetEntity> endlifeContratdetsByRowid) {
        this.endlifeContratdetsByRowid = endlifeContratdetsByRowid;
    }

    @ManyToOne
    @JoinColumn(name = "fk_country", referencedColumnName = "rowid")
    public EndlifeCCountryEntity getEndlifeCCountryByFkCountry() {
        return endlifeCCountryByFkCountry;
    }

    public void setEndlifeCCountryByFkCountry(EndlifeCCountryEntity endlifeCCountryByFkCountry) {
        this.endlifeCCountryByFkCountry = endlifeCCountryByFkCountry;
    }

    @ManyToOne
    @JoinColumn(name = "fk_barcode_type", referencedColumnName = "rowid")
    public EndlifeCBarcodeTypeEntity getEndlifeCBarcodeTypeByFkBarcodeType() {
        return endlifeCBarcodeTypeByFkBarcodeType;
    }

    public void setEndlifeCBarcodeTypeByFkBarcodeType(EndlifeCBarcodeTypeEntity endlifeCBarcodeTypeByFkBarcodeType) {
        this.endlifeCBarcodeTypeByFkBarcodeType = endlifeCBarcodeTypeByFkBarcodeType;
    }

    @ManyToOne
    @JoinColumn(name = "fk_unit", referencedColumnName = "rowid")
    public EndlifeCUnitsEntity getEndlifeCUnitsByFkUnit() {
        return endlifeCUnitsByFkUnit;
    }

    public void setEndlifeCUnitsByFkUnit(EndlifeCUnitsEntity endlifeCUnitsByFkUnit) {
        this.endlifeCUnitsByFkUnit = endlifeCUnitsByFkUnit;
    }

    @OneToMany(mappedBy = "endlifeProductByFkProduct")
    public Collection<EndlifeProductCustomerPriceEntity> getEndlifeProductCustomerPricesByRowid() {
        return endlifeProductCustomerPricesByRowid;
    }

    public void setEndlifeProductCustomerPricesByRowid(Collection<EndlifeProductCustomerPriceEntity> endlifeProductCustomerPricesByRowid) {
        this.endlifeProductCustomerPricesByRowid = endlifeProductCustomerPricesByRowid;
    }

    @OneToMany(mappedBy = "endlifeProductByFkProduct")
    public Collection<EndlifeProductFournisseurPriceEntity> getEndlifeProductFournisseurPricesByRowid() {
        return endlifeProductFournisseurPricesByRowid;
    }

    public void setEndlifeProductFournisseurPricesByRowid(Collection<EndlifeProductFournisseurPriceEntity> endlifeProductFournisseurPricesByRowid) {
        this.endlifeProductFournisseurPricesByRowid = endlifeProductFournisseurPricesByRowid;
    }

    @OneToMany(mappedBy = "endlifeProductByFkProduct")
    public Collection<EndlifeProductLangEntity> getEndlifeProductLangsByRowid() {
        return endlifeProductLangsByRowid;
    }

    public void setEndlifeProductLangsByRowid(Collection<EndlifeProductLangEntity> endlifeProductLangsByRowid) {
        this.endlifeProductLangsByRowid = endlifeProductLangsByRowid;
    }

    @OneToMany(mappedBy = "endlifeProductByFkProduct")
    public Collection<EndlifeProductPriceEntity> getEndlifeProductPricesByRowid() {
        return endlifeProductPricesByRowid;
    }

    public void setEndlifeProductPricesByRowid(Collection<EndlifeProductPriceEntity> endlifeProductPricesByRowid) {
        this.endlifeProductPricesByRowid = endlifeProductPricesByRowid;
    }*/
}
