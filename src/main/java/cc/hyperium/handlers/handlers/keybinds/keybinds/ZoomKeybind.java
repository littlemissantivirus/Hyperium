/*
 *       Copyright (C) 2018-present Hyperium <https://hyperium.cc/>
 *
 *       This program is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published
 *       by the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       This program is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.hyperium.handlers.handlers.keybinds.keybinds;

import cc.hyperium.handlers.handlers.keybinds.HyperiumKeybind;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class ZoomKeybind extends HyperiumKeybind {
  public ZoomKeybind() {
    super("Zoom", Keyboard.KEY_C, KeyType.UTIL);
  }

  @Override
  public void onPress() {
    Minecraft.getMinecraft().gameSettings.fovSetting -= 50f;
    Minecraft.getMinecraft().entityRenderer.renderHand = false;
    Minecraft.getMinecraft().gameSettings.smoothCamera = true;
  }

  @Override
  public void onRelease() {
    Minecraft.getMinecraft().gameSettings.fovSetting += 50f;
    Minecraft.getMinecraft().entityRenderer.renderHand = true;
    Minecraft.getMinecraft().gameSettings.smoothCamera = false;
  }
}
