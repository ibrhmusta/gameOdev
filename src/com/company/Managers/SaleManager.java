package com.company.Managers;

import com.company.Entities.Campaign;
import com.company.Entities.Customer;
import com.company.Entities.Game;
import com.company.Entities.Sale;
import com.company.Interfaces.SaleService;

public class SaleManager implements SaleService {
    @Override
    public void add(Sale sale, Game game, Customer customer, Campaign campaign) {
        System.out.println(sale.getId()+"Numaralı işlem: "+game.getName()+" isimli oyun "+customer.getFullName()+ " kullanıcısına "+campaign.getCampaignName()+" kampanyası ile satıldı.");
    }

    @Override
    public void delete(Sale sale) {
        System.out.println(sale.getId()+"'Nolu satış silindi.");
    }

    @Override
    public void update(Sale sale) {
        System.out.println(sale.getId()+"'Nolu satış güncellendi.");
    }

    @Override
    public void getAll(Sale[] sales) {
        System.out.println("Kayıtlı kredi kartı bilgileri");
        for (Sale sale : sales) {
            System.out.println(sale.getId()+" No`lu kullanıcı:" +sale.getCreditCardNo());

        }
    }
}
