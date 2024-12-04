package chap1_10.inter.animal;

import chap1_9.final_.Animal;

public abstract class animal {
    
    // 사냥 기술
    public abstract void hunt(Animal pet);
    
    // 애완동물로서 필요한 기술
    public abstract void handle();
    public abstract boolean inject();

    // 난폭한 행동을 하는 기술
    public abstract void violent();
}
