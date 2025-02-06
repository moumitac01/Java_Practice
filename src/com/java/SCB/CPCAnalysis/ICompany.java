package com.java.SCB.CPCAnalysis;

import java.util.List;

public interface ICompany {
    String getTopCategoryNameByProductCount();
    List<String> getProductsBelongsToMultipleCategory();
    String getTopCategoryBySumOfProductPrices();
    List<String> getCategoriesWithSumOfTheProductPrices();
}
