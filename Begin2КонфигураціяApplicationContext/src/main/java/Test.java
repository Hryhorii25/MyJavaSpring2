import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		///Даний блок  коду дає доступ до створених спрінгом  бінів

		//Створення контейнера
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

		 //Створення біна в контейнері і звязування з обєктом класу
		  FilosofiaJava  bean = context.getBean(FilosofiaJava.class);
		  bean.read();//Виклик методу біна
          ///
	}
}
