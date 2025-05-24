package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import com.pageobjectmodel.LoginPageModel;
import com.pageobjectmodel.ProductSearchPageModel;
import com.pageobjectmodel.ShippingElementModel;
import com.utilities.FileReaderManager;

public class PageObjectManager {

    private WebDriver driver;

    private LoginPageModel loginPageModel;
    private ProductSearchPageModel productSearchPageModel;
    private ShippingElementModel shippingElementModel;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public FileReaderManager getFileReader() {
        return new FileReaderManager(); 
    }

    public LoginPageModel getLoginPagemodel() {
        if (loginPageModel == null) {
            loginPageModel = new LoginPageModel();
        }
        return loginPageModel;
    }

    public ProductSearchPageModel getProductSearchmodel() {
        if (productSearchPageModel == null) {
            productSearchPageModel = new ProductSearchPageModel(driver);
        }
        return productSearchPageModel;
    }

    public ShippingElementModel getShippingElementmodel() {
        if (shippingElementModel == null) {
            shippingElementModel = new ShippingElementModel(driver);
        }
        return shippingElementModel;
    }

	public Object getplaceOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getaddressPages() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getsearchPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object productSearchPageModel() {
		// TODO Auto-generated method stub
		return null;
	}
}
