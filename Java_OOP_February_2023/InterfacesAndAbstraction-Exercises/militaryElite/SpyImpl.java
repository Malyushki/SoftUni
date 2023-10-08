package militaryElite;

public class SpyImpl extends SoldierImpl{
    String codeNumber;

    public SpyImpl(int id, String firstName, String lastName,String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d",getFirstName(),getLastName(),getId()))
                .append(System.lineSeparator())
                .append(String.format("Code Number: %s",this.codeNumber));

        return sb.toString().trim();
    }
}
