package militaryElite;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    List<Repair> partSet;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps, List<Repair> partSet) {
        super(id, firstName, lastName, salary, corps);
        this.partSet = partSet;
    }

    @Override
    public void addRepair(Repair repair) {
        partSet.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return partSet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f",getFirstName(),getLastName(),getId(),getSalary()))
                .append(System.lineSeparator()).append(String.format("Corps: %s",this.corps)).append(System.lineSeparator())
                .append("Repairs:").append(System.lineSeparator());

        for (Repair repair: this.partSet) {
            sb.append(repair.toString()).append(System.lineSeparator());
        }




        return sb.toString().trim();
    }
}
