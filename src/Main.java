public class Main {
    public static void main(String[] args) {
        HavingSuperAbility havingSuperAbility = new HavingSuperAbility() {
            @Override
            public void applySuperAbility() {

            }

        };
        Hero[] hero = {new Warrior(), new Magic(),
                new Medic()  };
        for (int i = 0; i < hero.length; i++) {
            hero [i].applySuperAbility();
            if (hero[i] instanceof Medic){
                System.out.println(((Medic) hero[i]).healPoints);
                ((Medic) hero[i]).increaseExperience();
                System.out.println(((Medic) hero[i]).healPoints);
            }

        }//for (int i = 0; i < hero.length; i++) {

        }

    }

