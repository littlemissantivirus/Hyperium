package cc.hyperium.handlers.handlers.chat;

import cc.hyperium.event.EventBus;
import cc.hyperium.event.network.server.hypixel.SkyblockTradeRequestEvent;
import net.minecraft.util.IChatComponent;

import java.util.Locale;
import java.util.regex.Matcher;

public class SkyblockTradeRequestHandler extends HyperiumChatHandler {

  /**
   * @param component Entire component from event
   * @param text      Pure text for parsing
   * @return boolean to cancel event
   */
  @Override
  public boolean chatReceived(IChatComponent component, String text) {
    if (!text.toLowerCase(Locale.ENGLISH).contains("sent you a trade request.")) {
      return false;
    }
    Matcher matcher = regexPatterns.get(ChatRegexType.SKYBLOCK_TRADE_REQUEST).matcher(text);

    if (matcher.find()) {
      EventBus.INSTANCE.post(new SkyblockTradeRequestEvent(matcher.group("player")));
    }

    return false;
  }
}
