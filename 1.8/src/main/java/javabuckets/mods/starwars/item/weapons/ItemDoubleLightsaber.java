package javabuckets.mods.starwars.item.weapons;

import java.util.Random;

import javabuckets.mods.starwars.init.ModEnums;
import javabuckets.mods.starwars.main.StarWars;
import javabuckets.mods.starwars.utility.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDoubleLightsaber extends ItemSword
{
	public ItemDoubleLightsaber()
	{
		super(ModEnums.enumToolMaterialDoubleLightsaber);
		this.setCreativeTab(StarWars.swTab);
	}
	
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
		EntityPlayer player = (EntityPlayer)par3Entity;
		
		if (!par1ItemStack.hasTagCompound())
		{
			par1ItemStack.setTagCompound(new NBTTagCompound());
		}
	}
	
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		if (stack.hasTagCompound() && stack.getTagCompound().getBoolean("active"))
		{
        	entityLiving.worldObj.playSound(entityLiving.posX, entityLiving.posY, entityLiving.posZ, Reference.MOD_ID + ":" + "lightsaber_swing", 1.0F, 1.0F, true);
		}
		return super.onEntitySwing(entityLiving, stack);
	}
	
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLivingBase par7EntityLivingBase)
    {
        return true;
    }
	
	public String getItemDisplayName(ItemStack par1ItemStack)
	{
		String s = super.getItemStackDisplayName(par1ItemStack);
		return par1ItemStack.getItemDamage() == 0 ? s : "Broken " + s;
	}
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
		ItemStack itemstack = par2EntityLivingBase.getHeldItem();
		
		if (itemstack != null && itemstack.getItem() instanceof ItemLightsaber)
		{
			if (new Random().nextInt(100) == 0 && itemstack.hasTagCompound() && itemstack.getItemDamage() == 0)
			{
				itemstack.getTagCompound().setBoolean("active", false);
				itemstack.damageItem(1, par2EntityLivingBase);
				//par2EntityLivingBase.playSound(, 1.0F, 1.0F);
			}
		}
		return true;
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par1ItemStack.hasTagCompound() && par1ItemStack.getItemDamage() == 0)
		{
			par1ItemStack.getTagCompound().setBoolean("active", !par1ItemStack.getTagCompound().getBoolean("active"));
			par3EntityPlayer.playSound(par1ItemStack.getTagCompound().getBoolean("active") ? Reference.MOD_ID + ":" + "lightsaber_on" : Reference.MOD_ID + ":" + "lightsaber_off", 1.0F, 1.0F);
		}
		return par1ItemStack;
	}
	
	public boolean onLeftClickEntity(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, Entity par3Entity)
    {
    	if (par1ItemStack.hasTagCompound())
    	{
    		return !par1ItemStack.getTagCompound().getBoolean("active") && par1ItemStack.getItemDamage() == 0;
    	}
    	else
    	{
        	return true;
    	}
    }
	
	/*public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return StarWarsObjectLoader.lightsaberParts.itemID == par2ItemStack.itemID && par2ItemStack.getItemDamage() == 1 ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }*/
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
}