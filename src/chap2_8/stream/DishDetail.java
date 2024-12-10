package chap2_8.stream;

import java.util.Objects;

public class DishDetail {

    private String name;
    private String typeName;

    public DishDetail(String name) {
    }

    public DishDetail(String name, String typeName) {
        this.name = name;
        this.typeName = typeName;
    }

    public DishDetail(Dish m) {
        // Dish를 처리하는 생성자 m
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "name='" + name + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DishDetail that = (DishDetail) o;
        return Objects.equals(name, that.name) && Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, typeName);
    }



    // setter / getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
