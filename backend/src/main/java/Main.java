import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {

    public void print(String message){
        System.out.println(message);
    }

    void main(String... args){
        Quarkus.run();
        print("Hello, World!");
        print("Using Java version: " + System.getProperty("java.version"));
    }
}
