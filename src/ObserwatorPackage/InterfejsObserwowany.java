package ObserwatorPackage;

public interface InterfejsObserwowany {

    void ustaw(double nowaWartosc);

    void dodajObserwatora(InterfejsObserwujacy obiektObserwatora);

    void usunObserwatora(InterfejsObserwujacy obiektObserwatora);

    void powiadomObserwatorow();
}
