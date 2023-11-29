package tr.gov.gib.sf103lombok.dao.model;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String SSI;
    private String firstName;
    private String lastName;
}
