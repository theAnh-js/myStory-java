public class MyHero {
    String name;
    int hp;
    Sword sword;

    public int random(int number) {
        return (int) (Math.random() * number);
    }

    int randomDamageLevel1 = (int) (Math.random() * 1000) + 100;

    public void attack() {
        System.out.println(this.name + " attacked!");
        System.out.println(this.name + " gave " + randomDamageLevel1 + " points of damage on the enemy!");
    }

    public void backHome() {
        System.out.println(this.name + " is back home now!");
    }

    public void comeback() {
        System.out.println(this.name + " is coming back, too!");
    }

    int randomDamageLevel2 = (int) (Math.random() * 1000) + 1000;

    public void doubleAttack() {
        System.out.println(this.name + " attacked again!");
        System.out
                .println("This time, " + this.name + " gave " + randomDamageLevel2 + " points of damage on the enemy!");
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
