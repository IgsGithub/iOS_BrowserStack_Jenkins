package com.zee5.Applicaster.HIPI;

import org.openqa.selenium.By;

public class AMDLiveTVScreen {

	
	public static By objChannelGuide = By.xpath("//*[@resource-id='com.graymatrix.did:id/title' and @text='Channel Guide']");
	
	public static By onjLiveTvToggle = By.xpath("(//*[@text='Live TV'])[2]");
	
	public static By objTray(String trayName) {
		return By.xpath("//*[@resource-id='com.graymatrix.did:id/header_primary_text' and @text='"+trayName+"']");
	} 
	
	public static By objSubscribeIcon = By.xpath("//*[@resource-id='com.graymatrix.did:id/subscribeiconlayout']");
	
	public static By objFirstContent = By.xpath("(//*[@id='horizontal_list_10_parent'])[1]");
	
	public static By objLiveTV = By.xpath("//*[@id='liveButton']");
	
	public static By objImageIcon = By.xpath("//*[@id='item_image']");
	
	public static By objContentInLiveTV = By.xpath("//*[@id='horizontal_list_10_parent']");
	
	public static By objTimeFrame = By.xpath("//*[@id='tvsubTitle']");
	
	public static By objChannelLogo = By.xpath("//*[@resource-id='com.graymatrix.did:id/img_channel']");
	
	public static By objFirstContentCardOfFreeChannelsTray = By.xpath("(//*[@text='FREE Channels']/parent::*/parent::*/following-sibling::*/child::*/child::*/child::*/child::*)[1]");

	public static By objLoadingIcon = By.id("compoiste_progress_bar");
	
	public static By objFirstContentCardUnderFreeChannelsTray = By.xpath("(//*[@text='FREE Channels']//following::*[@id='item_primary_text'])[1]");
}
