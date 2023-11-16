import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    public String surname, firstname, street, zipCode, city;

//    Person(String surname, String firstname, String street, String zipCode, String city) {
//        this.surname=surname;
//        this.firstname=firstname;
//        this.street=street;
//        this.zipCode=zipCode;
//        this.city=city;
//    }
//    public String getSurname(){
//        return surname;
//    }
//    public String getFirstname(){
//        return firstname;
//    }
//    public String getStreet(){
//        return street;
//    }
//    public String getZipCode(){
//        return zipCode;
//    }
//    public String getCity(){
//        return city;
//    }
//    public void setSurname(String surname){
//        this.surname=surname;
//    }
//    public void setFirstname(String firstname){
//        this.firstname=firstname;
//    }
//    public void setStreet(String street){
//        this.street=street;
//    }
//    public void setZipCode(String zipCode){
//        this.zipCode=zipCode;
//    }
//    public void setCity(String city){
//        this.city=city;
//    }

    public void inputData()throws IOException{
        BufferedReader inputBr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your surname: " + surname);
        surname = inputBr.readLine();
        System.out.println("Input your firstname: " + firstname);
        firstname = inputBr.readLine();
        System.out.println("Input your street: " + street);
        street = inputBr.readLine();
        System.out.println("Input your zipCode: " + zipCode);
        zipCode = inputBr.readLine();
        System.out.println("Input your city: " + city);
        city = inputBr.readLine();
    }

//    public String print() {
//        String output = "Surname: " + this.surname + "\nFristname: " + this.firstname + "\nStreet: " + this.street +
//                "\nzipCode: " + this.zipCode + "\nCity: " + this.zipCode;
//        return output;
//    }
    public void print(){
        System.out.println("Surname: " + surname);
        System.out.println("Firstname: " + firstname);
        System.out.println("Street: " + street);
        System.out.println("zipCode: " + zipCode);
        System.out.println("City: " + city);
    }

}
