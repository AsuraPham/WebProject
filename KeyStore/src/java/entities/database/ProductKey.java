package entities.database;
// Generated Oct 21, 2017 10:21:01 PM by Hibernate Tools 4.3.1



/**
 * ProductKey generated by hbm2java
 */
public class ProductKey  implements java.io.Serializable {


     private String keyId;
     private ProductDetail productDetail;
     private Byte status;

    public ProductKey() {
    }

	
    public ProductKey(String keyId) {
        this.keyId = keyId;
    }
    public ProductKey(String keyId, ProductDetail productDetail, Byte status) {
       this.keyId = keyId;
       this.productDetail = productDetail;
       this.status = status;
    }
   
    public String getKeyId() {
        return this.keyId;
    }
    
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    public ProductDetail getProductDetail() {
        return this.productDetail;
    }
    
    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }
    public Byte getStatus() {
        return this.status;
    }
    
    public void setStatus(Byte status) {
        this.status = status;
    }




}


