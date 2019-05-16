/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author JomyChen
 */
public class case_hearing {
    private Integer id;
    private String case_id;
    private String fixed_date;
    private Integer court_room;
    private String judge;
    private String pet_lawyer;
    private String def_lawyer;
    private String details;
    private String hearing_status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public String getFixed_date() {
        return fixed_date;
    }

    public void setFixed_date(String fixed_date) {
        this.fixed_date = fixed_date;
    }

    public Integer getCourt_room() {
        return court_room;
    }

    public void setCourt_room(Integer court_room) {
        this.court_room = court_room;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public String getPet_lawyer() {
        return pet_lawyer;
    }

    public void setPet_lawyer(String pet_lawyer) {
        this.pet_lawyer = pet_lawyer;
    }

    public String getDef_lawyer() {
        return def_lawyer;
    }

    public void setDef_lawyer(String def_lawyer) {
        this.def_lawyer = def_lawyer;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getHearing_status() {
        return hearing_status;
    }

    public void setHearing_status(String hearing_status) {
        this.hearing_status = hearing_status;
    }
}
