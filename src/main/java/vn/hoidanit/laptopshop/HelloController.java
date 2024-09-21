package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World from spring boot! hihi";
    }

    @GetMapping("/user")
    public String userPage() {
        return "only user can access this";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "only admin can access this";
    }

}
