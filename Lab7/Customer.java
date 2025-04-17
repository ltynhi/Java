public class Customer {
    private String name;
    private MembershipType membership;
    public enum MembershipType {
        NONE, SILVER, GOLD, PREMIUM
    }
    public Customer(String name, MembershipType membership) {
        this.name = name;
        this.membership = membership;
    }
    public String getName() {
        return name;
    }
    public MembershipType getMembership() {
        return membership;
    }
    public void setMembership(MembershipType membership) {
        this.membership = membership;
    }
}
