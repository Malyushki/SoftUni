package militaryElite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral, Private {
    List<PrivateImpl> privateList;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, List<PrivateImpl> privateList) {
        super(id, firstName, lastName, salary);

        this.privateList = privateList;
    }


    @Override
    public List<PrivateImpl> getPrivateList() {
        return privateList;
    }

    @Override
    public void addPrivate(PrivateImpl priv) {
        privateList.add(priv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(), getLastName(), getId(), getSalary()))
                .append(System.lineSeparator()).append("Privates:").append(System.lineSeparator());

        //method for sorting list of privates
        privateList.sort(Comparator.comparingInt(PrivateImpl::getId).reversed());


        for (Private pr : privateList) {
            sb.append(pr.toString()).append(System.lineSeparator());
        }


        return sb.toString().trim();
    }
}


