import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component
public class Toyota2 implements Car {
    @Override
    public void drive() {
        System.out.println("drive Toyota2");

    }
}
