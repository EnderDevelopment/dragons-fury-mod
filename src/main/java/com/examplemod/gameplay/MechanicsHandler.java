package com.examplemod.gameplay;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.level.BlockEvent;

public class MechanicsHandler {
    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.RightClickBlock event) {
        // Custom interaction logic
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        // Custom block breaking logic
    }
}