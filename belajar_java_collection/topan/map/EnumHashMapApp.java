package topan.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {

  public static enum Skin {
    ELITE, SPECIAL, STARLIGHT, COLLABORATION, EPIC, STARLIGHT_YEAR, EPIC_COLLABORATION, COLLECTOR, EPIC_EVENT, LEGEND
  }

  public static enum Tier {
    WARRIOR, ELITE, MASTER, GRANDMASTER, EPIC, LEGEND, MYTHIC, MYTHICAL_HONOR, MYTHICAL_GLORY, MYTHICAL_IMMORTAL
  }

  public static void main(String[] args) {
    Map<Skin, String> map = new EnumMap<>(Skin.class);

    map.put(Skin.EPIC, "Onimaru");

    for (var key : map.keySet()) {
      System.out.println(map.get(key));
    }
  }
}
