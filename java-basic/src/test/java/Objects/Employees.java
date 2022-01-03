package Objects;

public class Employees {
    int EmployeeID;
    String LastName;
    String FirstName;
    String BirthDate;
    String Photo;
    String Notes;


    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    @Override
    public String toString() {
        return "EmployeeID: " + this.EmployeeID + ", LastName: " + this.LastName + " , FirstName: " + this.FirstName + ", BirthDate: " + this.BirthDate + ", Photo: " + this.Photo + ", Notes: " + this.Notes;
    }
}
