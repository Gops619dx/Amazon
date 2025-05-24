package com.runner;

import java.io.IOException;

import com.base.Base_class;
import com.pageobjectmanager.PageObjectManager;
import com.pageobjectmodel.ProductSearchPageModel;

public class Runner_Class extends Base_class {
    public static void main(String[] args) throws IOException {
    	 PageObjectManager pom = new PageObjectManager();
    	 
    	  lanuchBrowser((String) pom.getFileReader().getDataproperty("chrome"));
    	  launchUrl((String) pom.getFileReader().getDataproperty("url"));
    	  pom.getLoginPagemodel().logInPageMethods();
    	  ((ProductSearchPageModel) pom.getProductSearchmodel()).ProductSearchPageModel();
    	  pom.productSearchPageModel().getClass();
    	  pom.getShippingElementmodel().getShippingElement();
    	  ((ProductSearchPageModel) pom.productSearchPageModel()).ProductSearchPageModel();
    	  
 
}
}