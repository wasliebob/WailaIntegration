package wailaintegration.waila.FlaxbeardSteam;

import mcp.mobius.waila.api.IWailaRegistrar;
import flaxbeard.steamcraft.block.BlockBoiler;
import flaxbeard.steamcraft.block.BlockPipe;
import flaxbeard.steamcraft.block.BlockSteamTank;

public class FlaxbeardSteam {
	public static void load(IWailaRegistrar r){
        r.registerBodyProvider(new SteamTankDataProvider(), BlockSteamTank.class);
        r.registerBodyProvider(new SteamBoilerDataProvider(), BlockBoiler.class);
        r.registerBodyProvider(new SteamPipeDataProvider(), BlockPipe.class);
	}
}