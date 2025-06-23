package C04interface;

public class C01Cat implements C01AnimalInterface1, C01AnimalInterface2{

    @Override
    public String play(String a, String b) {
        return a+"와"+b+"가 그루밍 합니다.";
    }

    @Override
    public void makesound() {
        System.out.println("야옹야옹");
    }
}
