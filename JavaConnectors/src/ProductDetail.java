import javax.persistence.*;
@Entity
@Table(name="product_detail")
public class ProductDetail {
 
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "ProductDetail [productId=" + productId + ", manufacturer=" + manufacturer + ", origin=" + origin
				+ ", product=" + product + "]";
	}
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String manufacturer;
	private String origin;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Product product;
}
