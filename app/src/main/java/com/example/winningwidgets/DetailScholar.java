package com.example.winningwidgets;

public class DetailScholar {
    public String title,organisations,eligibility,stream,grades,application,description,website;
    public DetailScholar(){

    }
    public DetailScholar(String title,String organisations,String eligibility,String stream,String grades,String description,String website,String application ){
        this.title=title;
        this.organisations=organisations;
        this.eligibility=eligibility;
        this.stream=stream;
        this.grades=grades;
        this.description=description;
        this.website=website;
        this.application=application;
    }
    public String getOrganisations(){return organisations;}
    public String getEligibility(){return eligibility;}
    public String getStream(){return stream;}
    public String getGrades(){return grades;}
    public String getDescription(){return description;}
    public String getWebsite(){return website;}
    public String getApplication(){return application;}
}
