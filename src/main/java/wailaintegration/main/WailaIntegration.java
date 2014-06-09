package wailaintegration.main;

import wailaintegration.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "WailaIntegration", name = "WailaIntegration", version = "1.0" ,dependencies = "required-after:Waila")
public class WailaIntegration {
    @SidedProxy(clientSide = "wailaintegration.proxies.ClientProxy", serverSide = "wailaintegration.proxies.CommonProxy")
    public static CommonProxy proxy;
 
    @Instance("WailaIntegration")
    public static WailaIntegration instance;
    public static double version = 1.00;
    public static String modName = "WailaIntegration";
    public static String alias = "WailaI";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
		proxy.load();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
        FMLInterModComms.sendMessage("Waila", "register", "wailaintegration.main.WailaRegister.callbackRegister");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent evt){}
}