package proyectQuarry;


public class Person {
 
    public Person() {
        
    }
    public String Name ;
    public String Surname;
    public int ID;
    public char Gender;
    public int Age;
    public String Address;

    public Person(String Name, String Surname, int ID, char Gender, int Age, String Address) {
        this.Name = Name;
        this.Surname = Surname;
        this.ID = ID;
        this.Gender = Gender;
        this.Age = Age;
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Person{" + '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

}