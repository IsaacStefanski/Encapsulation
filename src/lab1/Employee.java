package lab1;

import java.util.Date;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a 
 * constructor to enforce that. Review the tips in the document 
 * "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;    
    private String cubeId;
    private Date orientationDate;
    //A new employee would not have gone to orientation yet, so the associated booleans would default to false
    private boolean metWithHr = false;
    private boolean metDeptStaff = false;
    private boolean reviewedDeptPolicies = false;
    private boolean movedIn = false;
    
    //Constructor
    public Employee(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    //Setters
    public void setFirstName(String firstName) {
        if(!firstName.isEmpty()){
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if(!lastName.isEmpty()){
            this.lastName = lastName;
        }
    }

    public void setSsn(String ssn) {
        if(!ssn.isEmpty() && ssn.length()==11){
            this.ssn = ssn;
        } else{
            throw new IllegalArgumentException("SSN should be nine digits separated by dashes (XXX-XX-XXXX)");
        }
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public void setOrientationDate(Date orientationDate) {
        this.orientationDate = orientationDate;
    }
}