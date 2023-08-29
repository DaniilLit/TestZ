import java.util.Scanner;

public class calc {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String baza = scanner.nextLine();
        String[] sim = baza.split(" ");
        String[] romSto = new String[] {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        if (sim.length > 3){
            throw  new Exception("т.к слишком много операндов и/или операторов");
        }
        if (sim.length < 3){
            throw new Exception("строка не является математической операцией");
        }

   if ((!("+").equalsIgnoreCase(sim[1])) && (!("-").equals(sim[1])) && (!("/").equals(sim[1])) && (!("*").equals(sim[1]))){
       throw new Exception("неизвестный оператор");
   }
          if(((("I").equalsIgnoreCase(sim[0])) || (("II").equalsIgnoreCase(sim[0])) ||
                  (("III").equalsIgnoreCase(sim[0])) || (("IV").equalsIgnoreCase(sim[0])) || (("V").equalsIgnoreCase(sim[0])) || (("VI").equalsIgnoreCase(sim[0])) ||
                  (("VII").equalsIgnoreCase(sim[0])) || (("VIII").equalsIgnoreCase(sim[0]))|| (("IX").equalsIgnoreCase(sim[0]))|| (("X").equalsIgnoreCase(sim[0])))
                  &&
                  ((("I").equalsIgnoreCase(sim[2])) || (("II").equalsIgnoreCase(sim[2]))
                  || (("III").equalsIgnoreCase(sim[2])) || (("IV").equalsIgnoreCase(sim[2])) || (("V").equalsIgnoreCase(sim[2])) || (("VI").equalsIgnoreCase(sim[2]))
                          || (("VII").equalsIgnoreCase(sim[2])) || (("VIII").equalsIgnoreCase(sim[2]))|| (("IX").equalsIgnoreCase(sim[2]))|| (("X").equalsIgnoreCase(sim[2])))){
              int rom1 = 0;
              int rom2 = 0;
              int romItog = 0;
              switch(sim[0]){
               case ("I"):
                 rom1 = 1;
                 break;
                  case ("II"):
                      rom1 = 2;
                      break;
                  case ("III"):
                      rom1 = 3;
                      break;
                  case ("IV"):
                      rom1 = 4;
                      break;
                  case ("V"):
                      rom1 = 5;
                      break;
                  case ("VI"):
                      rom1 = 6;
                      break;
                  case ("VII"):
                      rom1 = 7;
                      break;
                  case ("VIII"):
                      rom1 = 8;
                      break;
                  case ("IX"):
                      rom1 = 9;
                      break;
                  case ("X"):
                      rom1 = 10;
                      break;
                  case ("i"):
                      rom1 = 1;
                      break;
                  case ("ii"): rom1 = 2;
                  break; case ("iii"):

                      rom1 = 3;
                      break;
                      case ("iv"):
                          rom1 = 4; break;
                          case ("v"):
                              rom1 = 5;
                              break;
                              case ("vi"):
                                  rom1 = 6;
                                  break;
                                  case ("vii"):
                                      rom1 = 7;
                                      break;
                                      case ("viii"):
                                          rom1 = 8;
                                          break;
                                          case ("ix"):
                                              rom1 = 9;
                                              break;
                                              case ("x"):
                                                  rom1 = 10;
                                                  break;}

                      switch (sim[2]){
                      case ("I"):
                          rom2 = 1;
                          break;
                      case ("II"):
                          rom2 = 2;
                          break;
                      case ("III"):
                          rom2 = 3;
                          break;
                      case ("IV"):
                          rom2 = 4;
                          break;
                      case ("V"):
                          rom2 = 5;
                          break;
                      case ("VI"):
                          rom2 = 6;
                          break;
                      case ("VII"):
                          rom2 = 7;
                          break;
                      case ("VIII"):
                          rom2 = 8;
                          break;
                      case ("IX"):
                          rom2 = 9;
                          break;
                      case ("X"):
                          rom2 = 10;
                          break;
                          case ("i"):
                              rom2 = 1;
                              break;
                          case ("ii"): rom2 = 2;
                              break; case ("iii"):

                              rom2 = 3;
                              break;
                          case ("iv"):
                              rom2 = 4; break;
                          case ("v"):
                              rom2 = 5;
                              break;
                          case ("vi"):
                              rom2 = 6;
                              break;
                          case ("vii"):
                              rom2 = 7;
                              break;
                          case ("viii"):
                              rom2 = 8;
                              break;
                          case ("ix"):
                              rom2 = 9;
                              break;
                          case ("x"):
                              rom2 = 10;
                              break;}



                                                   if (("+").equals(sim[1])){

                                                      romItog = rom1 + rom2;

                                                  }
                                                  if (("-").equals(sim[1])){

                                                      romItog = rom1 - rom2;

                                                  }
                                                  if (("/").equals(sim[1])){

                                                      romItog = rom1 / rom2;

                                                  }
                                                  if (("*").equals(sim[1])){

                                                      romItog = rom1 * rom2;

                                                  }
                                                  if (romItog == 0){
                                                      throw new Exception("в данной ситуация наши полномочия все.. окончены");
                                                  }
                                    if (romItog < 0){
                                        throw new Exception("Римское число не может быть меньше 0");
                                    }

              System.out.println(romSto[romItog]);

                                              } else if (((("I").equalsIgnoreCase(sim[0])) || (("II").equalsIgnoreCase(sim[0])) ||
                (("III").equalsIgnoreCase(sim[0])) || (("IV").equalsIgnoreCase(sim[0])) || (("V").equalsIgnoreCase(sim[0])) || (("VI").equalsIgnoreCase(sim[0])) ||
                (("VII").equalsIgnoreCase(sim[0])) || (("VIII").equalsIgnoreCase(sim[0]))|| (("IX").equalsIgnoreCase(sim[0]))|| (("X").equalsIgnoreCase(sim[0])))
                && (((Integer.parseInt(sim[2]) < 10))  ||  ((Integer.parseInt(sim[0]) < 10)) &&  (("I").equalsIgnoreCase(sim[2])) || (("II").equalsIgnoreCase(sim[2]))
                  || (("III").equalsIgnoreCase(sim[2])) || (("IV").equalsIgnoreCase(sim[2])) || (("V").equalsIgnoreCase(sim[2])) || (("VI").equalsIgnoreCase(sim[2]))
                  || (("VII").equalsIgnoreCase(sim[2])) || (("VIII").equalsIgnoreCase(sim[2]))|| (("IX").equalsIgnoreCase(sim[2]))|| (("X").equalsIgnoreCase(sim[2])))){
                                                  throw new Exception("Можно проводить операция либо с римскиими либо с арабскиими цифрами");
        }


              else if (((Integer.parseInt(sim[0]) > 10)) || ((Integer.parseInt(sim[2]) > 10 ))){
                  throw new Exception("т.к первое и/или второе число больше 10");}
         else if ((Integer.parseInt(sim[0]) < 10) && (Integer.parseInt(sim[2]) < 10)){

        if (("+").equals(sim[1])){

                    System.out.println((Integer.parseInt(sim[0])) + (Integer.parseInt(sim[2])));
        }
        if (("-").equals(sim[1])){

            System.out.println((Integer.parseInt(sim[0])) - (Integer.parseInt(sim[2])));
        }
        if (("/").equals(sim[1])){

            System.out.println((Integer.parseInt(sim[0])) / (Integer.parseInt(sim[2])));
        }
        if (("*").equals(sim[1])){

            System.out.println((Integer.parseInt(sim[0])) * (Integer.parseInt(sim[2])));
        }}
             else{
                 throw new Exception("введите пример по форме");
          }

}}
