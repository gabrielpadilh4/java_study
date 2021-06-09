package com.github.gabrielpadilh4.model.OneToMany;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "purchase_orders")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private Date date;

    @OneToMany(mappedBy = "purchaseOrder") // default fetch type is LAZY
    private List<PurchaseOrderItem> items;

    public PurchaseOrder() {
        this(new Date());
    }

    public PurchaseOrder(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<PurchaseOrderItem> getItems() {
        return items;
    }

    public void setItems(List<PurchaseOrderItem> items) {
        this.items = items;
    }
}
