public class Exercitii {
    public static void main(String[] args) {

        int max=SkeletonJava.readIntGUI("cate numere vrei");
        int suma=0;
        for(int i=0;i<=max;i++) {

            int val = i+1;
            int nrCurent = SkeletonJava.readIntGUI("introduceti numarul "+ val +": ");
            suma = suma + nrCurent;
        }

        double avg = suma/(double)max;
        SkeletonJava.printGUI("media este:" +avg);
    }
}
