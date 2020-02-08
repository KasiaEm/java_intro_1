package com.sda.dates;

public enum Rhymes {
    JANUARY("Kiedy w styczniu lato, w lecie zimno za to."),
    FEBRUARY("Idzie luty, podkuj buty."),
    MARCH("W marcu jak w garncu."),
    APRIL("Kwiecień plecień, bo przeplata - trochę zimy, trochę lata."),
    MAY("W maju jak w raju."),
    JUNE("Pełnia czerwcowa - burza gotowa."),
    JULY("Kiedy lipiec daje deszcze, długie lato będzie jeszcze."),
    AUGUST("Kiedy sierpień wrzos rozwija - jesień krótka, szybko mija."),
    SEPTEMBER("Kiedy wrzesień, to już jesień, wtedy jabłek pełna kieszeń."),
    OCTOBER("Gdy październik ciepło trzyma, zwykle mroźna bywa zima."),
    NOVEMBER("W listopadzie goło w sadzie."),
    DECEMBER("Jeśli w grudniu często dmucha, w marcu, kwietniu będzie plucha.");

    private String textPl;

    Rhymes(String textPl) {
        this.textPl = textPl;
    }

    public String getTextPl() {
        return textPl;
    }
}
