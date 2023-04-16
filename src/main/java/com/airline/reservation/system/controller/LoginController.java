package com.airline.reservation.system.controller;


import com.airline.reservation.system.dto.AccountDTO;
import com.airline.reservation.system.dto.UserDTO;
import com.airline.reservation.system.service.interfaces.AbstractAccountService;
import com.airline.reservation.system.service.interfaces.AbstractUserService;
import lombok.Getter;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;

@Scope(WebApplicationContext.SCOPE_SESSION)
@Component(value = "loginController")
@ELBeanName(value = "loginController")
@Join(path = "/login", to = "/login.xhtml")
@Getter
public class LoginController {

    private final AbstractAccountService accountService;

    private final AbstractUserService userService;

    private AccountDTO accountDTO = new AccountDTO();

    private UserDTO userDTO= new UserDTO();

    @Autowired
    public LoginController(AbstractAccountService accountService, AbstractUserService userService) {
        this.accountService = accountService;
        this.userService = userService;
    }

    public String saveNewUser() {
        accountDTO.setCreated_on(LocalDateTime.now());
        userDTO.setAccountDTO(accountDTO);
        try {
            userService.create(userDTO);
            userDTO = new UserDTO();
            accountDTO = new AccountDTO();
        } catch (Exception e) {
            System.out.println("Error!");
        }
        System.out.println("Save done!");
        return "/main.xhtml?faces-redirect=true";
    }
}
