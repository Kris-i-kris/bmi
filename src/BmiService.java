public class BmiService {
    public int calculate(int kg, int cm) {
        int a = kg * 10000;
        int b = cm * cm;
        int result = a / b;


        return result;
    }
}
