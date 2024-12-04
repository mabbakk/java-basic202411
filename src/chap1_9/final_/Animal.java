package chap1_9.final_;

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("동물의 울음소리~");
    }

//    public void eat() {
//        System.out.println("밥암냠냠~");
//    }
}


public class Animal {

    public void eat() {
        System.out.println("밥암냠냠~");
    }

    public void makeSound() {
        System.out.println("동물의 울음소리~");
    }
}
