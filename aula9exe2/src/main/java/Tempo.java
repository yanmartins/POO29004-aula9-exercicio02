public class Tempo {

    private int horas;
    private int minutos;
    private int segundos;
    private int difTotal;
    private int segundosTotais;

    public Tempo() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public Tempo(int hora) {
        setHora(hora);
        minutos = 0;
        segundos = 0;
    }

    public Tempo(int hora, int minuto) {
        setHora(hora);
        setMinutos(minuto);
        segundos = 0;

    }

    public Tempo(int hora, int minuto, int segundo) {
        if(setHora(hora)){
            if(setMinutos(minuto)){
                setSegundos(segundo);
            }
        }

    }

    public boolean setHora(int a) {
        if(a > 23 || a < 0) {
            horas = 0;
            return false;
        }
        else {
            horas = a;
            return true;
        }
    }

    public boolean setMinutos(int a) {
        if(a > 59 || a < 0) {
            minutos = 0;
            horas = 0;
            return false;
        }
        else {
            minutos = a;
            return true;
        }
    }

    public boolean setSegundos(int a) {
        if(a > 59 || a < 0) {
            segundos = 0;
            minutos = 0;
            horas = 0;
            return false;
        }
        else {
            segundos = a;
            return true;
        }
    }

    public void setHorarioCompleto(int a, int b, int c) {
        setHora(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public long diferencaDeTempos(Tempo a) {
        difTotal += (segundos - a.segundos);
        difTotal += ((minutos * 60) - (a.minutos * 60));
        difTotal += ((horas * 3600) - (a.horas * 3600));
        return difTotal;
    }

    public long toSecond() {
        segundosTotais += (horas * 3600);
        segundosTotais += (minutos * 60);
        segundosTotais += segundos;

        return segundosTotais;
    }

    public String toString() {
        return horas + ":" + minutos + ":" + segundos;
    }
}