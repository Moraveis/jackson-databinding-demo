package demo;

import java.util.List;

public class Student {

    private Integer id;
    private String firstName;
    private String lastName;
    private boolean active;
    private Address address;
    private List languages;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List getLanguages() {
        return languages;
    }

    public void setLanguages(List languages) {
        this.languages = languages;
    }
}
