package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CssSelector extends BaseDriver {
@Test
	public void tagId() {
		driver.findElement(By.cssSelector("a#swm-link"));
		driver.findElement(By.cssSelector("div#nav-swmslot"));
	}
@Test
	public void tagClass() {
		driver.findElement(By.cssSelector("a.nav_a"));
		driver.findElement(By.cssSelector("a.a-size-base"));
	}
@Test
	public void tagAttribute() {
	driver.findElement(By.cssSelector("a[id=swm-link]"));
	driver.findElement(By.cssSelector("a[target=_blank]"));
	}
@Test
	public void tagClassAttribute() {
		driver.findElement(By.cssSelector("a.a-size-base[rel=noopener]"));
		driver.findElement(By.cssSelector("a.nav-a[id=nav-global-location-popover-link]"));
	}
@Test
	public void cssIdXpath() {
		
		driver.findElement(By.xpath("//div[@id='nav-packard-glow-loc-icon']"));
		driver.findElement(By.xpath("//div[@id='nav-iss-attach']"));
		driver.findElement(By.xpath("//a[@aria-label='Amazon']"));
		driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"));
		driver.findElement(By.xpath("//a[@class='nav-a']"));
	}
@Test
  	public void cssXpath() {
		driver.findElement(By.xpath("(//a[@class='nav-a'])[2]"));
		driver.findElement(By.xpath("(//span[@class='nav-line-1'])[3]"));
		driver.findElement(By.xpath("(//div[@class='a-cardui-header'])[16]"));
		driver.findElement(By.xpath("(//div[@class='a-cardui-header'])[5]"));
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none image-label aok-inline-block aok-align-center'])[23]"));
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small grid-row-1'])[4]"));
		driver.findElement(By.xpath("(//img[@class='landscape-image'])[33]"));
		driver.findElement(By.xpath("(//a[@class='a-link-normal quadrant-overlay'])[1]"));
		driver.findElement(By.xpath("(//div[@style='height:85px'])[2]"));
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-text-center image-label truncate-2line'])[4]"));
	}
}