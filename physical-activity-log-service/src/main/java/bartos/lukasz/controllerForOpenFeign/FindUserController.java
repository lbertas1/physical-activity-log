package bartos.lukasz.controllerForOpenFeign;

import bartos.lukasz.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/find")
@Slf4j
public class FindUserController {
    @GetMapping("/user/get")
    public User findById() {
        log.info();

        return User
                .builder()
                .id(1L)
                .username("lbertas1")
                .age(20)
                .build();
    }

    @GetMapping("/username/{username}")
    public User findByUsername(@PathVariable String username) {
        return User
                .builder()
                .id(1L)
                .username("lbertas2")
                .age(20)
                .build();
    }

    @PostMapping("/print")
    public User printUser(@RequestBody User user) {
        System.out.println("JEstem w metodzie w controllerze i w micro-service-2 " + user);
        log.info("JEstem w metodzie w controllerze i w micro-service-2 " + user);
        return user;
    }
}
