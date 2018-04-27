package me.kamili.rachid.walmartapp.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Product {
    @SerializedName("longDescription")
    private String longDescription;

    @SerializedName("twoThreeDayShippingRate")
    private double twoThreeDayShippingRate;

    @SerializedName("largeImage")
    private String largeImage;

    @SerializedName("color")
    private String color;

    @SerializedName("gender")
    private String gender;

    @SerializedName("categoryNode")
    private String categoryNode;

    @SerializedName("mediumImage")
    private String mediumImage;

    @SerializedName("variants")
    private List<Integer> variants;

    @SerializedName("productTrackingUrl")
    private String productTrackingUrl;

    @SerializedName("parentItemId")
    private int parentItemId;

    @SerializedName("standardShipRate")
    private double standardShipRate;

    @SerializedName("msrp")
    private double msrp;

    @SerializedName("clearance")
    private boolean clearance;

    @SerializedName("preOrder")
    private boolean preOrder;

    @SerializedName("thumbnailImage")
    private String thumbnailImage;

    @SerializedName("stock")
    private String stock;

    @SerializedName("bundle")
    private boolean bundle;

    @SerializedName("brandName")
    private String brandName;

    @SerializedName("addToCartUrl")
    private String addToCartUrl;

    @SerializedName("marketplace")
    private boolean marketplace;

    @SerializedName("salePrice")
    private double salePrice;

    @SerializedName("categoryPath")
    private String categoryPath;

    @SerializedName("upc")
    private String upc;

    @SerializedName("shortDescription")
    private String shortDescription;

    @SerializedName("sellerInfo")
    private String sellerInfo;

    @SerializedName("itemId")
    private int itemId;

    @SerializedName("size")
    private String size;

    @SerializedName("affiliateAddToCartUrl")
    private String affiliateAddToCartUrl;

    @SerializedName("name")
    private String name;

    @SerializedName("modelNumber")
    private String modelNumber;

    @SerializedName("attributes")
    private Attributes attributes;

    @SerializedName("availableOnline")
    private boolean availableOnline;

    @SerializedName("productUrl")
    private String productUrl;

    @SerializedName("freeShippingOver50Dollars")
    private boolean freeShippingOver50Dollars;

    public void setLongDescription(String longDescription){
        this.longDescription = longDescription;
    }

    public String getLongDescription(){
        return longDescription;
    }

    public void setTwoThreeDayShippingRate(double twoThreeDayShippingRate){
        this.twoThreeDayShippingRate = twoThreeDayShippingRate;
    }

    public double getTwoThreeDayShippingRate(){
        return twoThreeDayShippingRate;
    }

    public void setLargeImage(String largeImage){
        this.largeImage = largeImage;
    }

    public String getLargeImage(){
        return largeImage;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setCategoryNode(String categoryNode){
        this.categoryNode = categoryNode;
    }

    public String getCategoryNode(){
        return categoryNode;
    }

    public void setMediumImage(String mediumImage){
        this.mediumImage = mediumImage;
    }

    public String getMediumImage(){
        return mediumImage;
    }

    public void setVariants(List<Integer> variants){
        this.variants = variants;
    }

    public List<Integer> getVariants(){
        return variants;
    }

    public void setProductTrackingUrl(String productTrackingUrl){
        this.productTrackingUrl = productTrackingUrl;
    }

    public String getProductTrackingUrl(){
        return productTrackingUrl;
    }

    public void setParentItemId(int parentItemId){
        this.parentItemId = parentItemId;
    }

    public int getParentItemId(){
        return parentItemId;
    }

    public void setStandardShipRate(double standardShipRate){
        this.standardShipRate = standardShipRate;
    }

    public double getStandardShipRate(){
        return standardShipRate;
    }

    public void setMsrp(double msrp){
        this.msrp = msrp;
    }

    public double getMsrp(){
        return msrp;
    }

    public void setClearance(boolean clearance){
        this.clearance = clearance;
    }

    public boolean isClearance(){
        return clearance;
    }

    public void setPreOrder(boolean preOrder){
        this.preOrder = preOrder;
    }

    public boolean isPreOrder(){
        return preOrder;
    }

    public void setThumbnailImage(String thumbnailImage){
        this.thumbnailImage = thumbnailImage;
    }

    public String getThumbnailImage(){
        return thumbnailImage;
    }

    public void setStock(String stock){
        this.stock = stock;
    }

    public String getStock(){
        return stock;
    }

    public void setBundle(boolean bundle){
        this.bundle = bundle;
    }

    public boolean isBundle(){
        return bundle;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
    }

    public void setAddToCartUrl(String addToCartUrl){
        this.addToCartUrl = addToCartUrl;
    }

    public String getAddToCartUrl(){
        return addToCartUrl;
    }

    public void setMarketplace(boolean marketplace){
        this.marketplace = marketplace;
    }

    public boolean isMarketplace(){
        return marketplace;
    }

    public void setSalePrice(double salePrice){
        this.salePrice = salePrice;
    }

    public double getSalePrice(){
        return salePrice;
    }

    public void setCategoryPath(String categoryPath){
        this.categoryPath = categoryPath;
    }

    public String getCategoryPath(){
        return categoryPath;
    }

    public void setUpc(String upc){
        this.upc = upc;
    }

    public String getUpc(){
        return upc;
    }

    public void setShortDescription(String shortDescription){
        this.shortDescription = shortDescription;
    }

    public String getShortDescription(){
        return shortDescription;
    }

    public void setSellerInfo(String sellerInfo){
        this.sellerInfo = sellerInfo;
    }

    public String getSellerInfo(){
        return sellerInfo;
    }

    public void setItemId(int itemId){
        this.itemId = itemId;
    }

    public int getItemId(){
        return itemId;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl){
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
    }

    public String getAffiliateAddToCartUrl(){
        return affiliateAddToCartUrl;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setModelNumber(String modelNumber){
        this.modelNumber = modelNumber;
    }

    public String getModelNumber(){
        return modelNumber;
    }

    public void setAttributes(Attributes attributes){
        this.attributes = attributes;
    }

    public Attributes getAttributes(){
        return attributes;
    }

    public void setAvailableOnline(boolean availableOnline){
        this.availableOnline = availableOnline;
    }

    public boolean isAvailableOnline(){
        return availableOnline;
    }

    public void setProductUrl(String productUrl){
        this.productUrl = productUrl;
    }

    public String getProductUrl(){
        return productUrl;
    }

    public void setFreeShippingOver50Dollars(boolean freeShippingOver50Dollars){
        this.freeShippingOver50Dollars = freeShippingOver50Dollars;
    }

    public boolean isFreeShippingOver50Dollars(){
        return freeShippingOver50Dollars;
    }

    @Override
    public String toString(){
        return
                "ItemsItem{" +
                        "longDescription = '" + longDescription + '\'' +
                        ",twoThreeDayShippingRate = '" + twoThreeDayShippingRate + '\'' +
                        ",largeImage = '" + largeImage + '\'' +
                        ",color = '" + color + '\'' +
                        ",gender = '" + gender + '\'' +
                        ",categoryNode = '" + categoryNode + '\'' +
                        ",mediumImage = '" + mediumImage + '\'' +
                        ",variants = '" + variants + '\'' +
                        ",productTrackingUrl = '" + productTrackingUrl + '\'' +
                        ",parentItemId = '" + parentItemId + '\'' +
                        ",standardShipRate = '" + standardShipRate + '\'' +
                        ",msrp = '" + msrp + '\'' +
                        ",clearance = '" + clearance + '\'' +
                        ",preOrder = '" + preOrder + '\'' +
                        ",thumbnailImage = '" + thumbnailImage + '\'' +
                        ",stock = '" + stock + '\'' +
                        ",bundle = '" + bundle + '\'' +
                        ",brandName = '" + brandName + '\'' +
                        ",addToCartUrl = '" + addToCartUrl + '\'' +
                        ",marketplace = '" + marketplace + '\'' +
                        ",salePrice = '" + salePrice + '\'' +
                        ",categoryPath = '" + categoryPath + '\'' +
                        ",upc = '" + upc + '\'' +
                        ",shortDescription = '" + shortDescription + '\'' +
                        ",sellerInfo = '" + sellerInfo + '\'' +
                        ",itemId = '" + itemId + '\'' +
                        ",size = '" + size + '\'' +
                        ",affiliateAddToCartUrl = '" + affiliateAddToCartUrl + '\'' +
                        ",name = '" + name + '\'' +
                        ",modelNumber = '" + modelNumber + '\'' +
                        ",attributes = '" + attributes + '\'' +
                        ",availableOnline = '" + availableOnline + '\'' +
                        ",productUrl = '" + productUrl + '\'' +
                        ",freeShippingOver50Dollars = '" + freeShippingOver50Dollars + '\'' +
                        "}";
    }
}
