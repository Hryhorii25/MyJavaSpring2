import org.springframework.stereotype.Component;

@Component

public class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("drive Toyota");
   }
}
