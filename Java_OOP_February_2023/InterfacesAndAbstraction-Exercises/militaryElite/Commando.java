package militaryElite;

import java.util.Collection;

public interface Commando {
    void completeMission();
    void addMission(Mission mission);
    Collection<Mission> getMissions();
}
