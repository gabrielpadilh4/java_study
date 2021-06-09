package com.github.gabrielpadilh4.basic.test.OneToMany;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.OneToMany.PurchaseOrder;
import com.github.gabrielpadilh4.model.OneToMany.PurchaseOrderItem;

public class GetPurchaseOrder {

    public static void main(String[] args) {

        DAO<PurchaseOrder> dao = new DAO<>(PurchaseOrder.class);

        PurchaseOrder purchaseOrder = dao.getById(1L);

        for (PurchaseOrderItem item : purchaseOrder.getItems()) {
            System.out.println(item.getQuantity());
            System.out.println(item.getProduct().getName());
        }

        dao.close();

    }
}
