package com.company;

import com.company.Entities.Campaign;
import com.company.Entities.Customer;
import com.company.Entities.Game;
import com.company.Entities.Sale;
import com.company.Managers.*;

public class Main {

    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setId(1);
        customer.setNationalIdentity("12345678910");
        customer.setFullName("İbrahim Usta");
        customer.setBirthdayDate("05.05.1999");


        CustomerManager customerManager=new CustomerManager(new Authorize());
        customerManager.login(customer);
        customerManager.update(customer);
        customerManager.delete(customer);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");


        Game game=new Game();
        game.setId(1);
        game.setName("Far Cry 5");
        game.setPrice(120);
        game.setDiscountPrice(0);


        Game[] games= {game};

        GameManager gameManager=new GameManager();
        gameManager.add(game);
        gameManager.getAll(games);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");

        Campaign campaign=new Campaign();
        campaign.setId(1);
        campaign.setCampaignName("3 al 2 öde");
        campaign.setDiscount(10.20);

        Campaign[] campaigns= {campaign};

        CampaignManager campaignManager=new CampaignManager();
        campaignManager.add(campaign);
        campaignManager.getAll(campaigns);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*");

        Sale sale=new Sale();
        sale.setId(1);
        sale.setCreditCardNo("1234567891011234");
        Sale[] sales= {sale};

        SaleManager saleManager=new SaleManager();
        saleManager.add(sale,game,customer,campaign);
        saleManager.getAll(sales);
    }
}
