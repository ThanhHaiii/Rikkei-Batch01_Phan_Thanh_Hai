package rtep_k1.com.project.controllers;

import model.KhachHang;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.ManageService;
import service.ManageServiceImp;

@Controller
public class CusController {
    private ManageService manage = new ManageServiceImp();

    @GetMapping("/custom")
    public String index(Model model, RedirectAttributes redirec)
    {
        model.addAttribute("khang",manage.findAll());
        redirec.addFlashAttribute("success","");
        return "custom";
    }
    @GetMapping("/create")
    public String create(Model model)
    {
        model.addAttribute("kh",new KhachHang());
        return "create";
    }
}
