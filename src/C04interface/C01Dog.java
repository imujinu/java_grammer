package C04interface;

public class C01Dog implements C01AnimalInterface1, C01AnimalInterface2{

    @Override
    public String play(String a, String b) {
        return a+"와"+b+"가 산책합니다.";
    }

    @Override
    public void makesound() {
        System.out.println("멍멍");
    }
}
