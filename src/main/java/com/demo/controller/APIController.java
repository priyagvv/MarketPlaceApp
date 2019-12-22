package com.demo.controller;


import com.demo.model.BidsDTO;
import com.demo.model.ProjectsDTO;
import com.demo.service.APIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class APIController {

    @Autowired
    private APIService apiService;

    /**
     * @return List of Active Projects
     */
    @RequestMapping(path = "/projects", method = RequestMethod.GET, produces = {"application/json"})
    public List<ProjectsDTO> getProjects() {
        return apiService.getProjectList();
    }

    /**
     * Fetch project by id
     *
     * @return
     */
    @RequestMapping(path = "/project/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<ProjectsDTO> getProjectByID(@PathVariable int id){
        ProjectsDTO result = apiService.getProjectByID(id);
        if(result!=null ){
            return new ResponseEntity<ProjectsDTO>(result,HttpStatus.OK);
        }else {
            return  new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
}

    /**
     * Create Project
     * @return
     */
    @RequestMapping(path = "/createProject", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public int createProject(@RequestBody ProjectsDTO request) {
        return apiService.createProject(request);
    }

    /**
     * Create Bid
     * @param requestBid
     * @return
     */
    @RequestMapping(path = "/bid", method = RequestMethod.POST ,produces = { "application/json" })
    public ResponseEntity<BidsDTO> processBid(@RequestBody BidsDTO requestBid) {

        if(requestBid.getProject_id()  > 0  &&  apiService.getProjectByID(requestBid.getProject_id()) !=null ){
            return  new ResponseEntity<BidsDTO>(apiService.processBid(requestBid),HttpStatus.OK);
        }else
        {
            return  new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }

}
