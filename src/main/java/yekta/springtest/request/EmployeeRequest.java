package yekta.springtest.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeRequest {

    private String name;

//    private String department;    //OneToOne

    private List<String> department;    // OneToMany
}
