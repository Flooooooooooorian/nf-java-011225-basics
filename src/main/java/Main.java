public class Main {

    public static void main(String[] args) {
        String value = "Florian";
        if (value == "Florian") {

        } else if (value == "Dominic") {

        }

        switch (value) {
            case "Florian": {
                System.out.println("Hallo Florian");
                break;
            }
            case "Dominic": {
                System.out.println("Hallo Dominic");
            }
        }


        String result = value.length() > 10 ? "Der Wert ist länger als 10 Zeichen" : "Der Wert ist nicht länger als 10 Zeichen";
        System.out.println(result);

        String myValue = "     ";
        System.out.println(myValue.isBlank());
        System.out.println(myValue.isEmpty());

    }
}
