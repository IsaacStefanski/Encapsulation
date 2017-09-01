/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Isaac
 */
public class HumanResources {
    //HR keeps a list of the employees
    private ArrayList<Employee> employees;
    
    public HumanResources(){
        employees = new ArrayList();
    }
    
    //hire an employee
    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName, lastName, ssn);
        employees.add(e);
        employeeOrientation(e);
    }
    
    //run orientation
    public void employeeOrientation(Employee e) {
        e.doFirstTimeOrientation("A101");
    }
    
    //reporting
    public void outputReport(String ssn) {
        Employee e = null;
        
        for(int i=0; i<employees.size(); i++){
            if(employees.get(i).getSsn().equals(ssn)){
                e = employees.get(i);
                break;
            }
        }

        if(e.isMetWithHr() && e.isMetDeptStaff()
           && e.isReviewedDeptPolicies() && e.isMovedIn()) {            
            e.getReportService().outputReport();            
        }
    }
}
