/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Hospital;

import Business.Hospital.PatientDirectory;
import Business.Organization.Organization;
import Business.Role.HospitalRepRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaLakhmani
 */
public class HospitalRepOrganization extends Organization{
    
    private PatientDirectory patientDirectory;

    public HospitalRepOrganization() {
        super(Type.OrganTransaplantDeptRep.getValue());
        patientDirectory = new PatientDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalRepRole());
        return roles;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    } 
}
