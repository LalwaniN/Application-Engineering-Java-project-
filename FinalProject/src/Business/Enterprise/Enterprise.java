/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author ApoorvaLakhmani
 */
public abstract class Enterprise extends Organization{
    private int enterpriseID;
    private static int counter;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        DonorRegCenter("Registration Center"),
        OrganProcAndTransCenter("Organ Procurement And Transplantation"),
        LegalEnterprise("Legal Enterprise");
        
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        private EnterpriseType(String value){
            this.value = value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type; 
        organizationDirectory = new OrganizationDirectory();
        counter++;
        enterpriseID = counter;
    }

    public int getEnterpriseID() {
        return enterpriseID;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
    
}
