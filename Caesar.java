//Encrytion and Decrytion
//61107959 Wathinee Saeaui

import java.util.*;
public class Caesar {
    public static void main (String[] args) {
        System.out.println("1.Encrytion\n2.Decrytion\nChoose(1,2): ");
        Scanner st = new Scanner(System.in);
        int choice = st.nextInt();

        if(choice == 1){
            System.out.println("Encrytion");
            st.nextLine();

            System.out.println("Input message: ");
            String msg = st.nextLine();

            System.out.println("Input value of shift: ");
            int shift = st.nextInt();

            String encryMsg = "";
            

            for(int i = 0; i < msg.length(); i++){

                //again casting

                if((int)msg.charAt(i) == 32){
                    encryMsg += (char)32;  //ignoring space, casting int yo char

                } else if ((int)msg.charAt(i) + shift >122){
                    int temp = ((int)msg.charAt(i) + shift) - 122;
                    //System.out.println(temp);
                    encryMsg += (char)(96 + temp);

                } else if ((int)msg.charAt(i) + shift > 90 && msg.charAt(i) < 96){
                    int temp = ((int)msg.charAt(i) + shift) - 90;
                    //System.out.println(temp);
                    encryMsg += (char)(64 + temp);

                } else {
                    encryMsg += (char)((int)msg.charAt(i) + shift);

                }
            }

            System.out.println(encryMsg);

        } else if (choice == 2){
            System.out.println("Decrytion");
            st.nextLine();

            System.out.println("Input message: ");
            String encryText = st.nextLine();

            System.out.println("Input value of shift: ");
            int deshift = st.nextInt();

            String decryMsg = "";
            

            for(int i = 0; i < encryText.length(); i++){

                //now type casting

                if((int)encryText.charAt(i) == 32){
                    decryMsg += (char)32;  //ignoring space, casting int to char

                } else if (((int)encryText.charAt(i) -deshift) < 97 && ((int)encryText.charAt(i) - deshift) > 90){

                    //lower case
                    int temp = ((int)encryText.charAt(i) - deshift) + 26;
                    //System.out.println(temp);
                    decryMsg += (char) temp;

                } else if (((int)encryText.charAt(i) - deshift) < 65){

                    //upper case
                    int temp = ((int)encryText.charAt(i) - deshift) +26;
                    //System.out.println(temp);
                    decryMsg += (char) temp;

                } else {
                    decryMsg += (char)((int)encryText.charAt(i) - deshift);

                }
            }

            System.out.println(decryMsg);

        } else {
            System.out.println("Select 1 or 2");
        }

       
    }

}
