package militaryElite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SoldierImpl> soldierList = new ArrayList<>();
        String input = scanner.nextLine();
        List<PrivateImpl> privateList = new ArrayList<>();

        while (!input.equals("End")) {
            List<String> inputParts = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());

            String switchBy = inputParts.get(0);
            int id = Integer.parseInt(inputParts.get(1));
            String firstName = inputParts.get(2);
            String lastName = inputParts.get(3);
            switch (switchBy) {
                case "Private":
                    double salary = Double.parseDouble(inputParts.get(4));
                    soldierList.add(new PrivateImpl(id, firstName, lastName, salary));
                    privateList.add(new PrivateImpl(id, firstName, lastName, salary));

                    break;
                case "LieutenantGeneral":
                    double salaryLieutenantGeneral = Double.parseDouble(inputParts.get(4));
                    List<PrivateImpl> privateToAddList = getPrivateList(privateList, inputParts);

                    soldierList.add(new LieutenantGeneralImpl(id, firstName, lastName, salaryLieutenantGeneral, privateToAddList));


                    break;
                case "Engineer":
                    double salaryEngineer = Double.parseDouble(inputParts.get(4));
                    String corpsEngineer = inputParts.get(5);
                    if (Arrays.stream(Corps.values()).anyMatch(corps -> corps.name().equals(corpsEngineer))) {
                        List<Repair> repairList = getRepairs(inputParts);
                        soldierList.add(new EngineerImpl(id, firstName, lastName, salaryEngineer, corpsEngineer, repairList));
                    }
                    break;
                case "Commando":
                    double salaryCommando = Double.parseDouble(inputParts.get(4));
                    String corpsCommando = inputParts.get(5);
                    if (Arrays.stream(Corps.values()).anyMatch(corps -> corps.name().equals(corpsCommando))) {
                        List<Mission> missionList = getMissions(inputParts);
                        soldierList.add(new CommandoImpl(id, firstName, lastName, salaryCommando, corpsCommando, missionList));
                    }
                    break;
                case "Spy":
                    String codeNumber = inputParts.get(4);
                    soldierList.add(new SpyImpl(id,firstName,lastName,codeNumber));
                    break;


            }


            input = scanner.nextLine();
        }

        for (Soldier s : soldierList) {
            System.out.println(s.toString());
        }
    }

    private static List<PrivateImpl> getPrivateList(List<PrivateImpl> privateList, List<String> inputParts) {
        List<String> privateIds = inputParts.subList(5, inputParts.size());
        List<PrivateImpl> privateToAddList = new ArrayList<>();

        if (!privateList.isEmpty()) {
            for (int i = 0; i < privateIds.size(); i++) {
                for (PrivateImpl pr : privateList) {
                    if (pr.getId() == Integer.parseInt(privateIds.get(i))) {
                        privateToAddList.add(pr);
                    }
                }
            }
        }
        return privateToAddList;
    }

    private static List<Mission> getMissions(List<String> inputParts) {
        List<String> missionsParts = inputParts.subList(6, inputParts.size());
        List<Mission> missionList = new ArrayList<>();
        while (!missionsParts.isEmpty()) {
            if (Arrays.stream(State.values()).anyMatch(state -> state.name().equals(missionsParts.get(1)))) {
                missionList.add(new Mission(missionsParts.get(0), missionsParts.get(1)));
            }
            missionsParts.remove(0);
            missionsParts.remove(0);
        }
        return missionList;
    }

    private static List<Repair> getRepairs(List<String> inputParts) {
        List<String> repairParts = inputParts.subList(6, inputParts.size());
        List<Repair> repairList = new ArrayList<>();
        while (!repairParts.isEmpty()) {
            repairList.add(new Repair(repairParts.get(0), Integer.parseInt(repairParts.get(1))));
            repairParts.remove(0);
            repairParts.remove(0);
        }
        return repairList;
    }
}
