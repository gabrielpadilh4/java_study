package com.github.gabrielpadilh4.basic.test.OneToMany;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.OneToMany.PurchaseOrder;
import com.github.gabrielpadilh4.model.OneToMany.PurchaseOrderItem;
import com.github.gabrielpadilh4.model.Product;

public class NewPurchaseOrder {

    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Product product = new Product("Pen", 1.50);

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        PurchaseOrderItem purchaseOrderItem = new PurchaseOrderItem(purchaseOrder, product, 10);

        dao.openTransaction()
                .persist(product)
                .persist(purchaseOrder)
                .persist(purchaseOrderItem)
                .closeTransaction()
                .close();

    }
}
