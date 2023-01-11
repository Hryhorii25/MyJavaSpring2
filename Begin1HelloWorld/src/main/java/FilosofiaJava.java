import org.springframework.stereotype.Component;

//Дана анотація помічає клас як компонент і при виконанні програми spring буде працювати з даним класом неявно створюючи обєкт даного класу
@Component
public class FilosofiaJava implements  Book {
    @Override
    public void read() {
        System.out.println("read");
        }
}
