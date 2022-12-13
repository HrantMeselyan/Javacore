package group1.Chapter3;

public class LightSpeed {

    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;
        days = 1000;


        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;

        System.out.print(days + " օրում լույսը կանցնի ");
        System.out.println(distance + " մղոն");
    }
}

