///**
// * Created by Tiby on 22.10.2016.
// */
//
//
//public class ExWhile {
//    public static void main(String[] args) {
//
//        int suma = 0; // suma numerelor;
//        int counter=0; // numar de cate ori citesc
//        while (true) { //  interez la infinit
//            counter++; // maresc cu 1 contorul;
//            int nrCurent = SkeletonJava.readIntGUI("introduceti numarul "+ counter +);
//            if (nrCurent < 0) { // conditia de iesire din while
//                counter--; // pt a nu considera la media acest ultim numar
//                break;
//            }
//            suma = suma + nrCurent; // suma este suma de dinainte plus numarul curent
//        }
//        double avg = suma/(double) counter; //media
//        SkeletonJava.printGUI("media este:" + avg);
//    }
//
