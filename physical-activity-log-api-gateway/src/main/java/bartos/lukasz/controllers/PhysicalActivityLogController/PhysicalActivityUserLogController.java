package bartos.lukasz.controllers.PhysicalActivityLogController;

import bartos.lukasz.dto.UserDto;
import bartos.lukasz.proxy.physicalActivityLogServiceProxy.FindUserProxy;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/find")
@RequiredArgsConstructor
public class PhysicalActivityUserLogController {

    private final FindUserProxy findUserProxy;

    @GetMapping("/user/get")
    @CircuitBreaker(name = "base-instance", fallbackMethod = "getAllFallback")
    public UserDto get() {
        log.info("jestem w get w user controller w gateway");
        return findUserProxy.get();
    }

    @PostMapping("/user/post")
    public UserDto post(@RequestBody UserDto person) {
        log.info("jestem w post w gateway");
        return person;
    }

    private UserDto getAllFallback(Exception e) {
        log.error(e.getClass().getName());
        log.error(e.getMessage());
        return UserDto
                .builder()
                .username("FALLBACK_NAME")
                .age(999)
                .build();
    }
}
