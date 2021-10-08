//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.caching.ecom;

import java.util.ArrayList;
import java.util.List;

public class ProductPricesDto extends AbstractDto {
    private static final long serialVersionUID = 1L;
    private List<Long> productModelIdList = new ArrayList();

    public ProductPricesDto() {
    }

    public List<Long> getProductModelIdList() {
        return this.productModelIdList;
    }

    public void setProductModelIdList(final List<Long> productModelIdList) {
        this.productModelIdList = productModelIdList;
    }

    public String toString() {
        return "ProductPricesDto(productModelIdList=" + this.getProductModelIdList() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ProductPricesDto)) {
            return false;
        } else {
            ProductPricesDto other = (ProductPricesDto)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$productModelIdList = this.getProductModelIdList();
                Object other$productModelIdList = other.getProductModelIdList();
                if (this$productModelIdList == null) {
                    if (other$productModelIdList != null) {
                        return false;
                    }
                } else if (!this$productModelIdList.equals(other$productModelIdList)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductPricesDto;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $productModelIdList = this.getProductModelIdList();
        result = result * 59 + ($productModelIdList == null ? 43 : $productModelIdList.hashCode());
        return result;
    }
}
