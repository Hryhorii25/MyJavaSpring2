import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//В даній програмі показано просту реалізацію роботи spring. Дана програма реалізована через декілька класів і інтерфейс. Де потрібно запустити певний код в контейнері
//Робота spring схожа до JAVAEE
public class Test {
	public static void main(String[] args) {
		///Даний блок  коду дає доступ до створених спрінгом  бінів

		//Створення контейнера
		ApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);

		 //Створення біна в контейнері і звязування з обєктом класу
		  Book  bean = context.getBean(Book.class);
		  bean.read();//Виклик методу біна
          ///
	}
}
