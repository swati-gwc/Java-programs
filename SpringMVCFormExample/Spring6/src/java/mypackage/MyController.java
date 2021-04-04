package mypackage;

/**
 *
 * @author swati
 */
import secondpackage.MyClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("myclass")
public class MyController {
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String  login(ModelMap mm)
    {
        mm.put("myclass", new MyClass());
        return "login";
    }
    
    
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String  login(@ModelAttribute(value="myclass") MyClass myclass, ModelMap mm)
    {
        
        if(myclass.getUsername().equals("swati") && myclass.getPassword().equals("swati")){
            mm.put("username", myclass.getUsername());
            return "success";
        }
        else{
            mm.put("message", "Username or Password is invalid! Please fill correct one!");
            return "login";
        }
    }
    
    
}
