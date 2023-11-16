import java.io.IOException;

public class HR {
    public static void main(String[] args) throws IOException {
        Staff newEmploy = new Staff();
        newEmploy.inputData1();
        newEmploy.print1();
        newEmploy.inputData();
        newEmploy.print();
        Person newPerson = new Person();
        newPerson.inputData();
        newPerson.print();
    }
}
