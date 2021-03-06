package cc.hyperium.event.network.server.hypixel;

import cc.hyperium.event.Event;

public class SkyblockTradeRequestEvent extends Event {

  private final String username;

  public SkyblockTradeRequestEvent(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }
}
