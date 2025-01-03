import java.util.Scanner;

public class PasswordValidator
  {
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          // initialise Char array and take in string input
          char [] passArr = sc.nextLine().toCharArray();

          // counters
          int countDig = 0;
          int countSpChar = 0;

          // check character length
          if(passArr.length <= 7){
            System.out.println("Weak");
          }
          else{
            // iterate through the password to evaluate
            for(int i = 0 ; i < passArr.length; i++){
              // check for digits
              for(char ii : passArr){
                if(Character.isDigit(ii)){
                  countDig++;
                  if(countDig == 2){
                    break;
                  }
                }
              }

              // check for special chars
              for(char iii : passArr){
                if(iii == '!' || iii == '@' || iii == '#' || iii == '$' || iii == '%' || iii == '&' || iii == '*'){
                  countSpChar++;
                  if(countSpChar == 2){
                    break;
                  }
                }
              }

              if(countDig >= 2 && countSpChar >= 2){
                System.out.println("Strong");
              }
              else{
                System.out.println("Weak");
              }
            }
          }
            sc.close();
      }
    }
