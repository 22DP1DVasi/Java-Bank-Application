public class Student {
    private String name;
    private String lastname;
    private int pesoncode;
    private String email;


    // setters 
    public void SetName(String Newname) {
        this.name = Newname;
    }

    public void SetLastName(String Newlastname) {
        this.lastname = Newlastname;
    }

    public void SetPersonCode(int Newpersoncode) {
        this.pesoncode = Newpersoncode;
    }

    public void SetEmail(String Newemail) {
        this.email = Newemail;
    }

    // getters
    public String GetName() {
        return this.name;
    }

    public String GetLastName() {
        return this.lastname;
    }

    public int GetPersonCode() {
        return this.personcode;
    }

    public String GetEmail() {
        return this.email;
    }
}