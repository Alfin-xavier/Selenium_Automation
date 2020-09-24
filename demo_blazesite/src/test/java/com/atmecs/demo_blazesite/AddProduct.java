package com.atmecs.demo_blazesite;

import com.atmecs.demo_blazesite.pagehelper.AddProductToCartTest;

public class AddProduct 
{
	public void addProduct() throws InterruptedException
	{
		AddProductToCartTest addproduct = new AddProductToCartTest();
		
		addproduct.selectAndAddToCartProduct();
	}
}
