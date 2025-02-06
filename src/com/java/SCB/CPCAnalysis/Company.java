package com.java.SCB.CPCAnalysis;

import java.sql.Array;
import java.util.*;

public class Company implements ICompany{
    Map<Integer, Product> ProductMap= new HashMap<>();
    Map<Integer, Category> CataegoryMap = new HashMap<>();

    public void Company(List<Product> product, List<Category> category){
        for(Product p: product){
            ProductMap.put(p.getId(), p);
        }
        for(Category c: category){
            CataegoryMap.put(c.getId(),c);
        }

    }
    @Override
    public String getTopCategoryNameByProductCount() {
        String CategoryName=CataegoryMap.values().stream().max(Comparator
                .comparingInt(c -> c.getProducts().size()))
                .map(Category::getName)
                .orElse("");
        return CategoryName;
    }

    @Override
    public List<String> getProductsBelongsToMultipleCategory() {
        int count=0; int maxlength=0;
        List<Product> multipltproducts=new ArrayList<>();
        for(Map.Entry<Integer, Product>p: ProductMap.entrySet()){
           int pid=p.getValue().getId();
            for(Map.Entry<Integer, Category> c: CataegoryMap.entrySet()){
                for(Product product:c.getValue().getProducts()){
                   if(pid==product.getId())
                   {
                       count++;
                   }
                   if(count>1){
                       multipltproducts.add(p.getValue());
                   }
                }
            }
            count=0;
        }
        return List.of(multipltproducts.toString());
    }

    @Override
    public String getTopCategoryBySumOfProductPrices() {
        double sum=0; double maxsum=0;
        Map<Double, String> Category= new HashMap<>();
        for(Map.Entry<Integer, Category> c: CataegoryMap.entrySet()){
            for(Product p:c.getValue().getProducts()){
                sum=sum+p.getPrice();
                maxsum=sum;
            }
            Category.put(sum,c.getValue().getName());
            maxsum=Math.max(maxsum, sum);

        }
        return Category.get(maxsum);
    }

    @Override
    public List<String> getCategoriesWithSumOfTheProductPrices() {
        return List.of();
    }
}
