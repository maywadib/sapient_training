package training.sapient.inheritence;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class CellPhone extends Product {

	private String type;
	private String os;
	private String connectivtiy;

	public CellPhone(int pId, String pName, String pDesc, double pPrice, String type, String os, String connectivtiy) {
		super(pId,pName,pDesc,pPrice);
		this.type = type;
		this.os = os;
		this.connectivtiy = connectivtiy;
	}
	
}
