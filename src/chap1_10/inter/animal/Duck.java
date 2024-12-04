package chap1_10.inter.animal;

public class Duck extends Handle implements Pet {
    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }
}
