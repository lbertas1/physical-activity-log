package bartos.lukasz.proxy.physicalActivityLogServiceProxy;

import bartos.lukasz.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(name = "physical-activity-log-service")
public interface FindUserProxy {

    @GetMapping("/find/user/get")
    UserDto get();

    @GetMapping("/find/username/{username}")
    UserDto findByUsername(@PathVariable("username") String username);

    @PostMapping("/find/print")
    UserDto printUser(UserDto userDto);
}
