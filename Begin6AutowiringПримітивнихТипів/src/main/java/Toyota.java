import org.springframework.stereotype.Component;

@Component
class Toyota implements Car {
    String name;
    Radio radio;

 public Toyota() {
  }

//    public Toyota(Radio radio) {
//     this.radio =radio;
//    }
//
//    public Toyota(String name) {
//        this.name = name;
//    }

    public Toyota(Radio radio, String s) {
     this.radio= radio;
     this.name = s;

    }


    @Override
   public void drive() {
       System.out.println("drive "+ name);
       radio.listenmusic();
   }

    public void setRadio(String Radio) {
    }
}
