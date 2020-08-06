package minegame159.meteorclient.modules.movement;

import minegame159.meteorclient.modules.Category;
import minegame159.meteorclient.modules.ToggleModule;

public class SafeWalk extends ToggleModule {
    public SafeWalk() {
        super(Category.Movement, "safe-walk", "Stops you from walking off the edge of blocks.");
    }
}
