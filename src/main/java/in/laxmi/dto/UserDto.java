package in.laxmi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
private Integer userId;
private String userName;
private Integer mobleNo;
private String gender;

}
