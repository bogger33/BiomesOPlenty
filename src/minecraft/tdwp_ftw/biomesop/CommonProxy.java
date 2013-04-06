package tdwp_ftw.biomesop;

import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CommonProxy {
	public static String ARMOR_MUD1_PNG = "/mods/BiomesOPlenty/textures/armor/mud_1.png";
	public static String ARMOR_MUD2_PNG = "/mods/BiomesOPlenty/textures/armor/mud_2.png";
	public static String ARMOR_AMETHYST1_PNG = "/mods/BiomesOPlenty/textures/armor/amethyst_1.png";
	public static String ARMOR_AMETHYST2_PNG = "/mods/BiomesOPlenty/textures/armor/amethyst_2.png";
    
    // Client stuff
    public void registerRenderers() {
            // Nothing here as the server doesn't render graphics!
    }
    
    public int addArmor(String armor)
    {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public void spawnMud(World world, double x, double y, double z, double xVel, double yVel, double zVel) 
    {

    }   
}