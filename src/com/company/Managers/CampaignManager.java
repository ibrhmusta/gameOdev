package com.company.Managers;

import com.company.Entities.Campaign;
import com.company.Interfaces.CampaignService;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" kampanyası eklendi.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" kampanyası güncellendi.");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" kampanyası silindi.");

    }

    @Override
    public void getAll(Campaign[] campaigns) {
        for (Campaign campaign:campaigns){
            System.out.println(campaign.getCampaignName()+ "kampanyasının indirim oranı: "+campaign.getDiscount());
         }
    }
}
