public interface Contract {
    void buildContractID(String contractID);
    void buildPropertyID(String propertyID);
    void buildTenantID(String tenantID);
    void buildRentAmount(double rentAmount);
    Contract signContract();
}
