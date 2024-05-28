package LAB06.zad01;

public enum Czas {
    DZIEN(1),
    MIESIAC(20),
    ROK(240);

    public int dni;

    Czas(int dni) {
        this.dni = dni; 
    }
}
