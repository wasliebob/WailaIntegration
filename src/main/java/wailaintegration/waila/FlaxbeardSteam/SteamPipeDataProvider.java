package wailaintegration.waila.FlaxbeardSteam;

import java.util.List;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import net.minecraft.item.ItemStack;
import flaxbeard.steamcraft.tile.TileEntitySteamPipe;

public class SteamPipeDataProvider implements IWailaDataProvider{
	@Override
	public List<String> getWailaBody(ItemStack stack, List<String> tt, IWailaDataAccessor da, IWailaConfigHandler ch) {
		 if (da.getTileEntity() instanceof TileEntitySteamPipe){
			 TileEntitySteamPipe  te = (TileEntitySteamPipe) da.getTileEntity();
			 tt.add("Steam: " + te.getSteam() + "/" + te.getCapacity());
			 tt.add("Pressure: " + te.getPressure());
		 }
		 return tt;
	}

	@Override
	public List<String> getWailaHead(ItemStack stack, List<String> tt,
			IWailaDataAccessor da, IWailaConfigHandler cj) {
		return tt;
	}

	@Override
	public ItemStack getWailaStack(IWailaDataAccessor da,
			IWailaConfigHandler ch) {
		return null;
	}

	@Override
	public List<String> getWailaTail(ItemStack stack, List<String> tt,
			IWailaDataAccessor da, IWailaConfigHandler ch) {
		return tt;
	}
}