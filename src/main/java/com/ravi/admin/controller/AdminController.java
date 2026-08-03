package com.ravi.admin.controller;
import com.ravi.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @Autowired private AdminService adminService;
    
    private void addCommonData(Model model){
        model.addAttribute("stats", adminService.getStats());
        model.addAttribute("users", adminService.getRecentUsers());
        model.addAttribute("orders", adminService.getRecentOrders());
        model.addAttribute("productList", adminService.getProductList());
    }

    @GetMapping({"/","/admin","/dashboard"})
    public String dashboard(Model model){
        addCommonData(model);
        model.addAttribute("activePage", "dashboard");
        return "dashboard";
    }
    @GetMapping("/users")
    public String users(Model model){ 
        addCommonData(model);
        model.addAttribute("activePage", "users"); 
        return "dashboard"; 
    }
    @GetMapping("/products")
    public String products(Model model){ 
        addCommonData(model);
        model.addAttribute("activePage", "products"); 
        return "dashboard"; 
    }
    @GetMapping("/orders")
    public String orders(Model model){ 
        addCommonData(model);
        model.addAttribute("activePage", "orders"); 
        return "dashboard"; 
    }
    @GetMapping("/analytics")
    public String analytics(Model model){ 
        addCommonData(model);
        model.addAttribute("activePage", "analytics"); 
        return "dashboard"; 
    }
    @GetMapping("/settings")
    public String settings(Model model){ 
        addCommonData(model);
        model.addAttribute("activePage", "settings"); 
        return "dashboard"; 
    }
}