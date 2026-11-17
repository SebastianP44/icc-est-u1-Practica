import java.util.ArrayList;
import java.util.List;

public class Ejercicios {
    
    private List<Estudiante> list0;
    public Ejercicios(List<Estudiante> list0) {
        this.list0 = list0;
    }

    public List<Estudiante> c1() {
        List<Estudiante> list = new ArrayList<>(list0);
        list.sort(null);
        return list;
    }
}