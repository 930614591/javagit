package homework.work1;

import java.util.Objects;

public class Customer {
    private  Long id;
    private String name;
    private String source;
    private  String industry;
    private String address;

    public Customer() {
    }

    public Customer(Long id, String name, String source, String industry, String address) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.industry = industry;
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getIndustry() {
        return industry;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getId().equals(customer.getId()) && getName().equals(customer.getName()) && getSource().equals(customer.getSource()) && getIndustry().equals(customer.getIndustry()) && getAddress().equals(customer.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSource(), getIndustry(), getAddress());
    }
}
