import org.springframework.stereotype.Component;

@Component
class Toyota implements Car {
    Radio radio;

 public Toyota() {
  }

    public Toyota(Radio radio) {
     this.radio =radio;
    }

    @Override
   public void drive() {
       System.out.println("drive");
       radio.listenmusic();
   }

    public void setRadio(String Radio) {
    }
}
