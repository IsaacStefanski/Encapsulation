/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Isaac
 */
public class Business {
    private HumanResources hr;    

    public Business() {
        hr = new HumanResources();
    }

    public HumanResources getHr() {
        return hr;
    }

    public void setHr(HumanResources hr) {
        this.hr = hr;
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }
}