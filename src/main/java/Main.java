//liczby pierwsze
public class Main{
    public static void main(String[] args) {
        int liczbaLiczbPierwszych = 0;
        int liczba = 2; // Pierwsza liczba do sprawdzenia

        while (liczbaLiczbPierwszych < 500) {
            if (czyPierwsza(liczba)) {
                System.out.println(liczba);
                liczbaLiczbPierwszych++;
            }
            liczba++;
        }
    }

    public static boolean czyPierwsza(int liczba) {
        for (int i = 2; i <= liczba / 2; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// ujemna czy dodatnia
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba > 0) {
            System.out.println("Liczba jest dodatnia.");
        } else if (liczba < 0) {
            System.out.println("Liczba jest ujemna.");
        } else {
            System.out.println("Liczba jest równa zero.");
        }

        scanner.close(); 
    }
}
//4.pobierze od użytkownika trzy liczby i wypisze największą z nich..txt
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź trzy liczby, aby znaleźć największą z nich:");

        System.out.print("Pierwsza liczba: ");
        int liczba1 = scanner.nextInt();
        System.out.print("Druga liczba: ");
        int liczba2 = scanner.nextInt();
        System.out.print("Trzecia liczba: ");
        int liczba3 = scanner.nextInt();

        int najwieksza = liczba1;

        if (liczba2 > najwieksza) {
            najwieksza = liczba2;
        }

        if (liczba3 > najwieksza) {
            najwieksza = liczba3;
        }

        System.out.println("Największa wprowadzona liczba to: " + najwieksza);

        scanner.close();
    }
}
//5.składa się z dwóch funkcji obliczach silnię liczby podanej jako argument w sposób iteracyjny i rekurencyjny..txt
public class Main {

    // Metoda iteracyjna
    public static int silniaIteracyjnie(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    // Metoda rekurencyjna
    public static int silniaRekurencyjnie(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * silniaRekurencyjnie(n - 1);
        }
    }

    public static void main(String[] args) {
        int liczba = 5; // Możesz zmienić tę wartość, aby przetestować z inną liczbą
        System.out.println("Silnia liczby " + liczba + " (iteracyjnie): " + silniaIteracyjnie(liczba));
        System.out.println("Silnia liczby " + liczba + " (rekurencyjnie): " + silniaRekurencyjnie(liczba));
    }
}
//6.sprawdza, czy równanie jest równaniem liniowym..txt
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź wartość 'a': ");
        double a = scanner.nextDouble();
        System.out.print("Wprowadź wartość 'b': ");
        double b = scanner.nextDouble();

        if (a != 0) {
            System.out.println("Równanie " + a + "x + " + b + " = 0 jest równaniem liniowym.");
        } else {
            System.out.println("Równanie nie jest liniowe, ponieważ 'a' jest równe 0.");
        }

        scanner.close();
    }
}
// 7.przelicza prędkość z ms na kmh..txt
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź prędkość w m/s: ");
        double predkoscMS = scanner.nextDouble();

        double predkoscKMH = predkoscMS * 3.6;
        System.out.println("Prędkość w km/h: " + predkoscKMH);

        scanner.close();
    }
}
//8.znajduje NWW I NWD dwóch liczb..txt
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        int a = scanner.nextInt();

        System.out.println("Podaj drugą liczbę:");
        int b = scanner.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {
            int z = y;
            y = x % y;
            x = z;
        }

        int NWD = x;
        int NWW = (a * b) / NWD;

        System.out.println("NWD to: " + NWD + ", NWW to: " + NWW);

        scanner.close();
    }
}
//9.będzie kalkulatorem walut z PLN na EUR i odwrotnie..txt
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double kurs = 4.34;

    System.out.println("Wpisz 1 dla EUR -> PLN, 2 dla PLN -> EUR");
    int choice = scanner.nextInt();

    switch (choice) {
      case 1: {
        System.out.println("Podaj kwote w Euro:");
        double kwota = scanner.nextDouble();
        System.out.println("Kwota w zlotowkach wynosi:" + kwota * kurs);
        break;
      }

      case 2: {
        System.out.println("Podaj kwote w zlotowkach:");
        double kwota = scanner.nextDouble();
        System.out.println("Kwota w euro wynosi:" + kwota / kurs);
        break;
      }
    }

    scanner.close();
  }
}
//10.określania płci osoby na podstawie jej peselu..txt
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj PESEL: ");
    String PESEL = scanner.nextLine();
    if (PESEL.length() != 11) {
      System.out.println("Niepoprawny PESEL");
    } else {
      int ostatnia = Character.getNumericValue(PESEL.charAt(10));
      if (ostatnia % 2 == 0) {
        System.out.println("Kobieta");
      } else {
        System.out.println("Mezczyzna");
      }
    }

    scanner.close();
  }
}
//11.który zliczania liczbę literek w ciągu znaków.txt
import java.util.Scanner;

