package chap2_8.stream;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Filtering {
    public static void main(String[] args) {

        // 요리 메뉴중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> menuList = Menu.menuList;    // static이니까 객체 생성 안 하고 바로 클래스명 Menu. 호출

        // 채식주의자들의 요리를 담을 새 리스트를 생성
//        List<Dish> vegetarianList = new ArrayList<>();

        // 필터링
//        for (Dish dish : menuList) {
//            if (dish.isVegetarian()) {
//                vegetarianList.add(dish);  // 자바스크립트에서의 push는 자바에서 add!
//            }
//        }

        List<Dish> vegetarianList = menuList.stream()       // 1. 데이터 소스 생성
                .filter((dish) -> dish.isVegetarian()) // 2. 중간 연산
                .collect(toList());              // 3. 최종 연산


        // 반복문 처리
        vegetarianList.forEach(dish -> System.out.println(dish));   // forEach는 stream을 생략할 수 있음

        System.out.println("======================");

        // 메뉴 목록 중 육류이면서 600칼로리 미만인 요리 필터링
        List<Dish> meatLowCalories = menuList.stream()
                .filter((menu) -> menu.getType() == DishType.MEAT && menu.getCalories() < 600)
                .collect(toList());   // 자바는 최종연산을 해줘야 함!

        meatLowCalories.forEach(m -> System.out.println(m));


        System.out.println("===================");
        // 메뉴 목록에서 요리 이름이 4글자인 것만 필터링
        menuList.stream()
                .filter(menu -> menu.getName().length() == 4)
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("===========================");

        // 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        List<Dish> limit3 = menuList.stream()
                .filter(m -> m.getCalories() > 300)
                .limit(3) // 앞에서부터 3개 선택
                .collect(toList());

        limit3.forEach(System.out::println);

        System.out.println("===========================");
        // 300칼로리보다 큰 요리 중 처음 2개는 스킵하고 필터링
        List<Dish> skip2 = menuList.stream()
                .filter(m -> m.getCalories() > 300)
                .skip(2)
                .collect(toList());

        skip2.forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 1, 3, 5, 2, 1, 3, 4, 4, 5, 1);


        // 숫자 리스트에서 짝수들만 필터링
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()  // 중복제거
                .collect(toList());

        System.out.println("evenNumbers = " + evenNumbers);
    }
}

