package sample;

public class USER {
    String name;
    String loginpass;
    String age;
    String dateOfCeation;
    String Email;

    void setuser(String name, String loginpass, String age, String dateOfCeation, String email, String occupation){
        this.name = name;
        this.loginpass = loginpass;
        this.age = age;
        this.dateOfCeation = dateOfCeation;
        Email = email;
        Occupation = occupation;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDateOfCeation() {
        return dateOfCeation;
    }

    public void setDateOfCeation(String dateOfCeation) {
        this.dateOfCeation = dateOfCeation;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    String Occupation;
    String Company;

}
