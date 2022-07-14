public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "Iron Man's Gun";

        // 私のヒーローは：
        MyHero myHero = new MyHero();
        myHero.name = "Iron Man";
        myHero.sword = s;

        // 戦い中：
        System.out.println("ヒーローは闘っているよよよよよ。");
        System.out.println("This weapon is " + myHero.sword.name);
        myHero.attack();
        System.out.println("Amazing good job my " + myHero.name + "!");
        myHero.backHome();

        // 成功したかどうか？
        System.out.println("闘いは終わったかな？");
        boolean isSuccess = false;
        if (!isSuccess) {
            System.out.println("Enemy is coming back");
            myHero.comeback();
            myHero.doubleAttack();
            System.out.println("Enemy is dead");

        } else {
            System.out.println("Enemy is dead!!!");
        }

        // Heroが何を食べたい？
        System.out.println("ヒーローは何を食べたいかな？");
        myHero.getFood("sushi");
        myHero.getFood("takoyaki");

        // Heroはもう眠たいかな？
        System.out.println("ヒーローは眠たいのかな？");
        myHero.sleep(true);

        // 人々から見たHeroは：
        System.out.println("人々はヒーローのことをどう思っているか？");
        People someone = new People();
        someone.say(myHero.name, "cute");
        someone.say(myHero.name, "strong");
        someone.say(myHero.name, "nice guy");

        // 彼の趣味は：
        System.out.println("ヒーローの趣味は何か知ってるかな？");
        someone.think(myHero.name, "japanese foods");
        someone.think(myHero.name, "Coca-cola");
        someone.think(myHero.name, "sleeping");

        // 人々がHeroに会いたいのか？
        System.out.println("人々はヒーローに会いたいのかな？");
        someone.wantTo(true);
        someone.wantTo(false);

        // 人々の子供たちから見たHeroは：(People から継承する)
        People kid = new People();
        System.out.println("人々の子供たちはヒーローのことをどう思っているのかな？");
        kid.say(myHero.name, "handsome");
        kid.say(myHero.name, "perfect");
        kid.say(myHero.name, "brave");

        // 子供たちはHeroに会いたいかな？:(People から継承する)
        System.out.println("子供たちはHeroに会いたいかな？");
        kid.wantTo(true);
        kid.wantTo(true);

        // 人々の子供たちの夢は：（継承しない）
        System.out.println("人々の子供たちの夢は：");
        Kids kids = new Kids();
        kids.getDreams(myHero.name);
        kids.getDreams("best friend of " + myHero.name);
        kids.getDreams("Spider Man. Because Spider Man is a disciple of Iron Man :):) .");

    }
}
