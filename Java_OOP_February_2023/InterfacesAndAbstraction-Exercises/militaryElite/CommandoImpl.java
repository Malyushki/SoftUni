package militaryElite;

import java.util.List;


public class CommandoImpl extends SpecialisedSoldierImpl{
    List<Mission> missionSet;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corps,  List<Mission> missionSet) {
        super(id, firstName, lastName, salary, corps);
        this.missionSet = missionSet;
    }

    @Override
    public String toString() {
        //"Name: {firstName} {lastName} Id: {id} Salary: {salary}
        //Corps: {corps}
        //Missions:
        //  {mission1 ToString()}
        //  {mission2 ToString()}
        //  …
        //  {missionN ToString()}"
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f%n", getFirstName(), getLastName(), getId(), getSalary())).append("Corps: ").append(this.corps).append(System.lineSeparator()).append("Missions:").append(System.lineSeparator());
        for (Mission mission:missionSet) {
            sb.append(mission).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
