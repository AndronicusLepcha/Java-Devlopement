import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Driver {
	public static void main(String args[]) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Robot");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		//product instance
		Product prd=new Product();
		prd.setProdName("Blanket");
		prd.setPrice(3000);
		prd.setDescription("Nylon");		
		prd.setPrice(4000);
		ProductDetail prdDetail=new ProductDetail();
		prdDetail.setManufacturer("GoCotton");
		prdDetail.setOrigin("US");
		//bidirectional
		prd.setProductDetail(prdDetail);
		
		prdDetail.setProduct(prd);
		em.persist(prd);
		em.persist(prdDetail);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
