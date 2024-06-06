package laptop.laptop.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private String price;
    @Column(name = "detail_desc")
    private String detailDesc;
    @Column(name = "short_desc")
    private String shortDesc;
    @Column (name = "quantity")
    private long quantity;
    @Column(name = "sold")
    private long sold;
    @Column (name = "factory")
    private String factory;
    @Column(name = "target")
    private String target;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetailList;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public long getSold() {
        return sold;
    }

    public void setSold(long sold) {
        this.sold = sold;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", detailDesc='" + detailDesc + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", quantity=" + quantity +
                ", sold=" + sold +
                ", factory='" + factory + '\'' +
                ", target='" + target + '\'' +
                '}';
    }
}
