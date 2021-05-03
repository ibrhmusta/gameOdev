package com.company.Interfaces;

import com.company.Entities.Campaign;
import com.company.Entities.Customer;
import com.company.Entities.Game;
import com.company.Entities.Sale;

public interface SaleService {

    void add(Sale sale, Game game, Customer customer, Campaign campaign);
    void delete(Sale sale);
    void update(Sale sale);
    void getAll(Sale[] sales);
}
