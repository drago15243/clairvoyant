/*
 * This file is part of Clairvoyant
 * Copyright (C) 2020, Chriss.
 *
 * This code is licensed under GNU General Public License v3.0, the full license text can be found in LICENSE
 */

package io.github.clairvoyant.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.DyeColor;

public class TimewornBrickSlab extends SlabBlock {
    public TimewornBrickSlab() {
        super(FabricBlockSettings.copyOf(Blocks.BRICKS).materialColor(DyeColor.GRAY));
    }
}
