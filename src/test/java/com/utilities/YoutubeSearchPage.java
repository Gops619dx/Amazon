 package com.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_class;
import com.interfaceelement.YouTubePage;
import com.utility.ReadExcelData;

public class YoutubeSearchPage extends Base_class implements YouTubePage {
    ReadExcelData read = new ReadExcelData();

    @FindBy(xpath = "//input[@name='search_query']")
    WebElement search;

    public YoutubeSearchPage() {
        PageFactory.initElements(driver, this);
    }

    public void SearchContent() {
        ImplicitwaitImplements(TimeUnit.SECONDS, 10);
        String ip = read.readParticularData(6, 0);
        System.out.println("Readed String : " + ip);
        search.sendKeys(ip);
    }

	private void ImplicitwaitImplements(TimeUnit seconds, int i) {
		// TODO Auto-generated method stub
		
	}
}
