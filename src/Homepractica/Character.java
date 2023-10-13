package Homepractica;

/**
 * переменные внутри класса называются полями!
 *
 * модификаторы доступа:
 * 1 - public - видимость внутри всего проекта;
 * 2 - protected - какое-либо поле, класс или метод будет доступен только внутри самого класса или
 * классов наследников.
 * 3 - private - закрытый (класс, поле, метод).
 *
 */


public class Character {
     public double strength, dexterity, intelligence, stamina, oratory;
     public String constitution;
     public byte[] coordinate;

     public void setValues (double _strength, double _dexterity, double _intelligence, double _stamina,
                            double _oratory, String _constitution, byte[] _coordinate) {
          strength = _strength;
          dexterity = _dexterity;
          intelligence = _intelligence;
          stamina = _stamina;
          oratory = _oratory;
          constitution = _constitution;
          coordinate = _coordinate;

     }
     public String getValues () {
          String info = "Hero strength - " + strength + " Hero dexterity - " + dexterity + " Hero intelligence - " + intelligence +
                  " Hero constitution - " + constitution + "\n";
          String infoForCoordinates = "Coordinates:\n";
          for (int i = 0; i < coordinate.length; i++){
               infoForCoordinates += coordinate[i] + "\n";

          }
          return info + infoForCoordinates;
     }



}

