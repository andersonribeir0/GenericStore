package alis.store.domain.ValueObjects;

public class Email {
    private String Address;

    public Email(String Address) {
        this.Address = Address;
    }
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    @Override
    public String toString(){
        return Address;
    }
}
