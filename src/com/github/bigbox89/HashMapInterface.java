package com.github.bigbox89;

public interface HashMapInterface {

    static int count = 0;
    int sizeCount = 0;
    int Size = 0;

    /* хэш-функция */
    int hash(int h);

    // возвращает номер по значению хэш-функции/
    int numIndex(int h);

    // Добавляет пару в множество
    public void put(int key, double value);

    // Проверяет наличие пары с ключем key
    public boolean isContainsKey(int key);

    //Возвращает значение
    public double get(int key);

    //Возвращает размер
    public int size();
}
