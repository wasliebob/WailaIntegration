package wailaintegration.main;

import mcp.mobius.waila.api.IWailaRegistrar;
import wailaintegration.waila.FlaxbeardSteam.FlaxbeardSteam;
import cpw.mods.fml.common.Loader;

public class WailaRegister {
    public static void callbackRegister(IWailaRegistrar r){
    	if(Loader.isModLoaded("Steamcraft"))
    		FlaxbeardSteam.load(r);
    }
}