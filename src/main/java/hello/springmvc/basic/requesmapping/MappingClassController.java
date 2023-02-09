package hello.springmvc.basic.requesmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping")
public class MappingClassController {


    @GetMapping("/users")
    public String user() {
        return "get users";
    }

    @PostMapping("/users")
    public String addUser() {
        return "post user";
    }

    @GetMapping("/users/{userId}")
    public String findUser(@PathVariable String userId) {
        return userId;
    }

    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return userId;
    }

    @PutMapping("/users/{userId}")
    public String updateUser(@PathVariable String userId) {
        return userId;
    }
}
