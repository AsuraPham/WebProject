/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action.user;

import com.opensymphony.xwork2.ActionSupport;
import controller.user.ProductController;
import entities.Page;
import entities.database.ProductDetail;
import entities.database.ProductImage;
import java.lang.reflect.Array;
import java.util.Set;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import util.Util;


public class ProductAction extends ActionSupport implements ServletRequestAware{

    
    private ProductController controller;
    private HttpServletRequest request;
    
    private List<ProductDetail> lstProduct; 
    
    private final int pageSize = 20;
    private int totalPage;
    private List<Page> lstPage; 
    
    public ProductAction() {
        controller = new ProductController();
    }
    
    public String getBanner(){
        lstProduct = controller.get4NewestProduct();
        ProductDetail.getThumnailImage(lstProduct);
        lstProduct.get(0).setBannerStatus("active");
        return SUCCESS;
    }
    
    public String getTop5(){
        lstProduct = controller.get5MostViewProduct();
        ProductDetail.getThumnailImage(lstProduct);
        return SUCCESS;
    }
    
    public String getPagination()
    {
        int curPage = 1;
        String curPageStr = request.getParameter("page");
        try {
            curPage = Integer.parseInt(curPageStr);
        }
        catch (Exception e){
            
        }
        lstProduct = controller.getAllProduct();
        lstProduct = Util.getPagitation(lstProduct, curPage, pageSize);
        totalPage = Util.getTotalPage(lstProduct.size(), pageSize);
        lstPage = Page.getPageList(totalPage, curPage);
        ProductDetail.getThumnailImage(lstProduct);
        return SUCCESS;
    }
    
    @Override
    public void setServletRequest(HttpServletRequest hsr) {
      this.request = hsr;
    }
    
    public List<ProductDetail> getLstProduct() {
        return lstProduct;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public List<Page> getLstPage() {
        return lstPage;
    }

    public void setLstPage(List<Page> lstPage) {
        this.lstPage = lstPage;
    }

    
}
