public class Permanent implements Contract {
    private String contractID;
    private double rentAmount;
    private String tenantID;
    private String propertyID;

    public void buildContractID(String contractID) {
        this.contractID = contractID;
    }

    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public void buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public Contract signContract() {
        return this;
    }

    @Override
    public String toString() {
        return "Permanent [contractID=" + contractID + ", rentAmount=" + rentAmount + ", tenantID=" + tenantID
                + ", propertyID=" + propertyID + "]";
    }

}
