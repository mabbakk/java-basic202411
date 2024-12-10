package chap2_8.stream;

public class Dish {

    private String name; // 요리 이름
    private boolean vegetarian;  // 채식 여부
    private int calories;  // 칼로리

    // 기본 생성자
    public Dish() {
    }

    
    // 전체 생성자
    public Dish(String name, boolean vegetarian, int calories, DishType type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    private DishType type;  // 요리 카테고리



    // getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public DishType getType() {
        return type;
    }

    public void setType(DishType type) {
        this.type = type;
    }

    // ToString
    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }

    public void length() {
    }
}

