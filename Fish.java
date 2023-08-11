package Seminar_2;

public class Fish extends herbivores implements Swimable {
    public Fish(String nickname){
        super(nickname);

    }
    public String toString() {
        return "i`m Fish "+ super.toString()+ " My speed is " + speedOfSwim() + " fly ";
    }

    public String say(){
        return "буль буль  ";
    }

    @Override
    public int speedOfSwim(){
        return 45;
    }


}
