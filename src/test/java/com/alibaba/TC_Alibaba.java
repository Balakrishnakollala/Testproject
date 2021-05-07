package com.alibaba;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import qa.com.utlity.*;

public class TC_Alibaba extends TestBase {

	@Test(dataProvider = "getData")
	public void AlibabaSearch(String Input1, String Input2) throws Exception {

		alibaba.getSigninlink().click();
		alibaba.getEmailid().sendKeys(Input1);
		alibaba.getPassword().sendKeys(Input2);
		alibaba.getCheckinbtn().isSelected();
		alibaba.getSigninbtn().click();
		Thread.sleep(5000);

		alibaba.getSearchbox().clear();
		alibaba.getSearchbox().sendKeys("Bags");
		alibaba.getSearchbox().submit();

		
		Thread.sleep(5000);

		WebElement ele = alibaba.getAlibaba();
		action.moveToElement(ele).perform();
		Thread.sleep(5000);

		WebElement ele1 = alibaba.getSignout();
		action.moveToElement(ele1).perform();
		alibaba.getSignout().click();

	}

	@DataProvider
	public String[][] getData() throws IOException {
		String xlPath = "F:\\Eclipse Testing programs workspace\\Testing programs(1)\\alibabatesting\\src\\test\\java\\com\\testdata\\TestData1.xlsx";

		String xlSheet = "Sheet1";

		int rowCount = ExcelUtility.getRowCount(xlPath, xlSheet);

		int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);

		String[][] data = new String[rowCount][cellCount];

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i - 1][j] = ExcelUtility.getCellData(xlPath, xlSheet, i, j);

			}
		}

		return data;
	}
}
