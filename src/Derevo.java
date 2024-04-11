public class Derevo {
    Oreshek[] growUpOreshki(int kolvo) {
        Oreshek[] oreshki = new Oreshek[kolvo];
        for (int i = 0; i < oreshki.length; i++) {
            oreshki[i] = new Oreshek();
        }
        return oreshki;
    }
}
