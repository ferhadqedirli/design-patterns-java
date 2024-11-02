package com.company.abstract_factory.website;

import com.company.abstract_factory.ProductOwner;

public class WebsitePO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Website PO manage product");
    }
}
