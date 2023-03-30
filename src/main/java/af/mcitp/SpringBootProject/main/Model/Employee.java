package af.mcitp.SpringBootProject.main.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Table
@Entity
@Setter
@Getter
public class Employee {
	 @Id
	   @Column
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
		private long ID;
	   @Column
	   @NotBlank
		private String name;
	   @Column
	   @NotBlank
		private String lastName;
	   @Column
	   @NotBlank
		private String fatherName;
	   @Column
	   @NotNull
		private int phone;
}