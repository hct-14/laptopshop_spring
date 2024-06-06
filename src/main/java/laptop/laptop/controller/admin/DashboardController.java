package laptop.laptop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/admin")
    public  String getdashboard(){
        return "dashboard/index";
    }
}
