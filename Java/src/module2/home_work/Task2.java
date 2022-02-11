package module2.home_work;

public class Task2 {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1;
        int middle = -1;
        int max = -1;

        if(vasyaAge < katyaAge && vasyaAge < mishaAge) {
            min = vasyaAge;
        } else if (katyaAge < vasyaAge && katyaAge < mishaAge) {
            min = katyaAge;
        } else {
            min = mishaAge;
        }

        if(vasyaAge > katyaAge && vasyaAge > mishaAge) {
            max = vasyaAge;
        } else if (katyaAge > vasyaAge && katyaAge > mishaAge) {
            max = katyaAge;
        } else {
            max = mishaAge;
        }

        if (vasyaAge != min && vasyaAge != max) {
            middle = vasyaAge;
        } else if (katyaAge != min && katyaAge != max){
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximun age: " + max);
    }
}