public class LiczbaLiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();

        System.out.println("Podaj literę do zliczenia:");
        char litera = scanner.next().charAt(0);

        int licznik = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == litera) {
                licznik++;
            }
        }

        System.out.println("Litera '" + litera + "' występuje " + licznik + " razy.");
    }
}
// 12. Program zlicza liczbę słow w ciagu znakow.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj ciag znakow:");
    String ciagznakow = scanner.nextLine();
    int suma = 1;
    Boolean poprzednia_spacja = false;
    for (int i = 0; i < ciagznakow.length(); i++) {
      if (ciagznakow.charAt(i) == ' ') {
        if (!poprzednia_spacja) {
          suma++;
          poprzednia_spacja = true;
        }
      } else {
        poprzednia_spacja = false;
      }
    }

    System.out.println("Liczba slow wynosi: " + suma);
    scanner.close();
  }
}
// 13. Zlicza samogłoski

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj slowo:");
    String slowo = scanner.nextLine();
    int samogloski = 0;
    int spolgloski = 0;
    for(int i=0; i<slowo.length(); i++){
      switch(slowo.charAt(i)){
        case 'a':
        case 'e':
        case 'i':
        case 'u':
        case 'y':
        case 'o':
          samogloski++;
          break;
        default:
          spolgloski++;
          break;
      }
    }
//14. stwierdza czy jest to rok przestępny czy nie..txt
      import java.util.Scanner;

      public class RokPrzestepny {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.print("Podaj rok: ");
              int rok = scanner.nextInt();

              if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
                  System.out.println("To rok przestępny.");
              } else {
                  System.out.println("To nie jest rok przestępny.");
              }

              scanner.close();
          }
      }

//15. prosi użytkownika o wprowadzenie liczby całkowitej, a następnie wyświetli liczbę z odwróconą kolejnością cyfr..txt
      import java.util.Scanner;

      public class Main {
        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Podaj liczbe całkowitą:");
          String liczba = scanner.nextLine();
          for (int i = liczba.length() - 1; i >= 0; i--) {
            System.out.print(liczba.charAt(i));
          }

          scanner.close();
        }
      }
//16. program zlicza znaki interpunkcyjne

      import java.util.Scanner;

      public class Main {
        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Podaj ciag znakow");
          String ciag = scanner.nextLine();
          int suma = 0;
          for (int i = 0; i < ciag.length(); i++) {
            switch (ciag.charAt(i)) {
              case ';':
              case '!':
              case '?':
              case ':':
              case '"':
              case '/':
                suma++;
                break;
            }
          }
          System.out.println("Liczba znakow wynosi: " + suma);

          scanner.close();
        }
      }

//17. Program usuwa spacje z ciagu znaków
      import java.util.Scanner;

      public class UsunSpacje {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.print("Podaj tekst: ");
              String tekst = scanner.nextLine();

              // Usuń wszystkie spacje
              String bezSpacji = tekst.replace(" ", "");

              System.out.println("Tekst bez spacji: " + bezSpacji);
              scanner.close();
          }
      }
      // Ewentualnie
      import java.util.Scanner;

      public class Main {
        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Podaj ciag znakow:");
          String ciag = scanner.nextLine();
          for(int i =0; i< ciag.length(); i++){
            if(ciag.charAt(i) == ' '){
              ciag = ciag.substring(0, i) + ciag.substring(i + 1);
              i--;
            }
          }

          System.out.println(ciag);

          scanner.close();
        }
      }
//18. Program oblicza sumę cyfr w liczbie całkowitej
      import java.util.Scanner;

      public class Main {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

              System.out.println("Podaj liczbę:");
              int liczba = scanner.nextInt();
              int suma = 0;
              while (liczba > 0) {
                  suma += liczba % 10; 

                  liczba /= 10;
              }
              System.out.println("Suma cyfr w liczbie to: " + suma);
          }
      }

//19. Macierz
      import java.util.Scanner;

      public class Main  {
        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int[][] tablica = new int[5][5];

          // Wypelnij tablice mnozenia
          for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
              tablica[i][j] = i * 5 + (j + 1);
            }
          }

          // Wypisz tablice
          for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
              System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
          }

          // Sumuje wartsci tablicy
          int min = Integer.MAX_VALUE;
          int max = Integer.MIN_VALUE;
          for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
              if (tablica[i][j] > max) {
                max = tablica[i][j];
              }
              if (tablica[i][j] < min) {
                min = tablica[i][j];
              }

            }
          }

          System.out.println("Min wynosi: " + min + " a max wynosi: " + max);

          scanner.close();
        }
//20. Rysuje trojkąt
          import java.util.Scanner;

          public class Main{
            public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

              System.out.println("Podaj dlugosc boku: ");
              int dlugosc = scanner.nextInt();
              for (int i = 0; i < dlugosc; i++) {
                for (int j = 0; j <= i; j++) {
                  System.out.print("+");
                }
                System.out.print("\n");
              }

              scanner.close();
            }
          }
