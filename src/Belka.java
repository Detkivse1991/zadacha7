public class Belka {
    void sayOnOreh(){
        System.out.println("белка: Ура,еще орех!" );}
    double sum(Oreshek[] orechki) {

        double result = 0;
        for (int i = 0; i < orechki.length; i++) {
            result = result + orechki[i].ves;
            System.out.println();sayOnOreh();}
        System.out.println();
        System.out.println("Белка: Всего я собрала + result+ грамм орешков");
        return result;}
        }

