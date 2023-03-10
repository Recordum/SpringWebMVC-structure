package hello.servlet.web.springMVC.old;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//hadlerAdpater => simpleControllerHandlerAdapter()
@Component("/springmvc/old-controller")
public class OldController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("oldController.handleRequest");
        System.out.println(request.getMethod());

        return new ModelAndView("new-form");
    }
}
