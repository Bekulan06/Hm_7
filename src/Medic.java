public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println("Medic ������� �������� �� 15 ������ � 10%!");
        increaseExperience();
    }
    public double healPoints = 15;
    public double increaseExperience(){
        System.out.println(10 * (healPoints / 100) + healPoints);
        return healPoints;
        }



        }


