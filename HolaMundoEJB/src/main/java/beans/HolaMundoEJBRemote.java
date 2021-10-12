package beans;

//El anotation es para que se pueda llamar de forma remota

import javax.ejb.Remote;

@Remote
public interface HolaMundoEJBRemote {
    public int sumar(int a, int b);
}
