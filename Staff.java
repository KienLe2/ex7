import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Staff extends Person{
    String education, position;
    public void inputData1()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputData();
        System.out.println("Input your education: " + education);
        education = br.readLine();
        System.out.println("Input your position: " + position);
        position = br.readLine();
    }
    public void print1(){
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}
