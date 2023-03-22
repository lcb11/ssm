import com.lcb.pojo.Books;
import com.lcb.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 */
public class MyText {

    @Test
    public void  test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService=(BookService) context.getBean("BookServiceImpl");
        for(Books books:bookService.queryAllBook()){
            System.out.println(books);
        }
    }
}
