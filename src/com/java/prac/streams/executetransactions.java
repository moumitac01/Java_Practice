//package com.java.prac.streams;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class executetransactions {
//public static void main(String args[]) {
//	List<Transcations> datalist = Arrays.asList(
//                     new Transcations("grocery", 2500),
//                     new Transcations("food", 2000),
//                     new Transcations("wifi", 2500),
//                     new Transcations("rent", 3500),
//                     new Transcations("grocery", 2000));
//
//	int groceryspent = datalist.stream()
//			.filter(t -> t.getCategory()=="grocery")
//			.mapToInt(Transcations::getAmmount().sum());
//	System.out.println(groceryspent);
////}
//}
