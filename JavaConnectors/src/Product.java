import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
 
@Entity
public class Product {
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prodId;
	@Column(name = "name")
	private String prodName;
	private int price;
	private String description;
	
	@OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
	private ProductDetail productDetail;
 
	public Product(int prodId, String prodName, int price, String description, ProductDetail productDetail) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.description=description;
		this.productDetail = productDetail;
	}
 
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public int getProdId() {
		return prodId;
	}
 
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
 
	public String getProdName() {
		return prodName;
	}
 
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
 
	public int getPrice() {
		return price;
	}
 
	public void setPrice(int price) {
		this.price = price;
	}
 
	public ProductDetail getProductDetail() {
		return productDetail;
	}
 
	public void setProductDetail(ProductDetail productDetail) {
		this.productDetail = productDetail;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", productDetail="
				+ productDetail + "]";
	}

}