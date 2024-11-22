package chap1_2.funtion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodQuiz {

  static String[] foods = {"떡볶이", "치킨", "파스타"};
  static String[] userName = {"홍길동", "박영희"};


  static void printFoods() {
    System.out.println(Arrays.toString(foods));
  }

  static void push(String foodName) {
//

    String[] newArray = new String[foods.length + 1];

    for (int i = 0; i < foods.length; i++) {
      newArray[i] = foods[i];
    }
    newArray[newArray.length-1] = foodName;

    foods = newArray;
    newArray=null;
  }
  public static void main(String[] args) {

    push("라면");
    push("김치찌개");
    printFoods();



//        int index = indexOf("파스타");
//        System.out.println("index = " + index);
//
//
//        int index2 = indexOf("라면땅");
//        System.out.println("index2 = " + index2);

//        pop();
//        remove("치킨");
//        printFoods();
//
//
//        boolean flag1 = include("파스타");
//        System.out.println("flag1 = " + flag1);
//
//        boolean flag2 = include("떡라면");
//        System.out.println("flag2 = " + flag2);
//
//        insert(3, "파인애플");
//
//        printFoods();
//
//        modify(2, "닭갈비");
//        printFoods();

  } // main
}

