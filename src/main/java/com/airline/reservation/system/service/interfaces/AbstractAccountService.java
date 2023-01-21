package com.airline.reservation.system.service.interfaces;

import com.airline.reservation.system.dto.AccountDTO;
import com.airline.reservation.system.persistence.entity.Account;
import com.airline.reservation.system.service.AbstractCrudService;

public interface AbstractAccountService extends AbstractCrudService<Account, AccountDTO> {

}
