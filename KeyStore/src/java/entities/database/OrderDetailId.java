package entities.database;
// Generated Oct 21, 2017 10:21:01 PM by Hibernate Tools 4.3.1



/**
 * OrderDetailId generated by hbm2java
 */
public class OrderDetailId  implements java.io.Serializable {


     private int orderId;
     private int productId;
     private int number;

    public OrderDetailId() {
    }

    public OrderDetailId(int orderId, int productId, int number) {
       this.orderId = orderId;
       this.productId = productId;
       this.number = number;
    }
   
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getNumber() {
        return this.number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrderDetailId) ) return false;
		 OrderDetailId castOther = ( OrderDetailId ) other; 
         
		 return (this.getOrderId()==castOther.getOrderId())
 && (this.getProductId()==castOther.getProductId())
 && (this.getNumber()==castOther.getNumber());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getOrderId();
         result = 37 * result + this.getProductId();
         result = 37 * result + this.getNumber();
         return result;
   }   


}

