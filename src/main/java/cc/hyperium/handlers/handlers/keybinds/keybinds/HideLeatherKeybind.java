package cc.hyperium.handlers.handlers.keybinds.keybinds;

import cc.hyperium.Hyperium;
import cc.hyperium.config.Settings;
import cc.hyperium.handlers.handlers.keybinds.HyperiumKeybind;
import cc.hyperium.utils.ChatColor;
import org.lwjgl.input.Keyboard;

public class HideLeatherKeybind extends HyperiumKeybind {

  public HideLeatherKeybind() {
    super("Toggle Leather Armor", Keyboard.KEY_NONE, KeyType.UTIL);
  }

  @Override
  public void onPress() {
    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler()
        .sendMessage(Settings.HIDE_LEATHER_ARMOR ?
            "Leather armor is now" + ChatColor.GREEN + " shown" + ChatColor.GRAY + "." :
            "Leather armor is now" + ChatColor.RED + " hidden" + ChatColor.GRAY + ".");
    Settings.HIDE_LEATHER_ARMOR = !Settings.HIDE_LEATHER_ARMOR;
  }
}
