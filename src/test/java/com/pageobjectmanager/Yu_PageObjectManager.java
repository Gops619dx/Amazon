package com.pageobjectmanager;

import com.base.Base_class;
import com.utilities.YoutubeSearchPage;
import com.utility.FileReaderManager;
import com.utility.ReadExcelData;

public class Yu_PageObjectManager extends Base_class {
	private ReadExcelData read;
	private FileReaderManager file;
	private YoutubeSearchPage search;
	
	public ReadExcelData getread() {
        if (read == null) {
            read = new ReadExcelData();
        }
        return read;
    }

    public FileReaderManager getFileManager() {
        if (file == null) {
            file = new FileReaderManager();
        }
        return file;
    }

    public YoutubeSearchPage getSearch() {
        if (search == null) {
            search = new YoutubeSearchPage();
        }
        return search;
    }
	

}