//21. Sprawdza czy palindrom
      import java.util.Scanner;

      public class Palindrom {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.print("Podaj słowo lub zdanie: ");
              String tekst = scanner.nextLine();

              // Usuń spacje i ustaw na małe litery (opcjonalnie)
              String czyste = tekst.replaceAll("\\s+", "").toLowerCase();

              // Odwróć ciąg
              String odwrocone = new StringBuilder(czyste).reverse().toString();

              // Sprawdź palindrom
              if (czyste.equals(odwrocone)) {
                  System.out.println("To jest palindrom.");
              } else {
                  System.out.println("To nie jest palindrom.");
              }

              scanner.close();
          }
      }

      //EWENRUALNIE

      public class Main {

          public static void main(String[] args) {
              String word = "Łukasz"; // tutaj wpisz słowo, które chcesz sprawdzić
              boolean isPalindrome = isPalindrome(word);

              if (isPalindrome) {
                  System.out.println("Słowo \"" + word + "\" jest palindromem.");
              } else {
                  System.out.println("Słowo \"" + word + "\" nie jest palindromem.");
              }
          }

          public static boolean isPalindrome(String word) {
              int left = 0;
              int right = word.length() - 1;

              while (left < right) {
                  if (word.charAt(left) != word.charAt(right)) {
                      return false;
                  }
                  left++;
                  right--;
              }

              return true;
          }
      }
//22. średnia wazona
      import java.util.Scanner;

      public class WeightedMeanCalculator {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.print("Ile elementów ma uwzględniać średnia ważona? ");
              int n = scanner.nextInt();

              double weightedSum = 0.0;
              double totalWeight = 0.0;

              System.out.println("Podaj wartość i wagę dla każdego elementu:");
              for (int i = 1; i <= n; i++) {
                  System.out.print("Wartość " + i + ": ");
                  double value = scanner.nextDouble();
                  System.out.print("Waga " + i + ": ");
                  double weight = scanner.nextDouble();

                  weightedSum += value * weight;
                  totalWeight += weight;
              }

              if (totalWeight == 0) {
                  System.out.println("Suma wag wynosi zero. Nie można obliczyć średniej ważonej.");
              } else {
                  double weightedMean = weightedSum / totalWeight;
                  System.out.println("Średnia ważona: " + weightedMean);
              }

              scanner.close();
          }
      }
//23. srednia arytmetyczna
      import java.util.Scanner;

      public class MeanCalculator {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.print("Ile liczb chcesz wprowadzić? ");
              int n = scanner.nextInt();

              double sum = 0.0;
              double product = 1.0;
              System.out.println("Podaj " + n + " liczb (większe od zera):");
              for (int i = 1; i <= n; i++) {
                  double value = scanner.nextDouble();
                  sum += value;
                  product *= value;
              }

              double arithmeticMean = sum / n;
              double geometricMean = Math.pow(product, 1.0 / n);

              System.out.println("Średnia arytmetyczna: " + arithmeticMean);
              System.out.println("Średnia geometryczna: " + geometricMean);
              scanner.close();
          }
      }
//24. Sumowanie elemntów podziedzilnych przez 5
      import java.util.Scanner;

      public class Main {
        public static void main(String[] args) {

          System.out.println("Podaj wielkośc tablicy");
          Scanner scanner = new Scanner(System.in);
          int wielkoscTablicy = scanner.nextInt();
          int[] tablica = new int[wielkoscTablicy];

          for (int i = 0 ; i < wielkoscTablicy ; i++){
            System.out.println("Podaj liczbę"+ i);
            tablica[i] = scanner.nextInt();

          }
          for ( int i = 0; i < wielkoscTablicy ; i++){
            if(tablica[i] % 5 == 0){
             suma = suma + tablica[i];

            }

          }
          System.out.println("Suma liczb podzielnych przez 5 to: " + suma);
        }


      }
    //25. Sprawdza czy równanie jest liniowe
      import java.util.Scanner;

      public class CheckLinearEquation {
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.println("Sprawdzanie równania liniowego ax + b = 0");

              // Wczytanie współczynników a i b
              System.out.print("Podaj współczynnik a: ");
              double a = scanner.nextDouble();
              System.out.print("Podaj współczynnik b: ");
              double b = scanner.nextDouble();

              // Sprawdzenie czy a != 0
              if (a != 0) {
                  double x = -b / a;
                  System.out.println("To jest równanie liniowe.");
                  System.out.println("Rozwiązanie: x = " + x);
              } else {
                  if (b == 0) {
                      System.out.println("Równanie jest tożsamościowe (nieskończenie wiele rozwiązań).");
                  } else {
                      System.out.println("To nie jest równanie liniowe (brak rozwiązań).");
                  }
              }

              scanner.close();
          }
      }
