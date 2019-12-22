package com.demo.service;

import com.demo.jooq.generated.tables.Bids;
import com.demo.model.BidsDTO;
import com.demo.repository.MarketAppRepository;
import com.demo.model.ProjectsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APIService {


    @Autowired
    private MarketAppRepository marketAppRepository;

    public List<ProjectsDTO> getProjectList() {
        return marketAppRepository.fetchAllProjects();
    }

    public ProjectsDTO getProjectByID(int id) {
        return marketAppRepository.fetchProjectByID(id);
    }

    public int createProject(ProjectsDTO request){
        return marketAppRepository.saveProject(request).getId();
    }

    public BidsDTO processBid(BidsDTO requestBid) {
        return marketAppRepository.processBid(requestBid);

    }




}
