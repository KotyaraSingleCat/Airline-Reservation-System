package com.airline.reservation.system.controller.impl;

import com.airline.reservation.system.controller.AbstractControllerImpl;
import com.airline.reservation.system.dto.AccountDTO;
import com.airline.reservation.system.persistence.entity.Account;
import com.airline.reservation.system.service.impl.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController
        extends AbstractControllerImpl<Account, AccountDTO, AccountService> {

}
