package Generick;

public interface Gener <T extends Gener<T>> {
    T creat();
}
