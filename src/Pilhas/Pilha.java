package Pilhas;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {
    private List<T> objetos = new LinkedList<T>();
    public void inserir(T t) {
        this.objetos.add(t);
    }

    public T remover() {
        return this.objetos.remove(this.objetos.size() - 1);
    }

    public boolean vazia() {
        return this.objetos.size() == 0;
    }

//    public String toString() {
//        StringBuilder build = new StringBuilder();
//        build.append("[\n");
//
//        for (int i = 0; i < objetos.size(); i++) {
//            build.append(objetos[i]);
//        }
//
//        return build;
//    }
}
