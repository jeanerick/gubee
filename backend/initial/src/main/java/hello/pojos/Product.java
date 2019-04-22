package hello.pojos;

import java.util.List;

public class Product {
    private String productName;
    private String description;
    private List<String> targetMarket;
    private List<String> stack;

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the targetMarket
     */
    public List<String> getTargetMarket() {
        return targetMarket;
    }

    /**
     * @param targetMarket the targetMarket to set
     */
    public void setTargetMarket(List<String> targetMarket) {
        this.targetMarket = targetMarket;
    }

    /**
     * @return the stack
     */
    public List<String> getStack() {
        return stack;
    }

    /**
     * @param stack the stack to set
     */
    public void setStack(List<String> stack) {
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "Product [description=" + description + ", productName=" + productName + ", stack=" + stack
                + ", targetMarket=" + targetMarket + "]";
    }


    
}