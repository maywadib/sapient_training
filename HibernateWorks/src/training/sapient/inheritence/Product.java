package training.sapient.inheritence;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//every field in single table
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

// separate tables for each child class...product linked by discriminator  
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)


//child classes joined
@Inheritance(strategy = InheritanceType.JOINED)


@DiscriminatorColumn(name  = "Product_type")


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private int pId;
	private String pName;
	private String pDesc;
	private double pPrice;
	public Product(int pId, String pName, String pDesc, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
	}
}
