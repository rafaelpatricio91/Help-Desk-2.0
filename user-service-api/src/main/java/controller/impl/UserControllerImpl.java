package controller.impl;


import br.com.rafa.userserviceapi.entity.User;
import br.com.rafa.userserviceapi.service.UserService;
import controller.UserController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserService userService;

   @GetMapping
   public ResponseEntity<User> findById(@PathVariable("id") final String id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public List<User> findAll() {
        return userService.findAll();
    }
}
