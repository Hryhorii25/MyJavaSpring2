import org.springframework.stereotype.Component;

@Component
public class FMStantion implements Radio {
    @Override
    public void listenmusic() {
        System.out.println("cool music");

    }
}
