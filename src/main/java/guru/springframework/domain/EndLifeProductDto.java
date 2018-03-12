package guru.springframework.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class EndLifeProductDto implements Serializable {

    private static final long serialVersionUID = -295422703255886286L;
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

    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getEntity() {
        return entity;
    }

    public void setEntity(int entity) {
        this.entity = entity;
    }

    public String getRefExt() {
        return refExt;
    }

    public void setRefExt(String refExt) {
        this.refExt = refExt;
    }

    public Timestamp getDatec() {
        return datec;
    }

    public void setDatec(Timestamp datec) {
        this.datec = datec;
    }

    public Timestamp getTms() {
        return tms;
    }

    public void setTms(Timestamp tms) {
        this.tms = tms;
    }

    public Integer getFkParent() {
        return fkParent;
    }

    public void setFkParent(Integer fkParent) {
        this.fkParent = fkParent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotePublic() {
        return notePublic;
    }

    public void setNotePublic(String notePublic) {
        this.notePublic = notePublic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPriceTtc() {
        return priceTtc;
    }

    public void setPriceTtc(Double priceTtc) {
        this.priceTtc = priceTtc;
    }

    public Double getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(Double priceMin) {
        this.priceMin = priceMin;
    }

    public Double getPriceMinTtc() {
        return priceMinTtc;
    }

    public void setPriceMinTtc(Double priceMinTtc) {
        this.priceMinTtc = priceMinTtc;
    }

    public String getPriceBaseType() {
        return priceBaseType;
    }

    public void setPriceBaseType(String priceBaseType) {
        this.priceBaseType = priceBaseType;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public String getDefaultVatCode() {
        return defaultVatCode;
    }

    public void setDefaultVatCode(String defaultVatCode) {
        this.defaultVatCode = defaultVatCode;
    }

    public Double getTvaTx() {
        return tvaTx;
    }

    public void setTvaTx(Double tvaTx) {
        this.tvaTx = tvaTx;
    }

    public int getRecuperableonly() {
        return recuperableonly;
    }

    public void setRecuperableonly(int recuperableonly) {
        this.recuperableonly = recuperableonly;
    }

    public Double getLocaltax1Tx() {
        return localtax1Tx;
    }

    public void setLocaltax1Tx(Double localtax1Tx) {
        this.localtax1Tx = localtax1Tx;
    }

    public String getLocaltax1Type() {
        return localtax1Type;
    }

    public void setLocaltax1Type(String localtax1Type) {
        this.localtax1Type = localtax1Type;
    }

    public Double getLocaltax2Tx() {
        return localtax2Tx;
    }

    public void setLocaltax2Tx(Double localtax2Tx) {
        this.localtax2Tx = localtax2Tx;
    }

    public String getLocaltax2Type() {
        return localtax2Type;
    }

    public void setLocaltax2Type(String localtax2Type) {
        this.localtax2Type = localtax2Type;
    }

    public Integer getFkUserAuthor() {
        return fkUserAuthor;
    }

    public void setFkUserAuthor(Integer fkUserAuthor) {
        this.fkUserAuthor = fkUserAuthor;
    }

    public Integer getFkUserModif() {
        return fkUserModif;
    }

    public void setFkUserModif(Integer fkUserModif) {
        this.fkUserModif = fkUserModif;
    }

    public Byte getTosell() {
        return tosell;
    }

    public void setTosell(Byte tosell) {
        this.tosell = tosell;
    }

    public Byte getTobuy() {
        return tobuy;
    }

    public void setTobuy(Byte tobuy) {
        this.tobuy = tobuy;
    }

    public Byte getOnportal() {
        return onportal;
    }

    public void setOnportal(Byte onportal) {
        this.onportal = onportal;
    }

    public byte getTobatch() {
        return tobatch;
    }

    public void setTobatch(byte tobatch) {
        this.tobatch = tobatch;
    }

    public Integer getFkProductType() {
        return fkProductType;
    }

    public void setFkProductType(Integer fkProductType) {
        this.fkProductType = fkProductType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getSeuilStockAlerte() {
        return seuilStockAlerte;
    }

    public void setSeuilStockAlerte(Integer seuilStockAlerte) {
        this.seuilStockAlerte = seuilStockAlerte;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getAccountancyCodeSell() {
        return accountancyCodeSell;
    }

    public void setAccountancyCodeSell(String accountancyCodeSell) {
        this.accountancyCodeSell = accountancyCodeSell;
    }

    public String getAccountancyCodeBuy() {
        return accountancyCodeBuy;
    }

    public void setAccountancyCodeBuy(String accountancyCodeBuy) {
        this.accountancyCodeBuy = accountancyCodeBuy;
    }

    public String getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Byte getWeightUnits() {
        return weightUnits;
    }

    public void setWeightUnits(Byte weightUnits) {
        this.weightUnits = weightUnits;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Byte getLengthUnits() {
        return lengthUnits;
    }

    public void setLengthUnits(Byte lengthUnits) {
        this.lengthUnits = lengthUnits;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Byte getWidthUnits() {
        return widthUnits;
    }

    public void setWidthUnits(Byte widthUnits) {
        this.widthUnits = widthUnits;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Byte getHeightUnits() {
        return heightUnits;
    }

    public void setHeightUnits(Byte heightUnits) {
        this.heightUnits = heightUnits;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    public Byte getSurfaceUnits() {
        return surfaceUnits;
    }

    public void setSurfaceUnits(Byte surfaceUnits) {
        this.surfaceUnits = surfaceUnits;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Byte getVolumeUnits() {
        return volumeUnits;
    }

    public void setVolumeUnits(Byte volumeUnits) {
        this.volumeUnits = volumeUnits;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public double getPmp() {
        return pmp;
    }

    public void setPmp(double pmp) {
        this.pmp = pmp;
    }

    public Double getFifo() {
        return fifo;
    }

    public void setFifo(Double fifo) {
        this.fifo = fifo;
    }

    public Double getLifo() {
        return lifo;
    }

    public void setLifo(Double lifo) {
        this.lifo = lifo;
    }

    public String getCanvas() {
        return canvas;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }

    public Byte getFinished() {
        return finished;
    }

    public void setFinished(Byte finished) {
        this.finished = finished;
    }

    public Byte getHidden() {
        return hidden;
    }

    public void setHidden(Byte hidden) {
        this.hidden = hidden;
    }

    public String getImportKey() {
        return importKey;
    }

    public void setImportKey(String importKey) {
        this.importKey = importKey;
    }

    public String getModelPdf() {
        return modelPdf;
    }

    public void setModelPdf(String modelPdf) {
        this.modelPdf = modelPdf;
    }

    public Integer getFkPriceExpression() {
        return fkPriceExpression;
    }

    public void setFkPriceExpression(Integer fkPriceExpression) {
        this.fkPriceExpression = fkPriceExpression;
    }

    public Integer getDesiredstock() {
        return desiredstock;
    }

    public void setDesiredstock(Integer desiredstock) {
        this.desiredstock = desiredstock;
    }

    public Byte getPriceAutogen() {
        return priceAutogen;
    }

    public void setPriceAutogen(Byte priceAutogen) {
        this.priceAutogen = priceAutogen;
    }
}
