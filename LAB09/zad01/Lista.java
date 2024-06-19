package LAB09.zad01;

public class Lista <E>{
    private E[] lista;
    private int aktualnyRozmiar;

    public Lista(int rozmiar){
        lista = (E[]) new Object[rozmiar];
        aktualnyRozmiar = 0;
    }

    public boolean dodaj(E element){
        if (aktualnyRozmiar >= lista.length) {
            return false;
        }
        lista[aktualnyRozmiar] = element;
        aktualnyRozmiar++;
        return true;
    }

    public boolean czyZawiera(E element){
        for (int i = 0; i < aktualnyRozmiar; i++) {
            if (lista[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int zwrocIndeks(E element){
        for (int i = 0; i < aktualnyRozmiar; i++) {
            if (lista[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int zwrocOstatniIndeks(E element){
        for (int i = aktualnyRozmiar - 1; i >= 0; i--) {
            if (lista[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public E zwrocElement(int indeks){
        if (indeks < 0 || indeks >= aktualnyRozmiar) {
            return null;
        }
        return lista[indeks];
    }

    public boolean podmienElement(int indeks, E element){
        if (indeks < 0 || indeks >= aktualnyRozmiar) {
            return false;
        }
        lista[indeks] = element;
        return true;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (E e : lista) {
            if (e != null) {
                buffer.append(e + ",");
            }
        }
        if (buffer.length()>1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static void main(String[] args) {
        Lista<String> listaString = new Lista<>(3);
        listaString.dodaj("test1");
        listaString.dodaj("test2");

        System.out.println(listaString.zwrocOstatniIndeks("test1"));
        System.out.println(listaString.zwrocElement(1));
        listaString.podmienElement(1, "test3");
        System.out.println(listaString.zwrocElement(1));

        System.out.println();

        Lista<Integer> listaInt = new Lista<>(5);
        listaInt.dodaj(1);
        listaInt.dodaj(2);
        listaInt.dodaj(3);
        listaInt.dodaj(1);

        System.out.println(listaInt.czyZawiera(3));
        System.out.println(listaInt.zwrocIndeks(1));
        System.out.println(listaInt.zwrocOstatniIndeks(1));
        System.out.println(listaInt.zwrocElement(2));

    }
}
