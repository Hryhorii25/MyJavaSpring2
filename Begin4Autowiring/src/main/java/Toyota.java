import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car {
    //@Autowired
    //Дана анотація інжектає помічений бін в інший бін
    //Є три види застосування даної анотації
    //1)Через філди
    //@Autowired
    //Radio radio;

    //2) Через коструктор
    //@Autowired
//    public Toyota(Radio radio){
//        this.radio = radio;
//    }

//   // 3)Череез сетер
//    @Autowired
//    public void putRadioCar(Radio radio){
//        this.radio = radio;
//    }

    @Autowired
Radio radio;

    public Toyota(){}
    @Override
    public void drive() {
        radio.listenmusic();
       System.out.println("drive");





   }
}
