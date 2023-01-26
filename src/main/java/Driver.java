import com.fasterxml.jackson.databind.ObjectMapper;
import demo.Student;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Driver {

    public static void main(String[] args) throws URISyntaxException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        File jsonFile = new File(Driver.class.getResource("data/sample-lite.json").toURI());
        Student student = mapper.readValue(jsonFile, Student.class);

        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
    }
}
