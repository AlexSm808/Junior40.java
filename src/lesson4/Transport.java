package lesson4;

public class Transport {
    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;
    // добавим в класс метод

    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

//    public String getValues() {
//
////    }
//}

    // public, protected, private - это модификаторы доступа
// в классах переменные называются полями
    // public - открытый, можно получить доступ из любого файла, класса
    // protected - какой-либо поле, класс или метод будут доступны внутри самого класса,
    // либо внутри классов наследников
    // private - закрытая функция/ переменная либо поле видны только внутри этого класса,
    //  а внутри любых других файлов доступ к ним будет закрыт

}

