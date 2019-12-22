package com.demo.repository;


import com.demo.jooq.generated.tables.Bids;
import com.demo.jooq.generated.tables.Projects;
import com.demo.model.BidsDTO;
import com.demo.model.ProjectsDTO;
import edu.emory.mathcs.backport.java.util.Collections;
import org.jooq.DSLContext;
import org.jooq.exception.NoDataFoundException;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class MarketAppRepository {

    @Autowired
    private DSLContext dsl;

    public List<ProjectsDTO> fetchAllProjects() {

        try {
            return DSL.using(dsl.configuration())
                    .select(Projects.PROJECTS.ID, Projects.PROJECTS.STATUS, Projects.PROJECTS.DESCRIPTION, Projects.PROJECTS.END_DATE, Projects.PROJECTS.MAX_BUDGET, Bids.BIDS.BID_PRICE.min().as(Projects.PROJECTS.LOWEST_BID)
                    ).from(Projects.PROJECTS.leftJoin(Bids.BIDS).on(Projects.PROJECTS.ID.eq(Bids.BIDS.PROJECT_ID)))
                    .where(Projects.PROJECTS.STATUS.eq("ACTIVE"))
                    .groupBy(Projects.PROJECTS.ID)
                    .fetch()
                    .into(com.demo.model.ProjectsDTO.class);

        } catch (NoDataFoundException e) {
            return Collections.emptyList();
        }
    }

    public ProjectsDTO fetchProjectByID(int id) {
        try {
            return DSL.using(dsl.configuration())
                    .select(Projects.PROJECTS.ID, Projects.PROJECTS.STATUS, Projects.PROJECTS.DESCRIPTION, Projects.PROJECTS.END_DATE, Projects.PROJECTS.MAX_BUDGET, Bids.BIDS.BID_PRICE.min().as(Projects.PROJECTS.LOWEST_BID)
                    ).from(Projects.PROJECTS.leftJoin(Bids.BIDS).on(Projects.PROJECTS.ID.eq(Bids.BIDS.PROJECT_ID)))
                    .where(Projects.PROJECTS.ID.eq(id))
                    .groupBy(Projects.PROJECTS.ID)
                    .fetchSingle()
                    .into(com.demo.model.ProjectsDTO.class);

        } catch (NoDataFoundException e) {
            return null;
        }
    }

    public ProjectsDTO saveProject(ProjectsDTO data) {

        return DSL.using(dsl.configuration())
                .insertInto(Projects.PROJECTS, Projects.PROJECTS.STATUS, Projects.PROJECTS.DESCRIPTION, Projects.PROJECTS.END_DATE, Projects.PROJECTS.MAX_BUDGET, Projects.PROJECTS.LOWEST_BID)
                .values(data.getStatus(), data.getDescription(), data.getEnd_date(), data.getMax_budget(), data.getLowest_bid())
                .returning().fetchOne().into(ProjectsDTO.class);

    }


    public BidsDTO processBid(BidsDTO requestBid) {

        BidsDTO result = DSL.using(dsl.configuration()).
                insertInto(Bids.BIDS, Bids.BIDS.PROJECT_ID, Bids.BIDS.USERNAME, Bids.BIDS.BID_PRICE)
                .values(requestBid.getProject_id(), requestBid.getUsername(), requestBid.getBid_price())
                .returning().fetchOne().into(BidsDTO.class);

        return result;

    }
}
