import com.zspc.core.spring.ext.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhuansunpengcheng
 * @create 2019-07-10 2:48 PM
 **/
public class ExtTest {


    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        applicationContext.close();

    }


}
