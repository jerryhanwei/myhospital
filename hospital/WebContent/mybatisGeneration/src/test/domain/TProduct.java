package test.domain;

public class TProduct {
    private String tProductId;

    private String tProductName;

    private String tProductPrice;

    private String tProductNum;

    private String tProductPicurl;

    private String tProductIndate;

    private String tProductOutdate;

    private String tProductType;

    public String gettProductId() {
        return tProductId;
    }

    public void settProductId(String tProductId) {
        this.tProductId = tProductId == null ? null : tProductId.trim();
    }

    public String gettProductName() {
        return tProductName;
    }

    public void settProductName(String tProductName) {
        this.tProductName = tProductName == null ? null : tProductName.trim();
    }

    public String gettProductPrice() {
        return tProductPrice;
    }

    public void settProductPrice(String tProductPrice) {
        this.tProductPrice = tProductPrice == null ? null : tProductPrice.trim();
    }

    public String gettProductNum() {
        return tProductNum;
    }

    public void settProductNum(String tProductNum) {
        this.tProductNum = tProductNum == null ? null : tProductNum.trim();
    }

    public String gettProductPicurl() {
        return tProductPicurl;
    }

    public void settProductPicurl(String tProductPicurl) {
        this.tProductPicurl = tProductPicurl == null ? null : tProductPicurl.trim();
    }

    public String gettProductIndate() {
        return tProductIndate;
    }

    public void settProductIndate(String tProductIndate) {
        this.tProductIndate = tProductIndate == null ? null : tProductIndate.trim();
    }

    public String gettProductOutdate() {
        return tProductOutdate;
    }

    public void settProductOutdate(String tProductOutdate) {
        this.tProductOutdate = tProductOutdate == null ? null : tProductOutdate.trim();
    }

    public String gettProductType() {
        return tProductType;
    }

    public void settProductType(String tProductType) {
        this.tProductType = tProductType == null ? null : tProductType.trim();
    }
}