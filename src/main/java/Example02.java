import com.fasterxml.jackson.databind.ObjectMapper;
import demo.Student;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Example02 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        File jsonFile = new File(Example01.class.getResource("data/sample-full.json").toURI());
        Student student = mapper.readValue(jsonFile, Student.class);

        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Street: " + student.getAddress().getStreet());
        System.out.println("City: " + student.getAddress().getCity());
        System.out.println("Languages: " + student.getLanguages());

    }
}
