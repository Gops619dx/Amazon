package com.test;

import java.io.IOException;

import com.base.Base_class;
import com.pageobjectmanager.Yu_PageObjectManager;
import com.utility.FileReaderManager;

public class Ytb_Runner extends Base_class {
	public static void main(String[] args) throws IOException {
		Yu_PageObjectManager pom = new Yu_PageObjectManager();
		pom.getFileManager();
		lanuchBrowser(FileReaderManager.getDataProperty("browser"));
		launchUrl(pom.getFileManager().getDataProperty("url"));
		pom.getSearch().SearchContent();
	}

}
