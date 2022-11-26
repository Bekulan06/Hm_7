public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println("Medic повысил здоровье на 15 единиц и 10%!");
        increaseExperience();
    }
    public double healPoints = 15;
    public double increaseExperience(){
        System.out.println(10 * (healPoints / 100) + healPoints);
        return healPoints;
        }



        }


