public class MyHero {
    String name;
    int hp;
    Sword sword;

    public void attack() {
        System.out.println(this.name + " attacked!");
        System.out.println(this.name + " gave 100 points of damage on the enemy!");
    }

    public void backHome() {
        System.out.println(this.name + " is going home back now!");
    }

    public void comeback() {
        System.out.println(this.name + " is coming back, too!");
    }

    public void doubleAttack() {
        System.out.println(this.name + " attacked again!");
        System.out.println(this.name + " gave 2000 points of damage on the enemy!");
    }

    public void getFood(String food) {
        System.out.println(this.name + " want to eat " + food + " ,www");
    }

    public void sleep(boolean isSleep) {
        if (isSleep) {
            System.out.println(this.name + " realy want to go to bed :)");
        } else {
            System.out.println(this.name + " still want to eat something :))");
        }
    }

}
