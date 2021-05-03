package com.company.Interfaces;

import com.company.Entities.Campaign;

public interface CampaignService {

    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
    void getAll(Campaign[] campaigns);

}
