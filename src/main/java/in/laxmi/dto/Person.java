package in.laxmi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString*/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private Integer personId;
	private String personName;
	private Integer mobleNo;
	
}
