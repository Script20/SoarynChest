package com.soaryn.chest.client;

import com.soaryn.chest.config.SoarynChestConfig;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.CycleButton;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;

public class SoarynChestConfigScreen extends Screen {
    private final Screen parent;
    private boolean includeHotbar;

    public SoarynChestConfigScreen(Screen parent) {
        super(Component.literal("Soaryn Chest Config"));
        this.parent = parent;
        this.includeHotbar = SoarynChestConfig.INCLUDE_HOTBAR.get();
    }

    @Override
    protected void init() {
        int centerX = this.width / 2;
        int centerY = this.height / 2;

        this.addRenderableWidget(CycleButton.onOffBuilder(this.includeHotbar)
                .create(centerX - 100, centerY - 24, 200, 20,
                        Component.literal("Include Hotbar"),
                        (button, value) -> this.includeHotbar = value));

        this.addRenderableWidget(Button.builder(CommonComponents.GUI_DONE, button -> this.onDone())
                .bounds(centerX - 100, centerY + 24, 200, 20)
                .build());
    }

    private void onDone() {
        SoarynChestConfig.INCLUDE_HOTBAR.set(this.includeHotbar);
        this.minecraft.setScreen(this.parent);
    }

    @Override
    public void onClose() {
        this.minecraft.setScreen(this.parent);
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        super.render(graphics, mouseX, mouseY, partialTick);
        graphics.drawCenteredString(this.font, this.title, this.width / 2, 20, 0xFFFFFF);
    }
}
