package entities.database;
// Generated Oct 21, 2017 10:21:01 PM by Hibernate Tools 4.3.1



/**
 * OrderDetail generated by hbm2java
 */
public class OrderDetail  implements java.io.Serializable {


     private OrderDetailId id;
     private Order order;
     private ProductDetail productDetail;

    public OrderDetail() {
    }

    public OrderDetail(OrderDetailId id, Order order, ProductDetail productDetail) {
       this.id = id;
       this.order = order;
       this.productDetail = productDetail;
    }
   
    public OrderDetailId getId() {
        return this.id;
    }
    
    public void setId(OrderDetailId id) {
        this.id = id;
    }
    public Order getOrder() {
        return this.order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    public ProductDetail getProductDetail() {
        return this.productDetail;
    }
    
    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }




}


