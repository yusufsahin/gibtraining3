package tr.gov.gib.sf701contactapi.dao.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}