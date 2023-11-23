public class CWH_strings_2 {
    public static void main(String ar[])
    {
        String name ="Rohit";
        System.out.println(name);
        int value = name.length();  // it gives the length of string
        System.out.println(value);
        String lname =name.toLowerCase();  // it convert all upper case into lower case
        System.out.println(lname);
        String uname = name.toUpperCase(); // it covert all lower case into upper case
        System.out.println(uname);

        // NOTE --->> Index starts from "0"

        System.out.println(name.substring(2)); // it give the substring from index no.2 ----> "hit"
        System.out.println(name.substring(1,3)); // it give the substring from index no.1 to 2 ----> "hi"

        System.out.println(name.replace('h','m')); // it is replacing h with m
        System.out.println(name.replace("hit","mex")); // it is replacing hit with mex

        System.out.println(name.startsWith("Ro")); // it will shows that string is starting with "Ro" or not
        System.out.println(name.endsWith("hi")); // it will shows that string is ending with "hi" or not

        System.out.println(name.charAt(2)); // it will shows the letter of string at index 2
    }

}
