package militaryElite;

public class SpecialisedSoldierImpl extends PrivateImpl {
    Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary , String corps) {
        super(id, firstName, lastName, salary);
        this.corps = Corps.valueOf(corps);
    }


}
