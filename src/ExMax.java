/**
 * Created by Tiby on 22.10.2016.
 */
public class ExMax {
    public static void main(String[] args) {

        int max=0; // suma numerelor;
        int counter=0; // numar de cate ori citesc
        while(true) { //  interez la infinit
            counter++; // maresc cu 1 contorul;
            int nrCurent = SkeletonJava.readIntGUI("introduceti numarul" + counter +":");
            if (nrCurent<0) { // conditia de iesire din while
                break;
            }
            if(max<nrCurent)
                max=nrCurent;
        }

        SkeletonJava.printGUI("max este:" + max);
    }
}