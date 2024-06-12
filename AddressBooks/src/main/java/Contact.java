public class Contact {
    private String name;
    private String company;
    private String Email;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Contact(String name, String company, String email, String phone) {
        this.name = name;
        this.company = company;
        this.Email = email;
        this.phone = phone;
    }
    public String toString() {

        return "tên + name";
    }
}
   