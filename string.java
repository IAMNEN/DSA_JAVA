public class string {
    public static void main(String[] args) {
        String str1 = "Nen";
        String str2 = "Nen";
        String str3 = new String("Nen");

        System.out.println(str1 == str2);// same string values
        System.out.println(str1 == str3);// different object 
        System.out.println(str1.equals(str3));//
    }
}
